package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class UnderTwentyDisplay extends Frame
{
   
    MyActionListener ml = new MyActionListener(this);
    UnderTwentyDisplay()
    {
        super();
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
        UnderTwentyDisplay underTwentyObject = new UnderTwentyDisplay();
        underTwentyObject.setVisible(true);
    }
}