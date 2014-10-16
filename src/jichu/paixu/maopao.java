package jichu.paixu;

public class maopao {
	public static void main(String args[]){
		int a[] = {67,89,87,69,90,100,75,90};
	    for (int i=0;i<a.length-1;i++){
	    	for (int j=i+1;j<a.length;j++){
	    		if(a[i]>a[j]){
	    			int temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    			}
	    	}
	    	}
		for(int i:a){
			System.out.print(+i+"\t");
		}
	}

}
