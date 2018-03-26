
public class FreshJuiceTest {
	public static void main(String args[]){
		FreshJuice juice=new FreshJuice();
		juice.size=FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("Size:"+juice.size);
	}
	
}

class FreshJuice{
//	枚举了三个值
	enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
	FreshJuiceSize size;
	
}
