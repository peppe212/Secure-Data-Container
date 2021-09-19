package com.company;

public class DataNotFoundException extends Exception {

    DataNotFoundException(){
        super();
    }

    DataNotFoundException(String message){
        super(message);
    }
}
