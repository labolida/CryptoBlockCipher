package com.labolida.cryptography.utils;

/*
	Easy example to understand bit operations in Java. 
*/
public class UnderstandingBitOperation {

	public static void main(String[] args) {

		byte a = 'A';
		Util.printbyte(a);
		
		byte b = 'B';
		Util.printbyte(b);

		
		
		// Understanding XOR 
		byte c = (byte) (a ^ b) ;  
		Util.printbyte(c);
		
		
		// Understanding SHIFT (1 position LEFT)
		byte z = (byte)(a<<1);
		Util.printbyte(z);
		
		
		// Understanding modulus
		int i = 512 % 256 ;
		System.out.println("\n Modulus:" + i);
		
	}

}
