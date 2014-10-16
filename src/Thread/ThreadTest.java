package Thread;

public class ThreadTest extends Thread {
	public void run(){
		for (int i=0;i<=100;i++){
			System.out.println(getName()+"\n"+i);
		}
	}
	public static void main(String args[]){ 
			ThreadTest t1=new ThreadTest();
			ThreadTest t2=new ThreadTest();
			t1.start();
			t2.start();
	}

}
