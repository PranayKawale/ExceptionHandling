package com.bridgelabz.ExceptionHandling;


public class CustomException extends Throwable
{
	public CustomException(String sms){
        super(sms);
    }

}