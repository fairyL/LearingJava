import java.io.*;
public class Employee {
	//���ʵ��������������ɼ�
	public String name;
	int age;
	String designation;
	double salary;
//	Employee���캯��
	public Employee(String name){
		this.name=name;
	}
//	��empAge��ֵ����age
	public void empAge(int empAge){
		age=empAge;
	}
//	ָ����������empDesig
	public void empDesignation(String empDesig){
		designation=empDesig;
		
	}
//	ָ����������ΪempSalary
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
