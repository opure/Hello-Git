package jichu.duixiang;

class Animal11{

	   public void move(){
	      System.out.println("动物可以移动");
	   }
	   public void bark(){
		   
	   }
	   
	}

	class Dog extends Animal11{

	   public void move(){
	      System.out.println("狗可以跑和走");
	   }
	   public void bark(){
	      System.out.println("狗可以吠叫");
	   }
	}

	public class Testdog{

	   public static void main(String args[]){
	      Animal11 a = new Animal11(); // Animal 对象
	      Animal11 b = new Animal11();
	      b = new Dog(); // Dog 对象

	      a.move();// 执行 Animal 类的方法
	      b.move();//执行 Dog 类的方法
	      b.bark();
	    
	   }
	}