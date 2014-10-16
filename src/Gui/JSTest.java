package Gui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JSTest extends JFrame{
    private Container briup_c;
    private JButton briup_w;
    private JPanel briup_p1;
    private double result;
    private boolean start;
    private String lastCommand;
    public JSTest(String title){
		setTitle(title);
		setSize(250,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		briup_c = getContentPane();
                init();
    }
    public void init(){
        
        briup_c.setLayout(new BorderLayout());
        
        result = 0;
        lastCommand = "=";
        start = true;
        
        briup_w = new JButton("0");
        briup_w.setEnabled(false);
        briup_c.add(briup_w,BorderLayout.NORTH);
       
       
        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();
        briup_p1 = new JPanel();
        briup_p1.setLayout(new GridLayout(4,4));
        
        addButton("7",insert);
        addButton("8",insert);
        addButton("9",insert);
        addButton("/",command);
        
        
        
        
        addButton("4",insert);
        addButton("5",insert);
        addButton("6",insert);
        addButton("*",command);
      
      
        
        
        addButton("1",insert);
        addButton("2",insert);
        addButton("3",insert);
        addButton("-",command);
        
        
        addButton("0",insert);
        addButton(".",insert);
        addButton("=",command);
        addButton("+",command);
        
        
       
        briup_c.add(briup_p1,BorderLayout.CENTER);
        
    }
    
    private void addButton(String label,ActionListener listener){
        JButton button = new JButton(label);
        button.addActionListener(listener);
        briup_p1.add(button);
    }
  

    private class InsertAction implements ActionListener {

        
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            if(start){
                briup_w.setText("");
                start = false;
            }
            briup_w.setText(briup_w.getText() + input);
        }
       
    }

    private class CommandAction implements ActionListener {

       
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            
            if(start){
                if(command.equals("-")){
                    briup_w.setText(command);
                    start = false;
               }
               else lastCommand = command;     
            }
            else{
                calculate(Double.parseDouble(briup_w.getText()));
                lastCommand = command;
                start = true;
            }
        }

        private void calculate(double x) {
          if(lastCommand.equals("+"))  
               result +=x;
           else if (lastCommand.equals("-"))  
               result -=x;
           else if (lastCommand.equals("*"))  
               result *=x;
           else if (lastCommand.equals("/"))  
               result /=x;
           else if (lastCommand.equals("="))  
               result =x;
           briup_w.setText("" +result);
        }

       

    }    
      public static void main(String[] args){
        JSTest briup_j = new JSTest("¼ÆËãÆ÷");
        briup_j.setVisible(true);
    }
    
}
