package jichu.shuzu;

public class ArrayExTest {

	public static void main(String args[]){
		int []a={1,3,4,6,66};
	    int min;
		int max=min=a[0];
		int sum=0;
		for (int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
				}
				if (a[i]<min){
					min=a[i];
					}
				 sum+=a[i];
        }
		
	int	avg=sum/a.length;
	System.out.println("ƽ��ֵ"+avg);
	System.out.println("���ֵ"+max);
	System.out.println("��Сֵ"+min);
	}
}
