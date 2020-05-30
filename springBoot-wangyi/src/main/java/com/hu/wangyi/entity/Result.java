package com.hu.wangyi.entity;

import com.hu.wangyi.pojo.Comment;

import java.io.Serializable;
import java.util.List;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/30 19:34
 * @description 封装结果集
 */
public class Result implements Serializable {
    private String code;
    private String msg;
    private List<Comment> newslist;

    public Result(String code, String msg, List<Comment> newslist) {
        this.code = code;
        this.msg = msg;
        this.newslist = newslist;
    }

    public Result() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Comment> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<Comment> newslist) {
        this.newslist = newslist;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", newslist=" + newslist +
                '}';
    }
}
