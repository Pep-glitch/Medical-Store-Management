package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class InfectiousDisplay extends Frame
{
   
    JTable tab;
    JButton btn_ext,btn_dsply;
    MyActionListener ml = new MyActionListener(this);
    InfectiousDisplay()
    {
        super("Infectious Diseases");
        setLayout(null);
        setBounds(150,100,600,600);
        tab = new JTable(20,3);
        btn_ext = new JButton("Exit..");
        btn_dsply = new JButton("Get..");
  
        tab.setBounds(50,100,500,350);
        btn_ext.setBounds(140,450,150,40);
        btn_dsply.setBounds(300,450,150,40);
        tab.setValueAt("Name", 0, 0);
        tab.setValueAt("Amount", 0, 1);
        tab.setValueAt("Expiry", 0,2);
     
    
        add(tab);
        add(btn_ext);
        add(btn_dsply);
        btn_ext.addActionListener(ml);
        btn_dsply.addActionListener(ml);
       
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
        InfectiousDisplay infectiousObject = new   InfectiousDisplay();
        infectiousObject.setVisible(true);
    }
}