package com.runoob.test;

public class selfAddMinus2 {
	public  static void main(String[] args){
		int a=5;
		int b=5;
		int x=2*++a;
		int y=2*b++;
		//a=6 x=2*6=12
		System.out.println("自增运算符前缀运算后a="+a+",x="+x);
		//y=2*5=10  b=6
		System.out.println("自增运算符后缀运算后b="+b+",y="+y);	//
		
	}
}
