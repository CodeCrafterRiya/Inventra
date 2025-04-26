package com.riya.InventoryMgtSys.exceptions;

public class NameValueRequiredException extends RuntimeException {
    public NameValueRequiredException(String message){
        super(message);
    }
}
