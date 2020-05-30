package com.hu.wangyi.entity;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/30 23:51
 * @description 封装结果集
 */
public class ResultVo extends Result {
    public boolean flag;

    public ResultVo() {
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "ResultVo{" +
                "flag=" + flag +
                '}';
    }
}
