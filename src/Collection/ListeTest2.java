package Collection;

import java.util.ArrayList;
class Student2 {
String name;
int age;
public Student2(String name, int age) {
this.name = name;
this.age = age;
}
 public boolean equals(Object obj) {
if (obj == null) 
	return false;
if (!(obj instanceof Student)) 
	   return false;
Student stu = (Student) obj; 
return stu.name.equals(this.name) && stu.age == this.age;
}
}
public class ListeTest2{
public static void main(String[] args) {
     ArrayList list = new ArrayList();
     list.add(new Student2("Tom" , 11));
     list.add(new Student2("Jerry" , 22));
     list.add(new Student2("Alice" , 33));
     System.out.println(list.contains(new Student2("Tom" , 11)));
     System.out.println(list.indexOf(new Student2("Jerry" , 22)));
     System.out.println(list.remove(new Student2("Alice" , 33))?"成功":"无此项");
}
}