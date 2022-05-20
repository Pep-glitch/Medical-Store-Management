package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class AgeBasedDisplay extends Frame 
{
  
    MyActionListener ml = new MyActionListener(this);
    AgeBasedDisplay()
    {
        super();
        setLayout(null);
        setBounds(0,0,600,500);
        
      
    
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