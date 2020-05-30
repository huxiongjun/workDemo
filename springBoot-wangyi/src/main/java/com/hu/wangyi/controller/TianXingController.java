package com.hu.wangyi.controller;

import com.hu.wangyi.entity.Result;
import com.hu.wangyi.pojo.Comment;
import com.hu.wangyi.service.TianXingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/30 19:00
 * @description 测试
 */
@RestController
@RequestMapping("/wangyi")
public class TianXingController {
    @Autowired
    private TianXingService tianXingService;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${TianXin.key}")
    private String key;
    @Value("${TianXin.wangyiurl}")
    private String url;

    /**
     * 测试
     */
    @GetMapping("/test")
    public Object test(){
        return "hello";
    }
    /**
     * 查询网易云音乐的评论,得到的是随机一个结果
     */
    @GetMapping("/comment")
    public Result findComment(){
        String param = url + "?key=" + key;
        Result resultEntity = restTemplate.getForObject(param, Result.class);
        System.out.println("查询到的结果是:"+resultEntity);
        return resultEntity;
    }
    /**
     * 保存网易云音乐的评论到数据库
     */
    @PutMapping(value="/save/{count}")
    public boolean saveComment(@PathVariable int count){
        String param = url + "?key=" + key; // 发送请求的url
        List<Comment> resultList = new ArrayList<>();
        long start = System.currentTimeMillis();
        if (count>=0){
            for (int i = 0; i < count; i++) {
                Result resultEntity = restTemplate.getForObject(param, Result.class);
                List<Comment> newslist = resultEntity.getNewslist();
                Comment comment = newslist.get(0); // 得到对应的评论内容
                // 调用方法,将评论内容存储到数据库中
                comment.setSaveTime(new Date());
                resultList.add(comment);
                // tianXingService.saveComment(comment); // 每次循环查询,频繁的创建/断开连接,效率很低
            }
            //System.out.println(resultList);
            tianXingService.saveCommentList(resultList);
        }
        long end = System.currentTimeMillis();
        System.out.println(start);
        return true;
    }
}
