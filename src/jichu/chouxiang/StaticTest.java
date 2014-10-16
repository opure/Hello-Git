package jichu.chouxiang;

public class StaticTest {
	String name;
	static int count;
	public static void main(String args[]){
		StaticTest s1=new StaticTest();
		StaticTest s2=new StaticTest();
		s1.name="zhangsan";
		s1.count++;
		System.out.println(s2.name);
		System.out.println(s2.count);
		s2.count++;
		System.out.println(s1.count);
	}

}
