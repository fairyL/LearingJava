package ZhengZe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {
	public static void main(String[] args){
		String reg="长江|黄河$";
		Pattern pattern=Pattern.compile(reg);
		String[] strs={"宋长江","赵黄河","黄胜","刘长河","魏长江"};
		for(String str:strs){
			Matcher matcher=pattern.matcher(str);
			System.out.println(str+"叫长江或者黄河："+matcher.find());
			
		}
		
	}
}
