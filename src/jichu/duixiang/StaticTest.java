package jichu.duixiang;

class Demo011{	// ����Person��
	private String name ;			// ��������
	private static int count = 0 ;	// ���ж����������
	public Demo011(){
		count++ ;					// �ж������������
		this.name = "DEMO-" + count ;	// �Զ����б�������
	} 
	public Demo011(String name){
	
		this.name = name;			// ����ͨ�����츳ֵ
	}
	public String getName(){		// ȡ������
		return this.name ;
	}
};
public class StaticTest{
	public static void main(String args[]){
		System.out.println(new Demo011().getName()) ;
		System.out.println(new Demo011("LXH").getName()) ;
		System.out.println(new Demo011().getName()) ;
		System.out.println(new Demo011("MLDN").getName()) ;
		System.out.println(new Demo011().getName()) ;
	}
};