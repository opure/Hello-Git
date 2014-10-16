package jichu.shuzu;

public class Work6 {
	public static void main(String args[]){
		int sum = 0;
        for (int i =1; i<=100; i++)
        {
            if (i%2== 1)
            {  
            	sum += i;   
            	}
        }
	 System.out.println("1-100之间奇数之和为" + sum);
    }
   }
