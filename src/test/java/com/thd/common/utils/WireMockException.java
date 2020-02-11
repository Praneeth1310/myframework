package com.thd.common.utils;

@SuppressWarnings("serial")
public class WireMockException extends Exception {

    public WireMockException() {
    	// Default constructor
    }

    public WireMockException(String message) {
        super(message);
    }

    public WireMockException(Throwable cause) {
        super(cause);
    }

    public WireMockException(String message, Throwable cause) {
        super(message, cause);
    }

    public WireMockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}