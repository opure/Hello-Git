package jichu.test;

public class classLoaderTest {
	public static void main(String args[]){
		ClassLoader c1=System.class.getClassLoader();
		System.out.println(c1==null?"null":c1.getClass().getName());
		c1=javax.swing.Box.class.getClassLoader();
		System.out.println(c1==null?"null":c1.getClass().getName());
		
		}

}
