package ZhengZe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {
	public static void main(String[] args){
		String reg="����|�ƺ�$";
		Pattern pattern=Pattern.compile(reg);
		String[] strs={"�γ���","�Իƺ�","��ʤ","������","κ����"};
		for(String str:strs){
			Matcher matcher=pattern.matcher(str);
			System.out.println(str+"�г������߻ƺӣ�"+matcher.find());
			
		}
		
	}
}
