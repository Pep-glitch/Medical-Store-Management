package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class ReportTypeDisplay extends Frame
{
   
    Font font_bold;
    MyActionListener ml = new MyActionListener(this);
    ReportTypeDisplay()
    {
        super("REPORT TYPE");
        setLayout(null);
        setBounds(0,0,500,500);
        
       
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
        ReportTypeDisplay reportTypeObject = new ReportTypeDisplay();
        reportTypeObject.setVisible(true);
    }
}