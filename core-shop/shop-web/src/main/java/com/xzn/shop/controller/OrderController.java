package com.xzn.shop.controller;

import com.xzn.shop.entity.TOrder;
import com.xzn.shop.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {


    @Autowired
    private OrderMapper orderMapper;

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public String insert(){

        TOrder order = orderMapper.selectByUserId(1L);
        System.out.println(order);
        for (int i = 32; i < 46; i++) {
            TOrder tOrder = new TOrder();
            tOrder.setId(Long.valueOf(i));
            tOrder.setOrderNumber("dsadasfadasd");
            tOrder.setStatus(2);
            tOrder.setUserId(Long.valueOf(i));
            orderMapper.insert(tOrder);
        }
        return "OK";
    }

}
