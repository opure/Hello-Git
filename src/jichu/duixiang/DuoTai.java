package jichu.duixiang;
class Ch{
	public void eat(){
		System.out.println("Éú³Ô");
	}
}
class Ci extends Ch{
	public void eat(){
		System.out.println("Êì³Ô");
	}
}
public class DuoTai {
	public static void main(String args[]){
		Ch p=new Ch();
		p.eat();
		p=new Ci();
		p.eat();
	}

}
