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
        setBounds(0,0,600,800);
        
        symp_one = new Checkbox("Head pain");
        symp_two = new Checkbox("Neck pain");
        symp_three= new Checkbox("Spinal");
        symp_four = new Checkbox("Muscle");
        symp_five = new Checkbox("Stomach ache");
        symp_six = new Checkbox("Tooth ache");
        symp_seven = new Checkbox("Malaria");
        symp_eight = new Checkbox("flu");
        symp_nine = new Checkbox("cough");
        symp_ten = new Checkbox("heat");
        font_bold = new Font("Arial",Font.BOLD,16)

        symp_one.setBounds(100,100,200,50);
        symp_two.setBounds(100,160,200,50);
        symp_three.setBounds(100,220,200,50);
        symp_four.setBounds(100,280,200,50);
        symp_five.setBounds(100,340,200,50);
        symp_six.setBounds(100,400,200,50);
        symp_seven.setBounds(100,460,200,50);
        symp_eight.setBounds(100,520,200,50);
        symp_nine.setBounds(100,580,200,50);
        symp_ten.setBounds(100,640,200,50);

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