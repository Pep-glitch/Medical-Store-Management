package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class PriscriptionsDisplay extends Frame 
{
    Checkbox symp_one,symp_two,symp_three,symp_four,symp_five,symp_six,symp_seven,symp_eight,symp_nine,symp_ten;
    Font font_bold;
    // TextField txtbox;
    MyActionListener ml = new MyActionListener(this);
    PriscriptionsDisplay()
    {
        super();
        setLayout(null);
        setBounds(0,0,600,500);
        
        symp_one = new Checkbox();
        symp_two = new Checkbox();
        symp_three= new Checkbox();
        symp_four = new Checkbox();
        symp_five = new Checkbox();
        symp_six = new Checkbox();
        symp_seven = new Checkbox();
        symp_eight = new Checkbox();
        symp_nine = new Checkbox();
        symp_ten = new Checkbox();
        font_bold = new Font("Arial",Font.BOLD,16)

        symp_one.setBounds();
        symp_two.setBounds();
        symp_three.setBounds();
        symp_four.setBounds();
        symp_five.setBounds();
        symp_six.setBounds();
        symp_seven.setBounds();
        symp_eight.setBounds();
        symp_nine.setBounds();
        symp_ten.setBounds();

        symp_one.setFont(font_bold);
        symp_two.setFont(font_bold);
        symp_three.setFont(font_bold);
        symp_four.setFont(font_bold);
        symp_five.setFont(font_bold);
        symp_six.setFont(font_bold);
        symp_seven.setFont(font_bold);
        symp_eight.setFont(font_bold);
        symp_nine.setFont(font_bold);
        symp_ten.setFont(font_bold);

        
        add(symp_one);
        add(symp_two);
        add(symp_three);
        add(symp_four);
        add(symp_five);
        add(symp_six);
        add(symp_seve);
        add(symp_eight);
        add(symp_nine);
        add(symp_ten);
        
        symp_one.addItemListener(ml);
        symp_two.addItemListener(ml);
        symp_three.addItemListener(ml);
        symp_four.addItemListener(ml);
        symp_five.addItemListener(ml);
        symp_six.addItemListener(ml);
        symp_seven.addItemListener(ml);
        symp_eight.addItemListener(ml);
        symp_nine.addItemListener(ml);
        symp_ten.addItemListener(ml);
        addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
    }
    /*
    public static void main(String ss[])
    {
        PriscriptionsDisplay  prisciptionsObject = new PriscriptionsDisplay();
        prisciptionsObject.setVisible(true);
    }  
    */ 
}