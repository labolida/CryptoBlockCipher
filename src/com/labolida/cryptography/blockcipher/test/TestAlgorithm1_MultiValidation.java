package com.labolida.cryptography.blockcipher.test;

import java.util.Random;

import com.labolida.cryptography.blockcipher.Algorithm1FeistelBlockCipher64bits;
import com.labolida.cryptography.utils.Util;

public class TestAlgorithm1_MultiValidation {

	private static Random rand = new Random(); 
	
	public static void main(String[] args) {
		
		for ( int test=0; test<5500; test++) {
		
			// It creates a plain text
			byte t[] = new byte[8];
			byte s[] = new byte[8];
			for (int i=0; i<8; i++) {
				byte b=(byte)rand.nextInt(255);
				t[i]=b;
				s[i]=b;
			}
			Util.debug(t);
			//Util.debug(s);
			
			
			// It creates a KeyPassword
			byte k[] = new byte[4];
			for (int i=0; i<4; i++) {
				k[i]=(byte)rand.nextInt(255);
			}
			//Util.debug(k);
			
			
			Algorithm1FeistelBlockCipher64bits algorithm = new Algorithm1FeistelBlockCipher64bits();
			
			s = algorithm.encode(s,k);     //Util.debug(s);   // First round
			
			s = algorithm.encode(s,k);     //Util.debug(s);   // Second round 
			
			s = algorithm.encode(s,k);     //Util.debug(s);   // Third round
			
			
			// VALIDATION
			Util.messageValidation( new String(s), new String(t) );
		}
		
	}

}
