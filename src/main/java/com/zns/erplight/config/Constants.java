package com.zns.erplight.config;

import java.net.URI;

public final class Constants {
	
    public static final String COMPANY_NAME = "ZNS";
    public static final String APP_NAME = "Order MS";
    
    public static final String DTO_NAME_MS = "OrderDTO";

    //	 URL Rest to invocate
    //    public static final String URL_MS_ORDER = "http://order-service/client/";

    public static final String  CLIENT_API_URL_BASE = "http://localhost:9090";
    public static final String  CLIENT_API_URL = "http://localhost:9090/api/clients/";

    // Regex for acceptable logins
    public static final String LOGIN_REGEX = "^(?>[a-zA-Z0-9!$&*+=?^_`{|}~.-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)|(?>[_.@A-Za-z0-9-]+)$";

    // ErrorConstants
    public static final String ERR_CONCURRENCY_FAILURE = "error.concurrencyFailure";
    public static final String ERR_VALIDATION = "error.validation";
    public static final String PROBLEM_BASE_URL = "https://www.abidi sinda.com/api/ms/problem";
    public static final URI DEFAULT_TYPE = URI.create(PROBLEM_BASE_URL + "/problem-with-message");
    public static final URI CONSTRAINT_VIOLATION_TYPE = URI.create(PROBLEM_BASE_URL + "/constraint-violation");

    
 
    private Constants() {
    }
}
