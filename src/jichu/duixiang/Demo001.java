package jichu.duixiang;

class People{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public People(String name,int age){
		this.setAge(age);
		this.setName(name);
		
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
	public boolean compare(People per) {
		// TODO Auto-generated method stub
		People p1=this;
		People p2=per;
		if(p1==p2){
			return true;
			
		}
		if(p1.name.equals(p2.name)&&p1.age==p2.age)
		return true;
		else
		return false;
	}
	
}

public class Demo001 {
	public static void main(String args[]){
		People per1=new People("张三",18);
		People per2=new People("张三",18);
		if (per1.compare(per2)){
			System.out.println("两个对象相等");
		}
		else 
			System.out.println("两个对象不相等");
		}

}
