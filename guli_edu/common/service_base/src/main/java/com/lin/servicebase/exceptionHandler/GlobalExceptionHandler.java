package com.lin.servicebase.exceptionHandler;

/**
 * @Description:
 * @Author: LGX
 * @Date: 2020/12/23 17:05
 */

import com.lin.commonutils.Result;
import com.lin.servicebase.utils.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 2
 * 统一异常处理类
 3
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){

        log.error(ExceptionUtil.getMessage(e));
        log.error(e.getMessage());
        e.printStackTrace();
        return Result.error();
    }
}