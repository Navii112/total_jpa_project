package com.my.total_jpa_back.users.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloRequest {
    private String name;
    private int age; // 기존 Object보다 명확한 int(또는 Integer) 타입 사용을 권장합니다.
}