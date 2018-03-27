package com.runoob.test;

public class wei {
	public static void main(String[] args){
		int a=60;	// 0011 1100
		int b=13;	// 0000 1101
		int c=0;	// 0000 0000
		c=a&b;		// 0000 1100
		System.out.println("a&b="+c);
		c=a|b;		// 0011 1101
		System.out.println("a|b="+c);
		c=a^b;		// 0011 0011
		System.out.println("a^b="+c);
		c=~a;		// 1100 0011
		System.out.println("~a="+c);
		c=a<<2;		//240
		System.out.println("a<<2="+c);
		c=a>>2;		//15
		System.out.println("a>>2="+c);
		c=a>>>2;	//15
		System.out.println("a>>>="+c);
		
	}
}
