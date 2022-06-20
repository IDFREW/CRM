package com.ex20.CRM.utils;

import java.util.UUID;

/**
 * @author RLN57
 */
public class UUIDUtil {
	
	public static String getUUID(){
		
		return UUID.randomUUID().toString().replaceAll("-","");
		
	}
	
}
