package com.common.sdk.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.common.sdk.services.ResponseHandler;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
@RequiredArgsConstructor
public class BaseGlobalExceptionHandler extends RuntimeException {

	private final ResponseHandler responseHandler;


}
