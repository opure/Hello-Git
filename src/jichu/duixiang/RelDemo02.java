
package jichu.duixiang;

class Demo{
	String temp = "hello" ;		// �˴�Ϊ�˷��㣬������ʱ����װ
};
public class RelDemo02{
	public static void main(String args[]){
		Demo d1 = new Demo() ;	// ʵ����Demo����ʵ����֮�������temp=30 
		d1.temp = "world" ;		// �޸�temp���Ե�����
		System.out.println("fun()��������֮ǰ��" + d1.temp) ;
		fun(d1) ;
		System.out.println("fun()��������֮��" + d1.temp) ;
	}
	public static void fun(Demo d2){		// �˴��ķ�����������ֱ�ӵ���
		d2.temp = "MLDN";						// �޸�tempֵ
	}
};