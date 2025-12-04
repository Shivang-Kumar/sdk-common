 package com.common.sdk.models.enums;

import com.common.sdk.models.interfaces.ResponseCode;

import lombok.Getter;

@Getter
public enum NotificationResponseCode implements ResponseCode {
	
	
	NOTIFICATION_ERROR(1001,"Notification Template Not found");	
	
	private final int code;
	private final String message;
	

	NotificationResponseCode(int code, String message) {		
		this.code=code;
		this.message=message;
	}

}
