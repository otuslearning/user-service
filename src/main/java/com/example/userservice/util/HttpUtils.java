package com.example.userservice.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class HttpUtils {
    public static final String HEADER_ACCOUNT_ID = "X-Account-Id";
    public static final String REQUEST_ATTRIBUTE_CONTEXT = "requestContext";
}
