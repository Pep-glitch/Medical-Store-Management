package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class PriscriptionsDisplay extends Frame 
{
    MyActionListener ml = new MyActionListener(this);
    PriscriptionsDisplay()
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
        PriscriptionsDisplay  prisciptionsObject = new PriscriptionsDisplay();
        prisciptionsObject.setVisible(true);
    }   
}