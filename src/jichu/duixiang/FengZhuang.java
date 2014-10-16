package jichu.duixiang;


class Person01{
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
		if (age>0)
		this.age = age;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	private int age;
	private String school;
	public String getSchool() {
		return school;
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("姓名："+name+"，年龄："+age+"，学校："+school);
	
	}

}

public class FengZhuang {
	public static void main(String args[]){
  Person01  per=new Person01();
   per.setAge(20);
   per.setName("caohao");
   per.setSchool("zzuli");
   per.print();
   
		
	}


}
