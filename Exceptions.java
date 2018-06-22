package com.bbva.ecos.financialmanagementcompanies.business.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exceptions {
	

	public static void check(boolean condicion, String mensaje) throws Exception {
        if (condicion) {
            throw new Exception(mensaje);
        }
    }
	
	public static void check(boolean condition, RuntimeException exception) {
		if (condition) {
			throw exception;
		}
    }
	
	public static boolean allNotNull(Object... args){
	    List<Object> test = new ArrayList<Object>(Arrays.asList(args));
	    return test.contains(null); 
	}
	
	public static boolean allStringNotEmpty(String... args){
	    List<String> test = new ArrayList<String>(Arrays.asList(args));
	    for(String param : test){
	    	if(param == null || param.trim().length() == 0){
	    		return false;
	    	}
	    }	    
	    return true; 
	}
}
