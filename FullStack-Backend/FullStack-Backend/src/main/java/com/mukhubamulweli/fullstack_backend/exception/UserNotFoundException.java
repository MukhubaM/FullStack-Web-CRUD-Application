package com.mukhubamulweli.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id){
        super("COULD NOT FIND THE USER WITH ID: " + id);
    }
}
