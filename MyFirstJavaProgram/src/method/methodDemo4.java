package method;

public class methodDemo4 {
	public static void main(String[] args){
		int num1=1;
		int num2=2;
		System.out.println("����ǰnum1��ֵΪ��"+num1+"��num2��ֵΪ��"+num2);
		
//		���÷���
		swap(num1,num2);
//		ʵ��û�з����ı�
		System.out.println("������num1��ֵΪ��"+num1+",num2��ֵΪ��"+num2);
		
	}
	
//	�������������ķ���
	public static void swap(int n1,int n2){
		System.out.println("\t����swap����");
		System.out.println("\t\t����ǰn1��ֵΪ��"+n1+",n2��ֵ��"+n2);
		
		//����n1��n2��ֵ
		int temp=n1;
		n1=n2;
		n2=temp;
//		�βα仯��
		System.out.println("\t\t������n1��ֵΪ"+n1+",n2��ֵΪ��"+n2);
	}
}
