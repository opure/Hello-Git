package jichu.shuzu;

public class MethodReturnArray {
	public static void main(String args[]){
		 int temp[]=fun();//方法实例化数组
		 print(temp);
	}

public static void print(int[] temp) {
		// TODO Auto-generated method stub
   for(int x:temp){
	  System.out.println(x);
}
		
	}

	public static int[] fun() {
		// TODO Auto-generated method stub
		
		int aa[]={1,2,3,4};
		return aa;
	}

}
