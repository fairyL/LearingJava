package com.runoob.test;


public class Test {
	//������һ��pupAge()����
	public void pupAge(){
		int age=0;			//age��һ���ֲ�����
		age=age+7;
		System.out.println("С���������ǣ�"+age);
	}
	
	public  static void main(String args[]){
		Test test=new Test();
		test.pupAge();
	}
}
