package com.hu.wangyi.task;

import com.hu.wangyi.entity.Result;
import com.hu.wangyi.entity.ResultVo;
import com.hu.wangyi.pojo.Comment;
import com.hu.wangyi.service.TianXingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/31 0:07
 * @description 定时任务
 */
@Component
public class AddCommentTask {
    @Autowired
    private TianXingService tianXingService;
    @Autowired
    private RestTemplate restTemplate;

    @Value("${TianXin.key}")
    private String key;
    @Value("${TianXin.wangyiurl}")
    private String wangyiurl;

    // @Scheduled(cron = "0/5 * * * * ?")
    // @Async
    public void addComment() {
        int commentCount = tianXingService.findCommentCount();
        System.out.println("当前线程名字"+Thread.currentThread().getName());
        System.out.println("目前总共的评论数: "+commentCount);
        System.out.println("开始执行添加评论任务.....  " + new Date());
        String param = wangyiurl + "?key=" + key; // 发送请求的url
        List<Comment> resultList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Result resultEntity = restTemplate.getForObject(param, Result.class);
            List<Comment> newslist = resultEntity.getNewslist();
            Comment comment = newslist.get(0); // 得到对应的评论内容
            // 调用方法,将评论内容存储到数据库中
            comment.setSaveTime(new Date());
            resultList.add(comment);
        }
        tianXingService.saveCommentList(resultList);
        System.out.println("结束执行添加评论任务.....  " + new Date());
        System.out.println("====================================");
    }
}
