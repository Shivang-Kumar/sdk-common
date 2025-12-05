package com.common.sdk.utils;

import org.slf4j.MDC;

import com.common.sdk.constants.ApplicationConstants;

public class CommonUtils {

	private CommonUtils() {}
	
	public static String getCurrentRequestId()
	{
		return MDC.get(ApplicationConstants.CORRELATION_ID);
	}
}
