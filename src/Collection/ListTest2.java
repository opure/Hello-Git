package Collection;

import java.util.ArrayList;
  class Student {
             String name;
              int age;
         public Student(String name, int age) {
           this.name = name;
            this.age = age;
      }
          public String toString() {
               return name + "/" + age;
               }
         }
         public class ListTest2 {
public static void main(String[] args) {
    ArrayList list = new ArrayList();
 
     for (int i = 0; i < 3; i++) {
    Student stu = new Student("Tom" , 10);
    stu.age = 10 + i;
    list.add(stu);
   }
   System.out.println(list);
  }
}