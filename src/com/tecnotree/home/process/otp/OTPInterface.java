package com.tecnotree.home.process.otp;

public interface OTPInterface {

	public String generate(String secret);
	
	public boolean verify(String otp);
	
	public String read();
	
	
}
