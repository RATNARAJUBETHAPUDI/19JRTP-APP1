package in.ashokit.security.service;

import java.util.Base64;
import java.util.Base64.Encoder;

public class Passwordservice {

	public String encrypt(String text) {
	
	Encoder  encoder =Base64.getEncoder();
		
		String encodedString =encoder.encodeToString(text.getBytes());
		
	return encodedString;
	}
	
}
