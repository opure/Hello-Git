package jichu.duixiang;

public class RefDemo01{
	public static void main(String args[]){
		String str1 = "hello" ;			// ʵ�����ַ�������
		System.out.println("fun()��������֮ǰ��" + str1) ;
		fun(str1) ;						// ����fun()����
		System.out.println("fun()��������֮��" + str1) ;
	}
	public static void fun(String str2){		// �˴��ķ�����������ֱ�ӵ���
		str2 = "MLDN" ;					// �޸��ַ�������
	}
};