package jichu.shuzu;

public class MethodDemo03{
	public static void main(String args[]){
		int one = add(10,20) ;		// �������͵ļӷ�����
		float two = add(10.3f,13.3f) ;	// ���ø������ļӷ�����
		int three = add(10,20,30) ;	// ���������������ļӷ�����
		System.out.println("add(int x,int y)�ļ�������" + one) ;
		System.out.println("add(float x,float y)�ļ�������" + two) ;
		System.out.println("(int x,int y,int z)�ļ�������" + three) ;
	}
	// ���巽��������������ֵ���Ӳ�������������һ��int������
	public static int add(int x,int y){
		int temp = 0 ;			// �����еĲ������Ǿֲ�����
		temp = x + y ;			// ִ�мӷ�����
		return temp ;			// ���ؼ�����
	}
	public static int add(int x,int y,int z){
		int temp = 0 ;			// �����еĲ������Ǿֲ�����
		temp = x + y + z ;			// ִ�мӷ�����
		return temp ;			// ���ؼ�����
	}
	// ���巽��������������ֵ���Ӳ����������ķ���ֵ��һ��float������
	public static float add(float x,float y){
		float temp = 0 ;		// �����еĲ������Ǿֲ�����
		temp = x + y ;			// ִ�мӷ�����
		return temp ;			// ���ؼ�����
	}
};