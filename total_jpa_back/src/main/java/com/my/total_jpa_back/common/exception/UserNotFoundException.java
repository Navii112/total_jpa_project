package com.my.total_jpa_back.common.exception;

public class UserNotFoundException extends RuntimeException {

    // 1. 괄호를 비우고 쓸 때 작동하는 기본 에러 (지금 에러 난 부분 해결!)
    public UserNotFoundException() {
        super("해당 사용자를 찾을 수 없습니다.");
    }

    // 2. 괄호 안에 직접 메시지를 넣어서 쓸 때 작동하는 에러
    public UserNotFoundException(String message) {
        super(message);
    }
}