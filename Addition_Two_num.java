import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class calculator extends JFrame implements ActionListener {
    JTextField t,t1;
    JLabel l;
    JButton b;
    public  calculator() {
        t=new JTextField(12);
        t1= new JTextField(12);
        b=  new JButton("SUM");
        l=new JLabel("Addition is");
        add(t);
        add(t1);
        add(b);
        add(l);

    //  To make the button clickable we have make it as actionListner
        b.addActionListener(this);   //It is an Interface

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,300);
        setLocation(1000,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      or
//      setDefaultCloseOperation(3);

    }
    public void actionPerformed(ActionEvent ae){
        int num1=Integer.parseInt(t.getText());
        int num2=Integer.parseInt(t1.getText());
        int sum =num1+num2;
        l.setText(sum+"");
    }
}
//Main Class--------->
public class Addition_Two_num {
    public static void main(String[] args) {
        System.out.println("Program is running....");
        calculator obj =new calculator();
    }
}


