package jichu.duixiang;
class Outer{		// �����ⲿ��
	private String info = "hello world" ;	// �����ⲿ���˽������
	public void fun(){						// �����ⲿ��ķ���
		new Inner(this).print() ;				// ͨ���ڲ����ʵ����������÷���
	}
	public String getInfo(){				// ������һ��getter����ȡ��info����
		return this.info ;	
	}
};
class Inner{	// �����ڲ���
	private Outer out = null ;				// ����Outer����
	public Inner(Outer out){
		this.out = out ;
	}
	public void print(){				// �����ڲ���ķ���
		System.out.println(this.out.getInfo()) ;		// ֱ�ӷ����ⲿ���˽������
	}
};
public class InnerClassDemo01{
	public static void main(String args[]){
		new Outer().fun() ;					// �����ⲿ���fun()����
	}
};