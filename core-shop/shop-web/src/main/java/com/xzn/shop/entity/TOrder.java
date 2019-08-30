package com.xzn.shop.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long userId;

    private String orderNumber;

    private Integer status;

}
