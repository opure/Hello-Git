package jichu.duixiang;

class Animal11{

	   public void move(){
	      System.out.println("��������ƶ�");
	   }
	   public void bark(){
		   
	   }
	   
	}

	class Dog extends Animal11{

	   public void move(){
	      System.out.println("�������ܺ���");
	   }
	   public void bark(){
	      System.out.println("�����Էͽ�");
	   }
	}

	public class Testdog{

	   public static void main(String args[]){
	      Animal11 a = new Animal11(); // Animal ����
	      Animal11 b = new Animal11();
	      b = new Dog(); // Dog ����

	      a.move();// ִ�� Animal ��ķ���
	      b.move();//ִ�� Dog ��ķ���
	      b.bark();
	    
	   }
	}