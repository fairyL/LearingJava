import java.io.*;
public class Employee {
	//这个实例变量仅对子类可见
	public String name;
	int age;
	String designation;
	double salary;
//	Employee构造函数
	public Employee(String name){
		this.name=name;
	}
//	把empAge的值赋给age
	public void empAge(int empAge){
		age=empAge;
	}
//	指定变量名称empDesig
	public void empDesignation(String empDesig){
		designation=empDesig;
		
	}
//	指定变量名称为empSalary
	public void empSalary(double empSalary){
		salary=empSalary;
	}
	
	public void printEmployee(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);
	}
	
}
