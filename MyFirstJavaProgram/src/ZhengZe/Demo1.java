package ZhengZe;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
	public static void main(String args[]){
		String reg="^[0-9]{6}$";	
		//在这里^[0-9]{6}$是正则表达式，^是开始，$是结束标志。{6}表示长度为6的数字，[0-9]表示数字。
		Scanner in=new Scanner(System.in);
		while(true){
			
			Pattern pattern=Pattern.compile(reg);
			System.out.println("请输入一个邮编（-1表示结束）：");
			String temp=in.nextLine();
			if(temp.equals("-1")){
				System.out.println("Bye");
				break;
			}
			Matcher matcher=pattern.matcher(temp);
			if(matcher.find()){
				System.out.println("邮政编码格式正确！");
			}else{
				System.out.println("输入的不是一个合法的邮政编码！");
			}
			
		}
	}
}
