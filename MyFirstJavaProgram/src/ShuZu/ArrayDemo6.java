package ShuZu;

public class ArrayDemo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组静态初始化
		int score[][]={{100,90},{67,70},{50,78,80}};
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
