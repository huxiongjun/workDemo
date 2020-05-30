package com.hu.wangyi.entity;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/30 19:38
 * @description 单个城市结果
 */
public class SingleResult {

    private String content;
    private String source;

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

    public SingleResult() {
    }

    public SingleResult(String content, String source) {
        this.content = content;
        this.source = source;
    }

    @Override
    public String toString() {
        return "SingleResult{" +
                "content='" + content + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
