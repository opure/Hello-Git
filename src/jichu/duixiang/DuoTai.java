package jichu.duixiang;
class Ch{
	public void eat(){
		System.out.println("����");
	}
}
class Ci extends Ch{
	public void eat(){
		System.out.println("���");
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
