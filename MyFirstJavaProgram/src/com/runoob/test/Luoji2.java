package com.runoob.test;

public class Luoji2 {
	public static void main(String[] args){
		int a=5;
//�����ж� a<4 �Ľ��Ϊ false���� b �Ľ���ض��� false�����Բ���ִ�еڶ������� a++<10 ���жϣ����� a ��ֵΪ 5��
		boolean b=(a<4)&&(a++<10);
		System.out.println("ʹ�ö�·�߼�������Ľ��Ϊ"+b);
		System.out.println("a�Ľ��Ϊ"+a);
		
	}
}	
