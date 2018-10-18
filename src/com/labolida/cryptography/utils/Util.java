package com.labolida.cryptography.utils;

/**
@Author Leonardo Labolida http://www.leonardo.labolida.com
**/

public class Util {
	
	/**
	 * Display
	 * Dump information 
	 * @param array of bytes
	 */
	public static void debug( byte b[] ) {
		System.out.println("---");
		System.out.println(" The string "+ new String(b)+" has " + b.length + " bytes = " + (b.length *8) + " bits" );
		for (int i=0; i<b.length; i++){
			System.out.print( " BYTE " + i + " is:Char:" + (char)b[i] + " is:ASCII:" + b[i] + " , bits: " );
			for (int f=128; f>0; f=f/2){  // bit representation
				if ( (b[i]&f)==f ) 
					System.out.print("1"); 
				else 
					System.out.print("0");
			}
			System.out.println();
		}
	}

	/**
	 * Display
	 * Dump information 
	 * @param array of bytes
	 */
	public static void printbyte( byte b ) {
		System.out.println( "" );
		for (int f=128; f>0; f=f/2){  // bit representation
			if ( (b&f)==f ) 
				System.out.print("1"); 
			else 
				System.out.print("0");
		}
		System.out.print( "   BYTE " + b + "   Char:" + (char)b + " "   );
	}
	
	/**
	 * messageValidation
	 * It Presents in a nice format the validation message 
	 */
	public static void messageValidation( String s1 , String s2 ) {
		if ( s1.equals(s2) ) 
			System.out.println("SUCCESS [OK]");
		else
			System.out.println("FAIL [ERROR]");
	}
	
	
}
