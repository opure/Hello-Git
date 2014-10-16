package jisuanqi;


import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
  
public class Caculator extends JFrame implements KeyListener{ //构造Caculator类   
private Container content;//构造容器   
private JButton bCancel;  //清除按钮   
private JButton[] b=new JButton[16];  //构造按钮数组   
private char LastOp;   //操作符号   
private boolean Countable;   //用于判断是否可计算   
private String KeyLabel[]={"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};  
private StringBuffer str;  
private JPanel KeyPanel,TextPanel;  //按键面板，结果面板   
private JTextArea tResult; //用于显示结果的文本域   
private double x=0,y=0; //操作数   
  
 public Caculator(){  
     setTitle("计算器");  
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
     content =getContentPane(); //初始化一个容器   
     content.setLayout(new BorderLayout());    //设置容器的布局方式   
     KeyPanel=new JPanel();    
     TextPanel=new JPanel();  
     TextPanel.setLayout(new FlowLayout());     //设置TextPanel面板的布局方式   
     KeyPanel.setLayout(new GridLayout(4,4));   //设置KeyPanel面板的布局方式   
  
    tResult=new JTextArea(1,15);    //实例化一个JTextArea类   
    tResult.setEditable(false);     //将tResult设置为不可编辑   
    tResult.setText("0");           //文本域显示为0    
    tResult.addKeyListener(this);   //添加键盘监听器   
    str=new StringBuffer();         //实例化一个字符串缓冲区   
    
    ButtonListener btnListener = new ButtonListener();   //实例化一个ButtonListener类的监听器    
    for(int i=0;i<16;i++){  
     b[i] = new JButton(KeyLabel[i]);  
     b[i].addActionListener(btnListener);  //添加ButtonListener类监听器   
     b[i].addKeyListener(this);   //添加键盘监听器   
     KeyPanel.add(b[i]);  
   }    
    bCancel=new JButton("C");      
    bCancel.addActionListener(btnListener);  //添加ButtonListener类监听器   
    bCancel.addKeyListener(this);            //添加键盘监听器   
    bCancel.setBackground(Color.RED);   
    LastOp='!';    //若LastOp的值不为'+' '-' '*' '/'中的一个，则约定它的值是 '!'   
    Countable=false;  
      
   TextPanel.add(tResult);   
   TextPanel.add(bCancel);  
   content.add("North",TextPanel);  
   content.add("Center",KeyPanel);  
   pack();  
   setResizable(false);   
   setVisible(true);     
 }  
 class ButtonListener implements ActionListener  //构造监听器   
 {  
 public void actionPerformed(ActionEvent e) {  
         String s = ((JButton)e.getSource()).getText().trim(); //得到用户按下的按钮上的文本   
         char c = s.charAt(0);       //得到s中索引为0的字符    
           
     if(c == 'C')         //选择按钮C   
     {  
      tResult.setText("0");  
      str.setLength(0);  
      LastOp = '!';   
      Countable = false;   
      x = 0;  
      y = 0;  
      return;  
     }  
     
    
    if(c == '.')  //选择输入小数点   
    {  
      if( tResult.getText().trim().indexOf(".") != -1) return;  
      else   
      { str.insert(str.length(),".");  
        tResult.append(".");  
        return;  
      }  
    }  
  
    if(c == '+'||c ==  '-'||c == '*'||c == '/'||c == '=')     //按加减乘除或等号键   
    {  
     Caculate(c);  
     return;  
    }        
   
//剩下的数字键   
    tResult.setText(str.append(s).toString());  
    Countable=true;  
 }  
 }  
   
 //实现KeyListener监听器   
@Override
 public void keyTyped(KeyEvent ek)  
 {  
  char c = ek.getKeyChar();      //获取键盘上按的数字键   
 if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')  
  {  
   tResult.setText(str.append(c).toString());  
   Countable=true;   
   return;  
  }  
  
  if(c =='.')             //按小数点   
  {  
     if( tResult.getText().trim().indexOf(".") != -1) return;  
     else   
     { str.insert(str.length(),".");  
       tResult.append(".");  
       return;  
     }  
   }  
     
  if((int)c == KeyEvent.VK_DELETE )   //按delete键   
    {  
         tResult.setText("0");  
          str.setLength(0);  
          LastOp = '!';   
          Countable = false;   
          x = 0;  
          y = 0;  
          return;  
   }  
  if(c == '+'||c ==  '-'||c == '*'||c == '/'||c == '=')            //按加减乘除或等号键   
  {  
   Caculate(c);  
  }        
}  
@Override
 public void keyPressed(KeyEvent ek) {}  
 public void keyReleased(KeyEvent ek) {}  
 public void Caculate(char c)  
 {  
     if(c == '+')            //按加号键   
      {  
       Add();  
       return;  
      }        
          
     if( c == '-')          //按减号键   
      {  
       Minus();  
       return;  
      }        
  
     if(c  == '*')             //按乘号键   
     {  
     Mul();  
     return;  
      }    
  
      if(c == '/')             //按除号键   
      {  
     Div();  
     return;  
      }   
  
      if(c == '=')       //按等号键   
      {  
     Equal();  
     }  
 }  
 public void Add(){          //加方法   
      if(Countable==true && LastOp != '!')   //判断是否进行运算   
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
                   tResult.setText("除数不能为0");return;  
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
 public void Minus(){       //减方法   
      if(Countable==true && LastOp != '!')      //判断是否进行运算   
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
                   tResult.setText("除数不能为0");return;  
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
 public void Mul(){    //乘方法   
     if(Countable==true && LastOp != '!')     //判断是否进行运算   
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
                   tResult.setText("除数不能为0");return;  
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
 public void Div()  //除方法   
 {  
     if(Countable==true && LastOp != '!')          //判断是否进行运算   
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
                 tResult.setText("除数不能为0");return;   
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
 public void Equal()   //求结果的方法   
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
                   tResult.setText("除数不能为0");return;  
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
