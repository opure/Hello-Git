package jichu.shuzu;

public class Test {
  public static void main(String[] args) {
	  int[] a={44,33,22,5,87,6,45};
	  for(int i=0;i<a.length;i++){
		  for(int j=i+1;j<a.length;j++){
		   if(a[i]>a[j]){
			   int temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
			   System.out.println(a[i]);
			   System.out.println("nihao");
			   System.out.println(a[j]);
			  }
  }
	  }

  for(int i=0;i<a.length;i++){
	  System.out.print(a[i]+ "\t");
  }
	  
  }
  }
  
