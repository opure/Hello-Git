package jichu.chouxiang;
interface Fruit{	// ����һ��ˮ���ӿ�
	public void eat() ;	// ��ˮ��
}
class Apple implements Fruit{
	public void eat(){
		System.out.println("** ��ƻ����") ;
	}
};
class Orange implements Fruit{
	public void eat(){
		System.out.println("** �����ӡ�") ;
	}
};
class Factory{	// ���幤����
	public static Fruit getInstance(String className){
		Fruit f = null ;
		if("apple".equals(className)){	// �ж��Ƿ�Ҫ����ƻ��������
			f = new Apple() ;
		}
		if("orange".equals(className)){	// �ж��Ƿ�Ҫ�������ӵ�����
			f = new Orange() ;
		}
		return f ;
	}
};
public class InterfaceDemo003{
	public static void main(String args[]){
		Fruit f = Factory.getInstance("apple");
		if(f!=null){   // ʵ�����ӿ�
		f.eat() ;
		}
	}
};