package com.test;

import org.testng.annotations.Test;

import com.pom.Login;

import generic.Basetest;

public class Logintest extends Basetest


{
@Test()
public void login_test() throws InterruptedException
{
	Login login=new Login(driver);
	System.out.print(driver.getTitle());
	
	
	login.verify(prop.getProperty("title"));
	login.ring();
	Thread.sleep(2000);
	login.gold_options();
}
}
