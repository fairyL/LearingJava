package Inherit;

public class Animal{
	private String name;
	private int id;
	public Animal(String myName,int myid){
		//��ʼ������ֵ
		name=myName;
		id=myid;
		
	}
	public void eat(){
		//�Զ��������ľ���ʵ��
		System.out.println(name+"���ڳ�");
		
	}
	public void sleep(){
		//˯�������ľ���ʵ��
		System.out.println(name+"����˯");
	}
	public void introduction(){
		System.out.println("��Һã�����"      +id+"��"+name+".");
		
	}
	public class Penguin extends Animal{
		public Penguin(String myName,int myid){
			super(myName,myid);
		}
	}
	public class Mouse extends Animal{
		public Mouse(String myName,int myid){
			super(myName,myid);
		}
	} 
}

