package com.runoob.test;

public class Employe {

		public String name; 		//这个实例变量对子类可见
		private double salary; 		//私有变量，仅在该类可见
		//在构造器中对name赋值
		private Employe(String empName){
			name=empName;
		}
		//设定salary的值
		public void setSalary(double empSal){
			salary=empSal;
		}
		//打印信息
		public void printEmp(){
			System.out.println("名字：" +name);
			System.out.println("薪水：" +salary);
	
		}
		
		public void main(String args[]){
			Employe empOne=new Employe("RUNOOB");
			empOne.setSalary(1000);
			empOne.printEmp();
		}
}
