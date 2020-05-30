package com.hu.wangyi.service;

import com.hu.wangyi.pojo.Comment;

import java.util.List;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/30 22:27
 * @description 接口
 */
public interface TianXingService {

    void saveComment(Comment comment);

    void saveCommentList(List<Comment> resultList);
}
