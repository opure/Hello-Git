package jichu.shuzu;

public class ArrayDemo01{
	public static void main(String args[]){
		int score[] = null ;			// ��������
		score = new int[3] ;			// Ϊ���鿪�ٿռ䣬��СΪ3
		System.out.println("score[0] = " + score[0]) ;
		System.out.println("score[1] = " + score[1]) ;
		System.out.println("score[2] = " + score[2]) ;
		for(int a:score){
			System.out.println(a);
		}
	}
	
}