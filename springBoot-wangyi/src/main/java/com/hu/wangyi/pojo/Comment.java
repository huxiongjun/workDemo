package com.hu.wangyi.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/30 22:10
 * @description 对应的评论
 */
public class Comment implements Serializable {
    private int id; // 主键id
    private String content; // 对应的评论
    private String source; // 歌名
    private Date saveTime; // 保存到数据库的时间
    private Date updateTime; // 数据库修改的时间

    public Comment(int id, String content, String source, Date saveTime, Date updateTime) {
        this.id = id;
        this.content = content;
        this.source = source;
        this.saveTime = saveTime;
        this.updateTime = updateTime;
    }

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", source='" + source + '\'' +
                ", saveTime=" + saveTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
