package com.runoob.test;

public class Logger {
	private String format;		//format����Ϊ˽�б���
	
	//Ϊ��ʹ�������ܹ�����format������������public������getFormat(����format��ֵ)��setFormat(����format��ֵ)��
	public String getFormat(){
		return this.format;
	}
	public void setFormat(String format){
		this.format=format;
	}
}
