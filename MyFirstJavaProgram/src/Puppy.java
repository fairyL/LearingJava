
public class Puppy {
//	������һ�����α���puppyAge
	int puppyAge;
	
	public Puppy(){
		
	}
//	������
	public Puppy(String name){
//		д������
		System.out.println("Passed Name is:"+name);
	}
	
//	��ֵ
	public void setAge(int age){
		puppyAge=age;
	}
//	ȡֵ
	public int getAge(){
		System.out.println("Puppy's age is��"+ puppyAge);
		return puppyAge;
	}
	
	
	
	public static void main(String []args){
//		���󴴽�
		Puppy myPuppy=new Puppy("tommy");
//		�����෽����������
		myPuppy.setAge(2);
//		������һ���෽������ȡ
		myPuppy.getAge();
//		����ʵ�����
		System.out.println("Variable Value:" +myPuppy.puppyAge);
		
	}
	
	
	
}
