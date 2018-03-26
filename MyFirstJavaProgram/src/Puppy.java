
public class Puppy {
//	定义了一个整形变量puppyAge
	int puppyAge;
	
	public Puppy(){
		
	}
//	构造器
	public Puppy(String name){
//		写输出语句
		System.out.println("Passed Name is:"+name);
	}
	
//	传值
	public void setAge(int age){
		puppyAge=age;
	}
//	取值
	public int getAge(){
		System.out.println("Puppy's age is："+ puppyAge);
		return puppyAge;
	}
	
	
	
	public static void main(String []args){
//		对象创建
		Puppy myPuppy=new Puppy("tommy");
//		调用类方法设置年龄
		myPuppy.setAge(2);
//		调用另一个类方法来获取
		myPuppy.getAge();
//		访问实体变量
		System.out.println("Variable Value:" +myPuppy.puppyAge);
		
	}
	
	
	
}
