package ZhengZe;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
	public static void main(String args[]){
		String reg="^[0-9]{6}$";	
		//������^[0-9]{6}$��������ʽ��^�ǿ�ʼ��$�ǽ�����־��{6}��ʾ����Ϊ6�����֣�[0-9]��ʾ���֡�
		Scanner in=new Scanner(System.in);
		while(true){
			
			Pattern pattern=Pattern.compile(reg);
			System.out.println("������һ���ʱࣨ-1��ʾ��������");
			String temp=in.nextLine();
			if(temp.equals("-1")){
				System.out.println("Bye");
				break;
			}
			Matcher matcher=pattern.matcher(temp);
			if(matcher.find()){
				System.out.println("���������ʽ��ȷ��");
			}else{
				System.out.println("����Ĳ���һ���Ϸ����������룡");
			}
			
		}
	}
}
