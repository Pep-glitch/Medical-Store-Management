package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class PhysiologicalDisplay extends Frame
{
   
    MyActionListener ml = new MyActionListener(this);
    PhysiologicalDisplay()
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
        PhysiologicalDisplay physiologicalObject = new  PhysiologicalDisplay();
        physiologicalObject.setVisible(true);
    }
}