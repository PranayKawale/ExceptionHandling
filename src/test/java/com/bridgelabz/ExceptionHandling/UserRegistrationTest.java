package com.bridgelabz.ExceptionHandling;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class UserRegistrationTest 
{

    UserRegistrationException user = new UserRegistrationException();
    @Test
    public void firstName(){
        String fName = "Pranay";
        boolean chek = user.firstName(fName);
        assertTrue( chek);
    }

    @Test
    public void lastName(){
        String lName = "Kawale";
        boolean chek = user.lastName(lName);
        assertTrue( chek);
    }

    @Test
    public void email(){
        String eMail = "abc.xyz@bl.co.in";
        boolean chek = user.eMail(eMail);
        assertTrue( chek);
    }

    @Test
    public void mobileNum(){
        String mobile = "91 8806617335";
        boolean chek = user.mobileNum(mobile);
        assertTrue( chek);
    }

    @Test
    public void passWordRule1(){
        String pass = "Pranay";
        boolean chek = user.pass1(pass);
        assertTrue( chek);
    }

    @Test
    public void passWordRule2(){
        String pass = "Pranay";
        boolean chek = user.pass2(pass);
        assertTrue( chek);
    }


    @Test
    public void passWordRule3(){
        String pass = "Pranay1";
        boolean chek = user.pass3(pass);
        assertTrue( chek);
    }

    @Test
    public void passWordRule4(){
        String pass = "Pranay1@";
        boolean chek = user.pass4(pass);
        assertTrue( chek);
    }
}



