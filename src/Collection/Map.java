package Collection;


import java.util.HashMap;
import java.util.Scanner;
public class Map {
public static void main(String[] args) {
HashMap map = new HashMap();
Scanner scanner = new Scanner(System.in);
for (int i = 0; i < 2; i++) {  
System.out.println("���������֤�ţ�");
String id = scanner.next();
System.out.println("������������");
String name = scanner.next();
map.put(id, name);  
}
int size = map.size(); 
System.out.println("����������ϣ���" + size
+ "�����ݣ�\n---------------------------------");
String answer = "no";
do {
System.out.println("��������Ҫ���ҵ��û������֤�ţ�");
String id = scanner.next();
if (map.containsKey(id))
{ 
       String name = (String) map.get(id); 
       System.out.println("�����ҵ��û�����Ϊ��" + name);
} 
else {
System.out.println("�����ҵ��û������ڣ�");
}
System.out.println("����Ҫ����������(yes/no)");
answer = scanner.next();
} 
     while ("yes".equalsIgnoreCase(answer));
         System.out.println("������Ҫɾ�����û������֤�ţ�");
         String id = scanner.next();
          if (map.containsKey(id)) {
             String name = (String) map.remove(id); 
          System.out.println("�û�" + name + "ɾ���ɹ���");
} 
           else {
          System.out.println("��Ҫɾ�����û������ڣ�");
        }
     System.out.println("Ҫ��ʽ��ϵͳ��(yes/no)");
         String format = scanner.next();
    if ("yes".equalsIgnoreCase(format)) {
          map.clear();  
         System.out.println("ϵͳ��ʽ����ϣ���ǰϵͳ������Ϊ" 
          + map.size() + "��");
}
          System.out.println("�������н�����");
  }
}