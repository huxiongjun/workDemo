package com.hu.wangyi.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/31 1:11
 * @description 实体类
 */
public class Sentence implements Serializable {
    private int id; // 主键id
    private String dialogue; // 台词
    private String english; // 英语
    private String source; // 电影名字
    private int type; // 类型
    private Date saveTime; // 保存到数据库的时间
    private Date updateTime; // 数据库修改的时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDialogue() {
        return dialogue;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
        return "Sentence{" +
                "id=" + id +
                ", dialogue='" + dialogue + '\'' +
                ", english='" + english + '\'' +
                ", source='" + source + '\'' +
                ", type=" + type +
                ", saveTime=" + saveTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
