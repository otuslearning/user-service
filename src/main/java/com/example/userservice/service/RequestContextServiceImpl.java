package com.example.userservice.service;

import com.example.userservice.api.RequestContextDto;
import com.example.userservice.api.RequestContextService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.userservice.util.HttpUtils.REQUEST_ATTRIBUTE_CONTEXT;

@Service
@RequiredArgsConstructor
public class RequestContextServiceImpl implements RequestContextService {
    private final HttpServletRequest request;

    @Override
    public RequestContextDto getRequestContext() {
        return (RequestContextDto) request.getAttribute(REQUEST_ATTRIBUTE_CONTEXT);
    }
}
