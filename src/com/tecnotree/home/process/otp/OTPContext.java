package com.tecnotree.home.process.otp;

public class OTPContext implements OTPInterface {

	private OTPInterface otpInterface;
	public OTPContext(OTPInterface otpInterface){
		this.otpInterface = otpInterface;
	}
	@Override
	public String generate(String secret) {
		// TODO Auto-generated method stub
		return otpInterface.generate(secret);
	}

	@Override
	public boolean verify(String otp) {
		// TODO Auto-generated method stub
		return otpInterface.verify(otp);
	}
	@Override
	public String read() {
		// TODO Auto-generated method stub
		return otpInterface.read();
	}

}
