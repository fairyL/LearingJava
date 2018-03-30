package ShuZu;

public class ArrayDemo05 {
	public static void main(String args[]){
		//定义了一个二维数组
		int score[][]=new int[5][5];
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
