package jichu.shuzu;
import java.util.Calendar; 
public class work1 {
	public static  void main(String args[]){
		
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY); 
		if (hour>=8&&hour<=12){
			System.out.println("�����");
			
		}
		else if(hour>=12&&hour<=14){
			System.out.println("�����");
			
		}
		else if (hour>=14&&hour<=18){
			System.out.println("�����");
		}
		else{
			System.out.print("���Ϻ�");
		}
		
	}

}
