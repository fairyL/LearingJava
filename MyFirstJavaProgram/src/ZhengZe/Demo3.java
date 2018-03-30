package ZhengZe;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {
	public static void main(String args[]){
		String reg="[\\d]";
		Pattern pattern=Pattern.compile(reg);
		String[] strs={"abc","ab2","12ab","33"};
		for(String str:strs){
			Matcher matcher=pattern.matcher(str);
			System.out.println(str+"ÊÇ·ñ°üº¬Êý×Ö£º"+matcher.find());
		}
		
	}
}
