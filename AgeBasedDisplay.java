package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class AgeBasedDisplay extends Frame 
{
    Button btn_zero_ten,btn_ten_twenty,btn_twenty_forty,btn_forty_plus,btn_home;
    Font font_bold;
    MyActionListener ml = new MyActionListener(this);
    AgeBasedDisplay()
    {
        super("Age Groups");
        setLayout(null);
        setBounds(0,0,600,500);
        
        btn_zero_ten = new Button("0-10");
        btn_ten_twenty = new Button("10-20");
        btn_twenty_forty = new Button("20-40");
        btn_forty_plus = new Button("40+");
        btn_home = new Button("HOME");
        font_bold = new Font("Arial",Font.BOLD,16);

        btn_zero_ten.setBounds(100,100,300,50);
        btn_ten_twenty.setBounds(100,160,300,50);
        btn_twenty_forty.setBounds(100,220,300,50);
        btn_forty_plus.setBounds(100,280,300,50);
        btn_home.setBounds(100,340,300,50);

        btn_zero_ten.setFont(font_bold);
        btn_ten_twenty.setFont(font_bold);
        btn_twenty_forty.setFont(font_bold);
        btn_forty_plus.setFont(font_bold);
        btn_home.setFont(font_bold);

        add(btn_zero_ten);
        add(btn_ten_twenty);
        add(btn_twenty_forty);
        add(btn_forty_plus);
        add(btn_home);

        btn_zero_ten.addActionListener(ml);
        btn_ten_twenty.addActionListener(ml);
        btn_twenty_forty.addActionListener(ml);
        btn_forty_plus.addActionListener(ml);
        btn_home.addActionListener(ml);
        addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
    }
    public static void main(String ss[])
    {
        AgeBasedDisplay reportObject = new AgeBasedDisplay();
        reportObject.setVisible(true);
    }  
}