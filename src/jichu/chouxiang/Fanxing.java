package jichu.chouxiang;
class Info<T>{
	private T var ;
	public T getVar(){
		return this.var ;
	}
	public void setVar(T var){
		this.var = var ;
	}
	public String toString(){		// ��дObject���е�toString()����
		return this.var.toString() ;
	}
};
public class Fanxing{
	public static void main(String args[]){
		Info<Object> i = new Info<Object>() ;		// ָ��ObjectΪ��������
		i.setVar("MLDN") ;			// �����ַ���
		System.out.println("���ݣ�" + i.getVar()) ;
	}
};