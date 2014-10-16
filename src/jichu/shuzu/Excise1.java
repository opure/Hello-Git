package jichu.shuzu;

public class Excise1 {
	public static void main(String args[]){
		String []pn={"13298111690","13298111691","13298111692",
				"13298111694"};
		int num=(int)(Math.random()*pn.length);//{[0,1)zhijian
		System.out.println(pn[num]);
	}

}
