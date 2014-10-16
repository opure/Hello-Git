package jichu.shuzu;

public class MethodDemo02 {
	public static void main(String args[]){
		int one=addone(10,20);
		int two=addtwo(10,20);
		System.out.println(one);
		System.out.print(two);
			
	}

	public static int addone(int i, int j) {
		// TODO Auto-generated method stub
		int temp=i+j;
		
		return i+j;
	}

	public static int addtwo(int i, int j) {
		// TODO Auto-generated method stub
		int temp=i*j;
		
		return temp;
	}
}
