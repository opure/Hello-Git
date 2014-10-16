package jichu.chouxiang;

public class StudentTest {
       private String name;
       public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public void show(){
		System.out.println("Student name:"+name+"age:"+age+"mark:"+mark);
	}
	private int age;
       private int  mark;
       public  StudentTest(String name,int age,int mark){
    	   this.name=name;
    	   this.age=age;
    	   this.mark=mark;
    	   
       }
       public String toString(){
    	   
    	   return "Student name:"+name+"age:"+age+"mark:"+mark;
    	   
       }
}
