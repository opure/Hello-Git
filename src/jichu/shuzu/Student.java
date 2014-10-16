package jichu.shuzu;

public class Student{
    String name;
    int age;
    boolean gender=true;
    int stu_no;
   
   public void eat(){
System.out.println("eat");
}
public void sleep(){
System.out.println("sleep¡£¡£¡£");
    }
public void study(){
System.out.println("study...");

}
public static void main(String args[]){
 Student a=new Student();
a.name="ÐÀµ°";
a.age=30;
a.gender="true" != null;
a.stu_no=0000011100;
a.eat();
a.sleep();
a.study();
}

}