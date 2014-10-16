package jichu.shuzu;

public class ArrayCopy {
public static void main(String args[]){
	int[] hold={10,9,8,7,6,5,4,3,2,1};
	int []myArray={1,2,3,4,5,6};
	System.arraycopy(myArray,0,hold,0,myArray.length);
	for(int a:hold){
		System.out.print(a);
	}
}
}
