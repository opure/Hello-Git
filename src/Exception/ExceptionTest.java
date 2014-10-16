package Exception;

public class ExceptionTest {
	public static void yunsuan(int a,int b){
		try {
		int result=a /b;
		
		System.out.println(a+"/"+b+"="+result);
	}catch(ArithmeticException e){
		System.out.println("ÊäÈë´íÎó");
	}
		
	}
	public static void main(String args[]){
	yunsuan(1,2);
	yunsuan(1,2);
	yunsuan(2,0);
	yunsuan(2,1);
	yunsuan(1,0);
	}

}
