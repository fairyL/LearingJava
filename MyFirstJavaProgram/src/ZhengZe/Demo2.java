package ZhengZe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
	public static void main(String args[]){
		String reg="[张李]";
		Pattern pattern=Pattern.compile(reg);
		String[] names={"张三","李四","王菲"};
		for(String name:names){
			Matcher matcher=pattern.matcher(name);
			System.out.println(name+"是否包含张或李："+matcher.find());
		}
	}
}
