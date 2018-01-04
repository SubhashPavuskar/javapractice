package com.tecnotree.home.process.otp;

public class CallGenerateOTP
{

	public static void main(String[] args)
	{
		String secret = Base32.random();
        OTPInterface otpSer = new HotpService();
        OTPContext context = new OTPContext(otpSer);
        String otp = context.generate(secret);
        
        String cutString4 = null;
        String cutString6 = null;
        String cutString = null;
        
        cutString = otp;
        cutString4 = otp.substring(0, 4);
        cutString6 = otp.substring(0, 6);
        
        
        System.out.println("OTP Is 4 ::"+cutString4);
        System.out.println("OTP Is 6 ::"+cutString6);
        System.out.println("OTP Is   ::"+cutString);
	}

}
