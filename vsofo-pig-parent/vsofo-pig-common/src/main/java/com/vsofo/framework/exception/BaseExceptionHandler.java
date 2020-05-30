package com.vsofo.framework.exception;

import com.vsofo.entity.Result;
import com.vsofo.entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/12 17:28
 * @description 公共异常处理类
 */
@ControllerAdvice
public class BaseExceptionHandler {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result error(Exception exception) {
        exception.printStackTrace();
        return new Result(false, StatusCode.ERROR, exception.getMessage());
    }
}
