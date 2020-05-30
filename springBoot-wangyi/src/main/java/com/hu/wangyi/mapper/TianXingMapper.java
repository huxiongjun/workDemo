package com.hu.wangyi.mapper;

import com.hu.wangyi.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/30 22:30
 * @description mapper
 */
@Repository
public interface TianXingMapper {
    void saveComment(Comment comment);

    void saveCommentList(List<Comment> resultList);
}
