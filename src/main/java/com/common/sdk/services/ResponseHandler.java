package com.common.sdk.services;

import com.common.sdk.models.APIResponse;

import com.common.sdk.models.enums.APIResponseCode;
import com.common.sdk.models.interfaces.GenericApiResponse;
import com.common.sdk.models.interfaces.ResponseCode;
import com.common.sdk.utils.CommonUtils;
import org.springframework.stereotype.Component;



@Component
public class ResponseHandler {
	
	public <T> GenericApiResponse<T> ok(T data)
	{
		return APIResponse.success(data, APIResponseCode.SUCCESS,CommonUtils.getCurrentRequestId());
	}
	
	public <T> GenericApiResponse<T> ok()
	{
		return APIResponse.success(APIResponseCode.SUCCESS,CommonUtils.getCurrentRequestId());
	}
	
	public <T> GenericApiResponse<T> ok(T data,ResponseCode responseCode)
	{
		return APIResponse.success(data,responseCode,CommonUtils.getCurrentRequestId());
	}
	
	public GenericApiResponse<Void> ok(ResponseCode responseCode)
	{
		return APIResponse.success(responseCode,CommonUtils.getCurrentRequestId());
	}
	
	public GenericApiResponse<Void> failure(ResponseCode responseCode)
	{
		return APIResponse.failure(responseCode,CommonUtils.getCurrentRequestId());
	}
	public GenericApiResponse<Void> failure(int code,String message)
	{
		return APIResponse.failure(code,message,CommonUtils.getCurrentRequestId());
	}
	public GenericApiResponse<Void> failure(ResponseCode  responseCode,String message)
	{
		return APIResponse.failure(responseCode.getCode(),message,CommonUtils.getCurrentRequestId());
	}

}
