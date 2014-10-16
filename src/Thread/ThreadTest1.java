package Thread;

public class ThreadTest1 implements Runnable{
	public void run(){
		for (int i=0;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+"\n"+i);
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ThreadTest t1=new ThreadTest();
		ThreadTest t2=new ThreadTest();
		Thread tt1=new Thread(t1);
		Thread tt2=new Thread(t2);
		tt1.start();
		tt2.start();

	}

}
