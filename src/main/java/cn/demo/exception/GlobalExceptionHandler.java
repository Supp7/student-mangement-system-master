package cn.demo.exception;

import cn.demo.base.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**功能描述：统一异常处理类*/
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(BadRequestException.class)
    @ResponseBody
    public BaseResult error(BadRequestException e){
        e.printStackTrace();
        log.error(ThrowableUtil.getStackTrace(e));
        return BaseResult.fail(e.getMessage(),e.getStatus());
    }
}
