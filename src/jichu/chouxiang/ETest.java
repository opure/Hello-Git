package jichu.chouxiang;

public class ETest {
	public static void main(String args[]){
		Student s1=new Student("a",20,100);
		Student s2=new Student("a",20,100);
		if (s1==s2){
			System.out.println("相等");
		}
		if(s1!=s2){
			System.out.println("不相等");
			System.out.println(s1.toString());
		}
	}

}
