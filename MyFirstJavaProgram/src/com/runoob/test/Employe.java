package com.runoob.test;

public class Employe {

		public String name; 		//���ʵ������������ɼ�
		private double salary; 		//˽�б��������ڸ���ɼ�
		//�ڹ������ж�name��ֵ
		private Employe(String empName){
			name=empName;
		}
		//�趨salary��ֵ
		public void setSalary(double empSal){
			salary=empSal;
		}
		//��ӡ��Ϣ
		public void printEmp(){
			System.out.println("���֣�" +name);
			System.out.println("нˮ��" +salary);
	
		}
		
		public void main(String args[]){
			Employe empOne=new Employe("RUNOOB");
			empOne.setSalary(1000);
			empOne.printEmp();
		}
}
