
package jichu.shuzu;
public class ArrayDemo03{
	public static void main(String args[]){
		int score[][] = {
			{67,61},{78,89,83},{99,100,98,66,95}
		} ;// ��̬��ʼ����ɣ�ÿ�е�����Ԫ�ظ�����һ��1		
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j] + "\t") ;
			}
			System.out.println("") ;
		}
	}
};