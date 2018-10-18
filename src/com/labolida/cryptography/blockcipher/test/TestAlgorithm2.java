package com.labolida.cryptography.blockcipher.test;

import com.labolida.cryptography.blockcipher.Algorithm2FeistelBlockCipher128bits;
import com.labolida.cryptography.utils.Util;

public class TestAlgorithm2 {

	private final static String PLAIN_TEXT = "LEONARDOLABOLIDA"; 
	private final static String PASSWORD = "BzX3Gy6O";
	
	public static void main(String[] args) {
		
		// Plain Text - The message to be encoded. 8bytes * 8bits = 64bits
		byte s[] = new String(PLAIN_TEXT).getBytes();
		Util.debug(s);
		
		// The secret key or password. 4bytes * 8bits = 32bits
		byte k[] = new String(PASSWORD).getBytes();
		Util.debug(k);
		
		
		Algorithm2FeistelBlockCipher128bits algorithm = new Algorithm2FeistelBlockCipher128bits();
		
		s = algorithm.encode(s,k);     Util.debug(s);   // round 1
		s = algorithm.encode(s,k);     Util.debug(s);   // round 2
		s = algorithm.encode(s,k);     Util.debug(s);   // round 3
		
		
		// VALIDATION
		Util.messageValidation( new String(s), PLAIN_TEXT);
		
	}

}
