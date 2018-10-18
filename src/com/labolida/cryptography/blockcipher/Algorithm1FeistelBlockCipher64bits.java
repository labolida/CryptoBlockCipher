package com.labolida.cryptography.blockcipher;

/**
	@Author Leonardo Labolida http://www.leonardo.labolida.com
**/
public class Algorithm1FeistelBlockCipher64bits {

	public byte[] encode( byte s[] , byte k[] ) {  // 's' = 8 bytes 64 bits
		for (int i=0; i<4; i++){                   // 4 bytes = 32 bits - 4 Iterations
			byte x1 = (byte) (s[i]^k[i]);          // XOR LEFT+K
			//x1 = (byte)(x1^1);                   // Function f  (OPTIONAL)
			byte x2 = (byte) (x1^s[i+4])  ;        // XOR R+RIGHT
			s[i] = x2;                             // L=xRight 
			s[i+4]=x1;                             // R=xLeft
		}
		return s;
	}
	
}
