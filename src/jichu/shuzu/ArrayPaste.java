package jichu.shuzu;
public class ArrayPaste{
	public static void main(String args[]){
		System.out.print("不传递参数（fun()）：") ;
		fun() ;			// 不传递参数
		System.out.print("\n传递一个参数（fun(1)）：") ;
		fun(1) ;		// 传递一个参数
		System.out.print("\n传递五个参数（fun(1,2,3,4,5)）：") ;
		fun(1,2,3,4,5) ;
	}
	public static void fun(int ...arg){	// 可变参数
		for(int x:arg){		// 使用foreach输出输出
			System.out.print(x + "、") ;
		}
	}
};