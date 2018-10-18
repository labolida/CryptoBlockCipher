package com.labolida.cryptography.blockcipher.test;

import com.labolida.cryptography.blockcipher.Algorithm1FeistelBlockCipher64bits;
import com.labolida.cryptography.utils.Util;

public class TestAlgorithm1 {

	private final static String PLAIN_TEXT = "LEONARDO"; 
	private final static String PASSWORD = "BzX3";
	
	public static void main(String[] args) {
		
		// Plain Text - The message to be encoded. 8bytes * 8bits = 64bits
		byte s[] = new String(PLAIN_TEXT).getBytes();
		Util.debug(s);
		
		// The secret key or password. 4bytes * 8bits = 32bits
		byte k[] = new String(PASSWORD).getBytes();
		Util.debug(k);
		
		
		Algorithm1FeistelBlockCipher64bits algorithm = new Algorithm1FeistelBlockCipher64bits();
		
		s = algorithm.encode(s,k);     Util.debug(s);   // First round
		
		s = algorithm.encode(s,k);     Util.debug(s);   // Second round 
		
		s = algorithm.encode(s,k);     Util.debug(s);   // Third round
		
		
		// VALIDATION
		Util.messageValidation( new String(s), PLAIN_TEXT);
		
	}

}
