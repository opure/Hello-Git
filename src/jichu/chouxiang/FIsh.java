package jichu.chouxiang;
interface Food{
	public void eat();
}
interface Animal{
	public void play();
}
public class FIsh implements Food,Animal {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("look look");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("shengchi");
	}
	
	public static void main(String args[]){
		Food  f=new FIsh();
		f.eat();
		Animal a=new FIsh();
		a.play();
	}
	

}
