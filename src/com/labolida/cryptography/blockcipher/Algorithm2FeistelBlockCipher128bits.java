package com.labolida.cryptography.blockcipher;

/**
	@Author Leonardo Labolida http://www.leonardo.labolida.com
**/
public class Algorithm2FeistelBlockCipher128bits {

	public byte[] encode( byte s[] , byte k[] ) {  // 's' = 16 bytes 128 bits
		for (int i=0; i<8; i++){                   // 8 bytes = 64 bits - 8 Iterations
			byte x1 = (byte) (s[i]^k[i]);          // XOR LEFT+K
			//x1 = (byte)(x1^1);                   // Function f  (OPTIONAL)
			byte x2 = (byte) (x1^s[i+8])  ;        // XOR R+RIGHT
			s[i] = x2;                             // L=xRight 
			s[i+8]=x1;                             // R=xLeft
		}
		return s;
	}
	
}
