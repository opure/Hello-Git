package jichu.shuzu;

import java.util.Scanner;

public class Work4 {

	   public static void main(String args[]){
	   Scanner input = new Scanner(System.in); 
           System.out.println("���������");
            int year= input.nextInt(); 
           System.out.println("�������·�");
            int month= input.nextInt(); 
            if(month==2){
            	if(year%4==0&&year%100!=0||year%400==0) {
            	System.out.println("���һ����29��");
            		
        	}else{
        		System.out.println("���һ����28��");
        		
        	}
            }else
            	
            switch(month){
            case 1 :
            case 3 :
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            	System.out.println("���һ����31��");
             break;
            case 4:
            case 6:
            case 9:
            case 11:
            	System.out.print("���һ����30��");
            	break;
 
                          }
	              }
        }