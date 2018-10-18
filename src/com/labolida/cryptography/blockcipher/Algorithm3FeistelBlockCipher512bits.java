package com.labolida.cryptography.blockcipher;

/**
	@Author Leonardo Labolida http://www.leonardo.labolida.com
**/
public class Algorithm3FeistelBlockCipher512bits {

	public byte[] encode( byte s[] , byte k[] ) {  // 's' = 64 bytes 512 bits
		for (int i=0; i<32; i++){                   // 32 bytes = 128 bits
			byte x1 = (byte) (s[i]^k[i]);          // XOR LEFT+K
			byte x2 = (byte) (x1^s[i+32])  ;        // XOR R+RIGHT
			s[i] = x2;                             // L=xRight 
			s[i+32]=x1;                             // R=xLeft
		}
		return s;
	}
	
}
