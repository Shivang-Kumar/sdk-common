package com.common.sdk.exception;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class BaseException extends RuntimeException {

	private final int statusCode;

	public BaseException(String message, int statusCode) {
		super(message);
		this.statusCode = statusCode;
	}
}
