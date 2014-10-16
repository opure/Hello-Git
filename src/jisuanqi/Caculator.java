package jisuanqi;


import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
  
public class Caculator extends JFrame implements KeyListener{ //����Caculator��   
private Container content;//��������   
private JButton bCancel;  //�����ť   
private JButton[] b=new JButton[16];  //���찴ť����   
private char LastOp;   //��������   
private boolean Countable;   //�����ж��Ƿ�ɼ���   
private String KeyLabel[]={"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};  
private StringBuffer str;  
private JPanel KeyPanel,TextPanel;  //������壬������   
private JTextArea tResult; //������ʾ������ı���   
private double x=0,y=0; //������   
  
 public Caculator(){  
     setTitle("������");  
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
     content =getContentPane(); //��ʼ��һ������   
     content.setLayout(new BorderLayout());    //���������Ĳ��ַ�ʽ   
     KeyPanel=new JPanel();    
     TextPanel=new JPanel();  
     TextPanel.setLayout(new FlowLayout());     //����TextPanel���Ĳ��ַ�ʽ   
     KeyPanel.setLayout(new GridLayout(4,4));   //����KeyPanel���Ĳ��ַ�ʽ   
  
    tResult=new JTextArea(1,15);    //ʵ����һ��JTextArea��   
    tResult.setEditable(false);     //��tResult����Ϊ���ɱ༭   
    tResult.setText("0");           //�ı�����ʾΪ0    
    tResult.addKeyListener(this);   //��Ӽ��̼�����   
    str=new StringBuffer();         //ʵ����һ���ַ���������   
    
    ButtonListener btnListener = new ButtonListener();   //ʵ����һ��ButtonListener��ļ�����    
    for(int i=0;i<16;i++){  
     b[i] = new JButton(KeyLabel[i]);  
     b[i].addActionListener(btnListener);  //���ButtonListener�������   
     b[i].addKeyListener(this);   //��Ӽ��̼�����   
     KeyPanel.add(b[i]);  
   }    
    bCancel=new JButton("C");      
    bCancel.addActionListener(btnListener);  //���ButtonListener�������   
    bCancel.addKeyListener(this);            //��Ӽ��̼�����   
    bCancel.setBackground(Color.RED);   
    LastOp='!';    //��LastOp��ֵ��Ϊ'+' '-' '*' '/'�е�һ������Լ������ֵ�� '!'   
    Countable=false;  
      
   TextPanel.add(tResult);   
   TextPanel.add(bCancel);  
   content.add("North",TextPanel);  
   content.add("Center",KeyPanel);  
   pack();  
   setResizable(false);   
   setVisible(true);     
 }  
 class ButtonListener implements ActionListener  //���������   
 {  
 public void actionPerformed(ActionEvent e) {  
         String s = ((JButton)e.getSource()).getText().trim(); //�õ��û����µİ�ť�ϵ��ı�   
         char c = s.charAt(0);       //�õ�s������Ϊ0���ַ�    
           
     if(c == 'C')         //ѡ��ťC   
     {  
      tResult.setText("0");  
      str.setLength(0);  
      LastOp = '!';   
      Countable = false;   
      x = 0;  
      y = 0;  
      return;  
     }  
     
    
    if(c == '.')  //ѡ������С����   
    {  
      if( tResult.getText().trim().indexOf(".") != -1) return;  
      else   
      { str.insert(str.length(),".");  
        tResult.append(".");  
        return;  
      }  
    }  
  
    if(c == '+'||c ==  '-'||c == '*'||c == '/'||c == '=')     //���Ӽ��˳���Ⱥż�   
    {  
     Caculate(c);  
     return;  
    }        
   
//ʣ�µ����ּ�   
    tResult.setText(str.append(s).toString());  
    Countable=true;  
 }  
 }  
   
 //ʵ��KeyListener������   
@Override
 public void keyTyped(KeyEvent ek)  
 {  
  char c = ek.getKeyChar();      //��ȡ�����ϰ������ּ�   
 if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')  
  {  
   tResult.setText(str.append(c).toString());  
   Countable=true;   
   return;  
  }  
  
  if(c =='.')             //��С����   
  {  
     if( tResult.getText().trim().indexOf(".") != -1) return;  
     else   
     { str.insert(str.length(),".");  
       tResult.append(".");  
       return;  
     }  
   }  
     
  if((int)c == KeyEvent.VK_DELETE )   //��delete��   
    {  
         tResult.setText("0");  
          str.setLength(0);  
          LastOp = '!';   
          Countable = false;   
          x = 0;  
          y = 0;  
          return;  
   }  
  if(c == '+'||c ==  '-'||c == '*'||c == '/'||c == '=')            //���Ӽ��˳���Ⱥż�   
  {  
   Caculate(c);  
  }        
}  
@Override
 public void keyPressed(KeyEvent ek) {}  
 public void keyReleased(KeyEvent ek) {}  
 public void Caculate(char c)  
 {  
     if(c == '+')            //���Ӻż�   
      {  
       Add();  
       return;  
      }        
          
     if( c == '-')          //�����ż�   
      {  
       Minus();  
       return;  
      }        
  
     if(c  == '*')             //���˺ż�   
     {  
     Mul();  
     return;  
      }    
  
      if(c == '/')             //�����ż�   
      {  
     Div();  
     return;  
      }   
  
      if(c == '=')       //���Ⱥż�   
      {  
     Equal();  
     }  
 }  
 public void Add(){          //�ӷ���   
      if(Countable==true && LastOp != '!')   //�ж��Ƿ��������   
        {    
        y = Double.parseDouble(tResult.getText().trim());  
        switch(LastOp)  
        {  
       case '+' : x = x+y;  break;  
        case '-' : x = x-y;  break;  
        case '*' : x = x*y;  break;  
        case '/' :if(y != 0)  x = x/y;     
                 else   
                 {  
                   tResult.setText("��������Ϊ0");return;  
                  }  
        }          
        tResult.setText(""+x);      
        Countable = false;  
       }  
       else  x = Double.parseDouble(tResult.getText().trim());  
       str.setLength(0);  
       y = 0;   
       LastOp = '+';     
 }  
 public void Minus(){       //������   
      if(Countable==true && LastOp != '!')      //�ж��Ƿ��������   
        {    
        y = Double.parseDouble(tResult.getText().trim());  
        switch(LastOp)  
        {  
       case '+' : x = x+y;  break;  
        case '-' : x = x-y;  break;  
        case '*' : x = x*y;  break;  
        case '/' :if(y != 0)  x = x/y;        
                 else   
                 {  
                   tResult.setText("��������Ϊ0");return;  
                  }  
        }  
        tResult.setText(""+x);      
        Countable = false;  
       }  
       else  x = Double.parseDouble(tResult.getText().trim());  
       str.setLength(0);  
       y = 0;   
       LastOp = '-';     
 }  
 public void Mul(){    //�˷���   
     if(Countable==true && LastOp != '!')     //�ж��Ƿ��������   
        {    
        y = Double.parseDouble(tResult.getText().trim());  
        switch(LastOp)  
        {  
       case '+' : x = x+y;  break;  
        case '-' : x = x-y;  break;  
        case '*' : x = x*y;  break;  
        case '/' :if(y != 0)  x = x/y;     
                 else   
                 {  
                   tResult.setText("��������Ϊ0");return;  
                  }  
         }  
        tResult.setText(""+x);      
        Countable = false;  
       }  
       else  x = Double.parseDouble(tResult.getText().trim());  
       str.setLength(0);  
       y = 0;   
       LastOp = '*';     
       return ;    
 }  
 public void Div()  //������   
 {  
     if(Countable==true && LastOp != '!')          //�ж��Ƿ��������   
        {    
        y = Double.parseDouble(tResult.getText().trim());  
        switch(LastOp)  
        {  
       case '+' : x = x+y;  break;  
        case '-' : x = x-y;  break;  
        case '*' : x = x*y;  break;  
        case '/' :if(y != 0)  x = x/y;     
                else  
                {   
                 tResult.setText("��������Ϊ0");return;   
                }  
        }          
        tResult.setText(""+x);      
        Countable = false;  
       }  
       else  x = Double.parseDouble(tResult.getText().trim());  
       str.setLength(0);  
       y = 0;   
       LastOp = '/';     
       return ;    
 }  
 public void Equal()   //�����ķ���   
 {  
       y = Double.parseDouble(tResult.getText().trim());  
        switch(LastOp)  
        {  
       case '+' : x = x+y;  break;  
        case '-' : x = x-y;  break;  
        case '*' : x = x*y;  break;  
        case '/' :if(y != 0)  x = x/y;     
                 else   
                 {  
                   tResult.setText("��������Ϊ0");return;  
                  }  
       }  
        tResult.setText(""+x);  
        Countable=false;  
        return;  
 }  
 public static void main(String args[])  
 {  
    Caculator cal=new Caculator();  
 }  
}  
