package jichu.shuzu;

public class PlayCard {
	public static void main(String args[]){
		//step1 create cards array
		String [] color={"HT","HX","MH","FP"};
		int [] num={1,2,3,4,5,6,7,8,9,10,11,12,13};
		String[] cards=new String[52];
		int count=0;
		for(int i=0;i<color.length;i++){
			for (int j=0;j<num.length;j++){
		     cards[count++]=color[i] +num[j];//
			
			}
		}
		//System.out.print(cards.length);
		//step2 Ëæ»úÏ´ÅÆ
		for (int i=0;i<100;i++){
			String card1=cards[0];
			int random_num=(int)(Math.random()*52);
			cards[0]=cards[random_num];
			cards[random_num]=card1;
					}
		//step3
		String[] p1=new String[13];
		int p1_count=0;
		String[] p2=new String[13];
		int p2_count=0;
		String[] p3=new String[13];
		int p3_count=0;
		String[] p4=new String[13];
		int p4_count=0;
		for(int i=0;i<cards.length;i++){
			if(i%4==0)
			{
				p1[p1_count++]=cards[i];
			}
			if(i%4==1)
			{
				p2[p2_count++]=cards[i];
			}
			if(i%4==2)
			{
				p3[p3_count++]=cards[i];
			}
			if(i%4==3)
			{
				p4[p4_count++]=cards[i];
			}
		}
		//step4 show result
		System.out.print("p1_cards");
		for (int i=0;i<p1.length;i++){
			System.out.print(p1[i]+" ");
		}
		System.out.println();
		System.out.print("p2_cards");
		for (int i=0;i<p2.length;i++){
			System.out.print(p2[i]+" ");
		}
		System.out.println();
		System.out.print("p3_cards");
		for (int i=0;i<p3.length;i++){
			System.out.print(p3[i]+" ");
		}
		System.out.println();
		System.out.print("p4_cards");
		for (int i=0;i<p4.length;i++){
			System.out.print(p4[i]+" ");
		}
		System.out.println();
	}

}
