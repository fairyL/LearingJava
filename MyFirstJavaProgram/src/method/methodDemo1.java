package method;

//�����main�����Ǳ�jvm���õġ�
public class methodDemo1 {
//	������
	public static void main(String[] args){
		int i=5;
		int j=2;
		int k=max(i,j);
		System.out.println(i+"��"+j+"�Ƚϣ����ֵ��:"+k);
	}
	//�����������ͱ������ݵĽϴ�ֵ
	public static int max(int num1,int num2){
		int result;
		if(num1>num2)
			result=num1;
		else
			result=num2;
		return result;
	}
}
