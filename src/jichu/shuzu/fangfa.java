package jichu.shuzu;

public class fangfa{
	public static void main(String args[]){
		printInfo() ;		// ����printInfo()����
		printInfo() ;		// ����printInfo()����
		printInfo() ;	
		printInfo();// ����printInfo()����
		System.out.println("Hello World!!!") ;
	}
	public static void printInfo(){
		char c[] = {'H','e','l','l',
			'o',',','L','X','H'} ;	// �����ַ�����
		for(int x=0;x<c.length;x++){	// ѭ�����
			System.out.print(c[x]) ; 
		}
		System.out.println("") ;	// ����
	}
};