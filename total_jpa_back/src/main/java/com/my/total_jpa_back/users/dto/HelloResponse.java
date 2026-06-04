package com.my.total_jpa_back.users.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder // 컨트롤러에서 .builder()를 쓰기 위해 반드시 필요합니다.
public class HelloResponse {
    private String message;
    private int age;
}