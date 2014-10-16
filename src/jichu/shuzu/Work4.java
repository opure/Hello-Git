package jichu.shuzu;

import java.util.Scanner;

public class Work4 {

	   public static void main(String args[]){
	   Scanner input = new Scanner(System.in); 
           System.out.println("请输入年份");
            int year= input.nextInt(); 
           System.out.println("请输入月份");
            int month= input.nextInt(); 
            if(month==2){
            	if(year%4==0&&year%100!=0||year%400==0) {
            	System.out.println("最后一天是29号");
            		
        	}else{
        		System.out.println("最后一天是28号");
        		
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
            	System.out.println("最后一天是31号");
             break;
            case 4:
            case 6:
            case 9:
            case 11:
            	System.out.print("最后一天是30号");
            	break;
 
                          }
	              }
        }