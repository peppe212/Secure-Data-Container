// GIUSEPPE MUSCHETTA, matricola 564026, corso A, prof. Ferrari

package com.company;

public class ExistingUserException extends Exception {

    public  ExistingUserException(){
        super();
    }

    public ExistingUserException(String message){
        super(message);
    }
}
