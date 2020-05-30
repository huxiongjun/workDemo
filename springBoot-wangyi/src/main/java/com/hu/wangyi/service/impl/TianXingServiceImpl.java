package com.hu.wangyi.service.impl;

import com.hu.wangyi.mapper.TianXingMapper;
import com.hu.wangyi.pojo.Comment;
import com.hu.wangyi.service.TianXingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/30 22:29
 * @description 实现类
 */
@Service
public class TianXingServiceImpl implements TianXingService {
    @Autowired
    private TianXingMapper tianXingMapper;

    @Override
    public void saveComment(Comment comment) {
        tianXingMapper.saveComment(comment);
    }

    @Override
    public void saveCommentList(List<Comment> resultList) {
        tianXingMapper.saveCommentList(resultList);
    }
}
