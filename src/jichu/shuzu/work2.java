package jichu.shuzu;

import java.util.*; 

  public class work2{

   public static void main(String args[]){

       Scanner input = new Scanner(System.in); 

          System.out.println("���������");

           int year= input.nextInt(); 

           if(year%4==0&&year%100!=0||year%400==0) 

              System.out.println(+year+" �Ǹ�����");

        else

           System.out.println(+year+"���Ǹ�����");

                }

           }