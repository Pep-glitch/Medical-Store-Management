package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class DiseaseBasedDisplay extends Frame 
{
    Button btn_infectious,btn_deficiency,btn_hereditary,btn_physiological,btn_home;
    Font font_bold;
    MyActionListener ml = new MyActionListener(this);
    DiseaseBasedDisplay()
    {
        super("Disease Categories");
        setLayout(null);
        setBounds(460,130,600,500);
        
        btn_infectious = new Button("INFECTIOUS");
        btn_deficiency = new Button("DEFICIENCY");
        btn_hereditary = new Button("HEREDITARY");
        btn_physiological = new Button("PHYSIOLOGICAL");
        btn_home = new Button("FRONT VIEW");
        font_bold = new Font("Arial",Font.BOLD,16);
      
        
        btn_infectious.setBounds(100,100,300,50);
        btn_deficiency.setBounds(100,160,300,50);
        btn_hereditary.setBounds(100,220,300,50);
        btn_physiological.setBounds(100,280,300,50);
        btn_home.setBounds(100,340,300,50);

        btn_infectious.setFont(font_bold);
        btn_deficiency.setFont(font_bold);
        btn_hereditary.setFont(font_bold);
        btn_physiological.setFont(font_bold);
        btn_home.setFont(font_bold);

        add(btn_infectious);
        add(btn_deficiency);
        add(btn_hereditary);
        add(btn_physiological);
        add(btn_home);

        btn_infectious.addActionListener(ml);
        btn_deficiency.addActionListener(ml);
        btn_hereditary.addActionListener(ml);
        btn_physiological.addActionListener(ml);
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
        DiseaseBasedDisplay diseaseObject = new  DiseaseBasedDisplay();
        diseaseObject.setVisible(true);
    }   
}