package com.common.sdk.models;

import com.common.sdk.models.interfaces.GenericApiResponse;

import lombok.Getter;
@Getter
public class APIResponse<R> implements GenericApiResponse<R>{

	
	private boolean success;
	private R data;
	private Integer code;
	private String errorMessage;
	private String requestId;
	
	private APIResponse(){}
	
}
