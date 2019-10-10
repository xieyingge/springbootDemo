package com.example.demo;

import com.example.demo.entity.Result;
import com.example.demo.enun.CodeMessage;
import com.example.demo.exception.BusinessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import static com.example.demo.entity.Result.toResult;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     *  拦截Exception类的异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result exceptionHandler(Exception e){
        e.printStackTrace();

        //正常开发中，可创建一个统一响应实体，如CommonResp
        return toResult(CodeMessage.SERVER_ERROR, e.getMessage());
    }


    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Map<String,Object> businessExceptionHandler(HttpServletRequest req, Exception e){
        Map<String,Object> result = new HashMap<>();
        result.put("respCode", "777777777");
        result.put("respMsg", e.getMessage());
        e.printStackTrace();
        return result;
    }


}
