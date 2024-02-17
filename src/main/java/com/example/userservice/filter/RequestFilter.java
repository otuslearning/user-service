package com.example.userservice.filter;

import com.example.userservice.api.RequestContextDto;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

import static com.example.userservice.util.HttpUtils.HEADER_ACCOUNT_ID;
import static com.example.userservice.util.HttpUtils.REQUEST_ATTRIBUTE_CONTEXT;

@Component
public class RequestFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        RequestContextDto requestContext= RequestContextDto.builder()
                .accountId(request.getHeader(HEADER_ACCOUNT_ID))
                .build();
        request.setAttribute(REQUEST_ATTRIBUTE_CONTEXT, requestContext);
        filterChain.doFilter(request, response);
    }
}
