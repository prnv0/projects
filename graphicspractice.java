import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class build extends JFrame implements ActionListener{

    JTextField ta = new JTextField("Enter a");
    JTextField tb = new JTextField("Enter b");
    JTextField tc = new JTextField("Enter c");
    JTextField output = new JTextField("VOLUME");
    JButton b1 = new JButton("Submit");
    JButton b2= new JButton("Reset");

    build(){
        JPanel buttons = new JPanel();
        JPanel input = new JPanel();
        JPanel top= new JPanel();
        JFrame f= new JFrame("Button App");
        
        b1.addActionListener(this);
        
        b2.addActionListener(this);
        //JButton b3 = new JButton("Click 3");
        buttons.add(b1);
        buttons.add(b2);
        //buttons.add(b3);
        buttons.setLayout(new GridLayout());
        input.add(ta);
        input.add(tb);
        input.add(tc);
        input.setLayout(new GridLayout(3,1));
        top.add(input);
        top.add(output);
        top.setLayout(new GridLayout(1,2));
        //display.add(t);

        f.add(top);
        f.add(buttons);
        f.setLayout(new GridLayout(2,1));
        f.setSize(600,400);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
        String a=ta.getText();
        String b=tb.getText();
        String c=tc.getText(); 
        output.setText(a+"x^2 + "+b+"x +"+c);
        }
        else{
            ta.setText("Enter a");
            tb.setText("Enter b");
            tc.setText("Enter c");
            output.setText("EQUATION: ");
        }
    }

}

public class graphicspractice {
    public static void main(String[] args){
        build a=new build();
    }
    
}