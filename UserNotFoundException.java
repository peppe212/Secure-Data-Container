package com.company;

public class UserNotFoundException extends Exception {

    UserNotFoundException(){
        super();
    }

    UserNotFoundException(String message){
        super(message);
    }
}
