package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class MainDisplay extends Frame
{
    Button drugs,reports,presciptions;
    Font font_bold;
    MyActionListener ml = new MyActionListener(this);
    MainDisplay()
    {
        super();
        setLayout(null);
        setBounds(0,0,500,500);
        
        drugs = new Button("DRUGS");
        reports = new Button("REPORTS");
        presciptions = new Button("PRESCRIPTIONS");
        font_bold = new Font("sans-serif",Font.BOLD,16);

        drugs.setBounds(100,100,300,50);
        reports.setBounds(100,160,300,50);
        presciptions.setBounds(100,220,300,50);

        drugs.setFont(font_bold);
        reports.setFont(font_bold);
        presciptions.setFont(font_bold);

        add(drugs);
        add(reports);
        add(presciptions);

        drugs.addActionListener(ml);
        reports.addActionListener(ml);
        presciptions.addActionListener(ml);
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
        MainDisplay mainDisplayObject = new  MainDisplay();
        mainDisplayObject.setVisible(true);
    }
}