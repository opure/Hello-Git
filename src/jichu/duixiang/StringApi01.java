package jichu.duixiang;

public class StringApi01{
	public static void main(String args[]){
		String str1 = "hello" ;			// �����ַ���
		char c[] = str1.toCharArray() ;	// ��һ���ַ�����Ϊ�ַ�����
		for(int i=0;i<c.length;i++){	// ѭ�����
			System.out.print(c[i] + "��") ; 
		}
		System.out.println("") ;		// ����
		String str2 = new String(c) ;	// ��ȫ�����ַ������ΪString
		String str3 = new String(c,0,3) ;	// �������ַ������ΪString
		System.out.println(str2) ;		// ����ַ���
		System.out.println(str3) ;		// ����ַ���
	}
};