package ZhengZe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
	public static void main(String args[]){
		String reg="[����]";
		Pattern pattern=Pattern.compile(reg);
		String[] names={"����","����","����"};
		for(String name:names){
			Matcher matcher=pattern.matcher(name);
			System.out.println(name+"�Ƿ�����Ż��"+matcher.find());
		}
	}
}
