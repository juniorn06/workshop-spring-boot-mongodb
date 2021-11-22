package com.example.worskshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 4183948679967083214L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
