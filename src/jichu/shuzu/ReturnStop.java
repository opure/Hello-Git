
package jichu.shuzu;

public class ReturnStop {

	public static void main(String[] args) {
    System.out.println("������ʼ");
     fun(10);
     System.out.println("������");

	}

	public static void fun(int i) {
		// TODO Auto-generated method stub
		
		if(i==100){
			System.out.println("fun����");
			return;
	}
		else{
		System.out.println("����");
		}
		
	}

}
