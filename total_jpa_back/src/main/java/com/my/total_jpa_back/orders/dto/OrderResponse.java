package com.my.total_jpa_back.orders.dto;

import com.my.total_jpa_back.common.entity.OrderStatus;
import lombok.Getter;

@Getter
public class OrderResponse {
    private Long orderId;
    private String productName;
    private Integer price;
    private OrderStatus status;
    private String userName;
    private String userEmail;

    // Hibernate가 찾고 있는 바로 그 생성자입니다. (순서: Long, String, Integer, OrderStatus, String, String)
    public OrderResponse(Long orderId, String productName, Integer price, OrderStatus status, String userName, String userEmail) {
        this.orderId = orderId;
        this.productName = productName;
        this.price = price;
        this.status = status;
        this.userName = userName;
        this.userEmail = userEmail;
    }
}