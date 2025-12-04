package com.common.sdk.models.interfaces;

public interface GenericApiResponse<R> {
	
	boolean isSuccess();
	R getData();
	Integer getCode();
	String getErrorMessage();
	
}
