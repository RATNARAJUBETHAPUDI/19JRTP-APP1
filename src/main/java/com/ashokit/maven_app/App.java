package com.ashokit.maven_app;

import in.ashokit.security.service.passwordservice;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
passwordservice service = new passwordservice();    	
    	String encrypt = service.encrypt("ashokit123");
    	System.out.println(encrypt);
    	
    
    	
    			
    }
}
