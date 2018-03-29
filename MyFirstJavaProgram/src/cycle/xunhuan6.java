package cycle;

public class xunhuan6 {
	public static void main(String args[]){
		int[] numbers={10,20,30,40,50};
		for(int x:numbers){
			//x等于30时跳出循环，不执行
			if(x==30){
				continue;
			}
			System.out.println(x);
			System.out.println("\n");
			
		}
	}
}
