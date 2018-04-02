package method;

public class VarargsDemo {
	public static void main(String  args[]){
		//调用可变参数的方法
		printMax(34,3,3,2,56.5);
		printMax(new double[]{1,2,3});
	}
	
	public static void printMax(double... numbers){
//		这里的if条件用来判断数组里面的数字是否等于0
		if(numbers.length==0){
			System.out.println("No argument passed");
			return;
		}
//		在这里分别调用两次printMax参数
		double result=numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i]>result){
				result=numbers[i];
			}
		}
		System.out.println("The max value is"+result);
	}
}
