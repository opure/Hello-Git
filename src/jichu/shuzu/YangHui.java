package jichu.shuzu;

public class YangHui{
	
public static void main(String args[]){
/*	  int [][]yanghui_array=new int[10][];
	  for(int l=0;l<=yanghui_array.length;l++){
		  yanghui_array[l]=new int[l+1];
		  for(int n=0;n<yanghui_array.length;n++){
			  if(n==0||yanghui_array.length-1){
				  yanghui_array[l][n]=1;
			  }
			  else 
			  {
				  yanghui_array[l][n]=yanghui[l-1][n]+yanghui[l-1][n-1];
			  }
			  }
			 
		  }
		  
	  }
}


	
	  */
     int i,j;
         int a[][]=new int[10][10];
         for(i=0;i<10;i++){
        	 a[i][i]=1;
        	 a[i][0]=1;
        	 }
         for(i=2;i<10;i++)
        	 for(j=1;j<=i-1;j++)
        		 a[i][j]=a[i-1][j-1]+a[i-1][j];
         for(int m=0;m<10;m++){
        	 for(int n=10;n>i;n--){
        	 System.out.print("");
        	 }
        	 for(int k=0;k<m+1;k++){
        	 System.out.print("a[i][j]");
        	 }
        	 System.out.println();
        	 }
        	 }
        	 
    
        /*	 
         for(i=0;i<10;i++)
         {
        	 for(j=0;j<=i;j++)
        		 System.out.println(a[i][j]);
        	 System.out.println("");
 
        	 
         }*/
         
}

