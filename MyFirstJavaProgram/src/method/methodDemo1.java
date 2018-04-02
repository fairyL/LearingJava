package method;

//这里的main方法是被jvm调用的。
public class methodDemo1 {
//	主方法
	public static void main(String[] args){
		int i=5;
		int j=2;
		int k=max(i,j);
		System.out.println(i+"和"+j+"比较，最大值是:"+k);
	}
	//返回两个整型变量数据的较大值
	public static int max(int num1,int num2){
		int result;
		if(num1>num2)
			result=num1;
		else
			result=num2;
		return result;
	}
}
