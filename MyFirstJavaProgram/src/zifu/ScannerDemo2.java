package zifu;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[]  args ){
		Scanner scan=new Scanner(System.in);
		//�Ӽ��̽�������
		int i=0;
		float f=0.0f;
		System.out.print("����������");
		if(scan.hasNextInt()){
			//�ж�������Ƿ�������
			i=scan.nextInt();
			//��������
			System.out.println("�������ݣ�"+i);
		}else{
			//����������Ϣ
			System.out.println("����Ĳ���������");
		}
		System.out.print("����С����");
		if(scan.hasNextFloat()){
			//�ж�������Ƿ���С��
			f=scan.nextFloat();
			//����С��
			System.out.println("С�����ݣ�"+f);
			
		}else{
			//���������Ϣ
			System.out.println("����Ĳ���С����");
			
		}
		scan.close();
	}
}
