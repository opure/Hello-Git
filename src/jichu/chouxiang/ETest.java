package jichu.chouxiang;

public class ETest {
	public static void main(String args[]){
		Student s1=new Student("a",20,100);
		Student s2=new Student("a",20,100);
		if (s1==s2){
			System.out.println("���");
		}
		if(s1!=s2){
			System.out.println("�����");
			System.out.println(s1.toString());
		}
	}

}
