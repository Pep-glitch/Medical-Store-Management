package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class DrugsDisplay extends Frame 
{
  
    MyActionListener ml = new MyActionListener(this);
    DrugsDisplay()
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
        DrugsDisplay drugsObject = new DrugsDisplay();
        drugsObject.setVisible(true);
    }  
}