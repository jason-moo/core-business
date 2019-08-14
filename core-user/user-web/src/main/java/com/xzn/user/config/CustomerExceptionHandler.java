package com.xzn.user.config;

import com.xzn.core.handler.GlobalExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(basePackages = "com.xzn.user.controller")
@ResponseBody
public class CustomerExceptionHandler extends GlobalExceptionHandler {


}
