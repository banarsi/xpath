package com.test;

import org.testng.annotations.Test;

import com.pom.Login;

import generic.Basetest;

public class Logintest extends Basetest


{
@Test()
public void login_test()
{
	Login login=new Login(driver);
	System.out.print(driver.getTitle());
	
	
	login.verify(prop.getProperty("title"));
	login.ring();
	login.gold_options();
}
}
