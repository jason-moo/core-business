package com.xzn.shop.config;

import com.xzn.core.handler.GlobalExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(basePackages = "com.xzn.shop.controller")
@ResponseBody
public class CustomerExceptionHandler extends GlobalExceptionHandler {


}
