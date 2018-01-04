package com.tecnotree.home.process.otp;

public class HotpService implements OTPInterface,java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Hotp otpRef = null;
	private long interval;
	@Override
	
	public String generate(String secret) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		otpRef = new Hotp(secret,counter);
		String otpGenerated =otpRef.now();
		interval = counter.getCurrentTick();
		return otpGenerated ;
	}

	@Override
	public boolean verify(String otp) {
		// TODO Auto-generated method stub
		return otpRef.verify(otp);
	}

	@Override
	public String read() {
		// TODO Auto-generated method stub
		return otpRef.read(interval);
	}

}
