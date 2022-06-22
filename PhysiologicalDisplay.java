package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class PhysiologicalDisplay extends Frame
{
   
    JTable tab;
    JButton btn_ext,btn_dsply;
    JLabel lbl_title;
    MyActionListener ml = new MyActionListener(this);
    PhysiologicalDisplay()
    {
        super("Physiological Diseases");
        setLayout(null);
        setBounds(150,100,600,600);
        tab = new JTable(20,3);
        btn_ext = new JButton("Exit.");
        btn_dsply = new JButton("Get.");
        lbl_title = new JLabel("Physiological Diseases");
  
        lbl_title.setBounds(200,50,150,30);
        tab.setBounds(50,100,500,350);
        btn_ext.setBounds(140,450,150,40);
        btn_dsply.setBounds(300,450,150,40);
        tab.setValueAt("Name", 0, 0);
        tab.setValueAt("Expiry", 0, 1);
        tab.setValueAt("Amount", 0,2);
     
    
        add(lbl_title);
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
        PhysiologicalDisplay physiologicalObject = new  PhysiologicalDisplay();
        physiologicalObject.setVisible(true);
    }
}