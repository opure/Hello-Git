package jichu.shuzu;

public class YanZhengMa {
	public static void main(String args[]){
	    String str="1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    char[]chars=str.toCharArray();
	    int num1=0;
	    for(int i=0;i<4; i++){
		 num1=(int)(Math.random()*chars.length);
	      //System.out.println(num1);
	      String str1 = String.valueOf(chars[num1]);
	      System.out.print(str1);
	     }
		
	}
}


