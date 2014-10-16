package jichu.duixiang;

class Singleton{
	private static Singleton instance = new Singleton() ;	// ���ڲ����������ʵ��������
	public static Singleton getInstance(){		// ͨ����̬����ȡ��instance����
		return instance ;
	}
	private Singleton(){		// �����췽�������˷�װ��˽�л�	
	}
	public void print(){
		System.out.println("Hello World!!!") ;
	}
};
public class StaticTest02{
	public static void main(String args[]){
		Singleton s1 = null ;	// ��������
		Singleton s2 = null ;	// ��������
		Singleton s3 = null ;	// ��������
		s1 = Singleton.getInstance() ;	// ȡ��ʵ��������
		s2 = Singleton.getInstance() ;	// ȡ��ʵ��������
		s3 = Singleton.getInstance() ;	// ȡ��ʵ��������
		s1.print() ;		// ���÷���
		s2.print() ;		// ���÷���
		s3.print() ;		// ���÷���
	}
};