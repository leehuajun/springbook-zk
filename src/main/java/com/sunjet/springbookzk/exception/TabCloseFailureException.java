package com.sunjet.springbookzk.exception;

@SuppressWarnings("serial")
public class TabCloseFailureException extends RuntimeException {
    public TabCloseFailureException(String errorMsg) {
        super(errorMsg);
    }
}