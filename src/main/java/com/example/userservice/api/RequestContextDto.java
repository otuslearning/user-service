package com.example.userservice.api;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RequestContextDto  {
    private String accountId;
}
