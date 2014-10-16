package jichu.duixiang;

public class String01{
	public static void main(String args[]){
		String str1 = "LiXingHua" ;		// 声明字符串对象
		for(int i=0;i<100;i++){			// 循环修改内容
			str1 += i ;					// 字符串的引用不断改变
		}
		System.out.println(str1) ;
	}
};