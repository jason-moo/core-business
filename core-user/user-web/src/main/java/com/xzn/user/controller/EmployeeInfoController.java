package com.xzn.user.controller;


import com.xzn.user.service.EmployeeInfoEsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 员工基本信息 前端控制器
 * </p>
 *
 * @author xuezn
 * @since 2019-08-14
 */
@Controller
@RequestMapping("/user/employee")
public class EmployeeInfoController {


    @Autowired
    private EmployeeInfoEsService employeeInfoEsService;


    @RequestMapping(value = "/bulk",method = RequestMethod.GET)
    @ResponseBody
    public String bulk(){
        employeeInfoEsService.bulk();
        return "OK";
    }

}
