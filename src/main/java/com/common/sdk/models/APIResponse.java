package com.common.sdk.models;

import com.common.sdk.models.interfaces.GenericApiResponse;
import com.common.sdk.models.interfaces.ResponseCode;

import lombok.Getter;
@Getter
public class APIResponse<T> implements GenericApiResponse<T>{

	
	private boolean success;
	private T data;
	private Integer code;
	private String errorMessage;
	private String requestId;
	
	private APIResponse(){}
	
	public static <T>  APIResponse<T> success(T data ,ResponseCode responseCode,String requestId){
		APIResponse<T> response=new APIResponse<>();
		response.success=true;
		response.data=data;
		response.code=responseCode.getCode();
		response.requestId=requestId;
		return response;

	}
	
	public static <T>  APIResponse<T> success(ResponseCode responseCode,String requestId){
	return success(null,responseCode,requestId);
	}
	
	public static <T>  APIResponse<T> failure(int code,String message,String requestId){
		APIResponse<T> response=new APIResponse<>();
		response.success=false;
		response.errorMessage=message;
		response.code=code;
		response.requestId=requestId;
		return response;
	}
	public static <T>  APIResponse<T> failure(ResponseCode responseCode,String requestId){
	return failure(responseCode.getCode(),"EMPTY_STRING HAD TO CHANGE IT",requestId);
	}
	
	
	
}
