package com.example.EMA.model;

import javax.persistence.Entity;


public class SMS{

    private String message;
    private String phoneNumber;

    public SMS(){

    }

    public SMS(String message, String phoneNumber){
        this.message = message;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
