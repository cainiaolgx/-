package com.lin.servicebase.exceptionHandler;

/**
 * @Description:
 * @Author: LGX
 * @Date: 2020/12/23 17:05
 */

import com.lin.commonutils.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 2
 * 统一异常处理类
 3
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.error();
    }
}