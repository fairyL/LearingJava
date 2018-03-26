package com.runoob.test;


public class Test {
	//定义了一个pupAge()方法
	public void pupAge(){
		int age=0;			//age是一个局部变量
		age=age+7;
		System.out.println("小狗的年龄是："+age);
	}
	
	public  static void main(String args[]){
		Test test=new Test();
		test.pupAge();
	}
}
