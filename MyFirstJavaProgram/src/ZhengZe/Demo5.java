package ZhengZe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo5 {
	public static void main(String[] args){
		String reg="\\d";
		Pattern pattern=Pattern.compile(reg);
		String str="122222";
		Matcher matcher=pattern.matcher(str);
		while(matcher.find()){
			System.out.printf("ƥ���ַ�����%s,��%d��ʼ����%d����\n",matcher.group(),matcher.start(),matcher.end());
			
		}
	}
}
