package jichu.duixiang;

class Outer1{		// �����ⲿ��
	private static String info = "hello world" ;	// �����ⲿ���˽������
	static class Inner{	// �����ڲ���
		public void print(){				// �����ڲ���ķ���
			System.out.println(info) ;		// ֱ�ӷ����ⲿ���˽������
		}
	};
	public void fun(){						// �����ⲿ��ķ���
		new Inner().print() ;				// ͨ���ڲ����ʵ����������÷���
	}
};
public class InnerClassDemo02{
	public static void main(String args[]){
	new Outer1().fun()	;//		new Outer1.Inner().print() ;	//		// �����ⲿ���fun()����
	}
};