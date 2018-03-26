package com.runoob.test;

public class Logger {
	private String format;		//format定义为私有变量
	
	//为了使其他类能够操作format，定义了两个public方法：getFormat(返回format的值)和setFormat(设置format的值)。
	public String getFormat(){
		return this.format;
	}
	public void setFormat(String format){
		this.format=format;
	}
}
