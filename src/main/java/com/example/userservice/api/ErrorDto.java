package com.example.userservice.api;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorDto {
    private Integer code;
    private String message;
}
