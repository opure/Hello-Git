package Collection;


import java.util.HashMap;
import java.util.Scanner;
public class Map {
public static void main(String[] args) {
HashMap map = new HashMap();
Scanner scanner = new Scanner(System.in);
for (int i = 0; i < 2; i++) {  
System.out.println("请输入身份证号：");
String id = scanner.next();
System.out.println("请输入姓名：");
String name = scanner.next();
map.put(id, name);  
}
int size = map.size(); 
System.out.println("数据输入完毕！共" + size
+ "条数据！\n---------------------------------");
String answer = "no";
do {
System.out.println("请输入你要查找的用户的身份证号：");
String id = scanner.next();
if (map.containsKey(id))
{ 
       String name = (String) map.get(id); 
       System.out.println("您查找的用户姓名为：" + name);
} 
else {
System.out.println("您查找的用户不存在！");
}
System.out.println("您还要继续查找吗？(yes/no)");
answer = scanner.next();
} 
     while ("yes".equalsIgnoreCase(answer));
         System.out.println("请输入要删除的用户的身份证号：");
         String id = scanner.next();
          if (map.containsKey(id)) {
             String name = (String) map.remove(id); 
          System.out.println("用户" + name + "删除成功！");
} 
           else {
          System.out.println("您要删除的用户不存在！");
        }
     System.out.println("要格式化系统吗？(yes/no)");
         String format = scanner.next();
    if ("yes".equalsIgnoreCase(format)) {
          map.clear();  
         System.out.println("系统格式化完毕！当前系统中数据为" 
          + map.size() + "条");
}
          System.out.println("程序运行结束！");
  }
}