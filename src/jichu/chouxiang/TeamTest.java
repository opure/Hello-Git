package jichu.chouxiang;

public class TeamTest {
	public static void main(String args[]){
		StudentTest s1=new StudentTest("a",20,100);
		StudentTest s2=new StudentTest("b",21,103);
		StudentTest s3=new StudentTest("c",23,104);
		StudentTest s4=new StudentTest("d",24,140);
		Team t=new Team();
		t.addStudentTest(s1);
		t.addStudentTest(s2);
		t.addStudentTest(s3);
		t.addStudentTest(s4);
		t.getMaxOrMin(new AgeComparator()).show();
		t.getMaxOrMin(new MarkComparator()).show();
		
	}

}
class AgeComparator extends Comparator{
	public int compare(StudentTest s1,StudentTest s2){
		return s1.getAge()-s2.getAge();
	}
}
class MarkComparator extends Comparator{
	public int compare(StudentTest s1,StudentTest s2){
		return s1.getMark()-s2.getMark();
	}
}





