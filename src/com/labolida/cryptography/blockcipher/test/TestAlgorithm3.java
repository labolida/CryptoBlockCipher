package com.labolida.cryptography.blockcipher.test;

import com.labolida.cryptography.blockcipher.Algorithm3FeistelBlockCipher512bits;
import com.labolida.cryptography.utils.Util;

public class TestAlgorithm3 {
	//                                        _______|_______|_______|_______|_______|_______|_______|_______|
	//                                        1234567812345678123456781234567812345678123456781234567812345678
	private final static String PLAIN_TEXT = "This is my secret message. Please don't tell anybody about this.";   // 64 bytes = 512 bits
	private final static String PASSWORD   = "fRgThYjUkIl@po%Uy&bVF/DsDFT65Gn?";                                   // 32 bytes = 256 bits
	
	public static void main(String[] args) {
		

		byte s[] = new String(PLAIN_TEXT).getBytes();
		Util.debug(s);

		byte k[] = new String(PASSWORD).getBytes();
		Util.debug(k);
		
		Algorithm3FeistelBlockCipher512bits algorithm = new Algorithm3FeistelBlockCipher512bits();
		
		s = algorithm.encode(s,k);     Util.debug(s);   // round 1
		s = algorithm.encode(s,k);     Util.debug(s);   // round 2
		s = algorithm.encode(s,k);     Util.debug(s);   // round 3

		
		
		// VALIDATION
		Util.messageValidation( new String(s), PLAIN_TEXT);
		
	}

}
