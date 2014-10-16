
package jichu.shuzu;

public class ReturnStop {

	public static void main(String[] args) {
    System.out.println("方法开始");
     fun(10);
     System.out.println("第三部");

	}

	public static void fun(int i) {
		// TODO Auto-generated method stub
		
		if(i==100){
			System.out.println("fun方法");
			return;
	}
		else{
		System.out.println("结束");
		}
		
	}

}
