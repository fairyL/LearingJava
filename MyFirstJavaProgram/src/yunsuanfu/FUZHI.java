package yunsuanfu;


public class FUZHI {
	public void main(String[] args){
		int a=10;
		int b=20;
		int c=0;
		c=a+b;
		System.out.println("c=a+b+"+c);	//30
		c+=a;
		System.out.println("c+=a="+c);	//40
		c-=a;
		System.out.println("c-=a="+c);	//30
		c*=a;
		System.out.println("c*=a="+c); 	//300
		a=10;
		c=15;
		c/=a;
		System.out.println("c/=a="+c);	//1
		a=10;
		c=15;
		c%=a;
		System.out.println("c%=a="+c);	//5
		c<<=2;
		System.out.println("c<<=2="+c);	//20
		c>>=2;
		System.out.println("c>>=a="+c);	//5
		c&=a;
		System.out.println("c&=2="+c);	//10
		c|=a;
		System.out.println("c|=a="+c);	//10
		
		
		
		
	}
}
