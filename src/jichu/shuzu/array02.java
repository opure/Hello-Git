package jichu.shuzu;

public class array02{
	public static void main(String args[]){
		int score[][] = new int[4][3] ;			// ������ʵ������ά����
		score[0][1] = 30 ;						// Ϊ�����е����ݸ�ֵ
		score[1][0] = 31 ;						// Ϊ�����е����ݸ�ֵ
		score[2][2] = 32 ;						// Ϊ�����е����ݸ�ֵ
		score[3][1] = 33 ;						// Ϊ�����е����ݸ�ֵ
		score[1][1] = 30 ;						// Ϊ�����е����ݸ�ֵ
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j] + "\t") ;
			}
			System.out.println("") ;
		}
	}
};