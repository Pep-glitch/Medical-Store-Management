package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class DrugsDisplay extends Frame 
{
    Button btn_by_age, btn_disease,btn_general,btn_home;
    Font font_bold;
    MyActionListener ml = new MyActionListener(this);
    DrugsDisplay()
    {
        super("Drug Categories");
        setLayout(null);
        setBounds(460,130,600,500);
        
        btn_by_age = new Button("AGE GROUPS");
        btn_disease= new Button("DISEASE TYPE");
        btn_general= new Button("ADD DRUG");
        btn_home = new Button("FIRST VIEW");
        font_bold = new Font("Arial",Font.BOLD,16);

        btn_by_age.setBounds(100,100,300,50);
        btn_disease.setBounds(100,160,300,50);
        btn_general.setBounds(100,220,300,50);
        btn_home.setBounds(100,280,300,50);

        btn_by_age.setFont(font_bold);
        btn_disease.setFont(font_bold);
        btn_general.setFont(font_bold);
        btn_home.setFont(font_bold);

        add(btn_by_age);
        add(btn_disease);
        add(btn_general);
        add(btn_home);

        btn_by_age.addActionListener(ml);
        btn_disease.addActionListener(ml);
        btn_general.addActionListener(ml);
        btn_home.addActionListener(ml);
        addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
    }
    /*
    public static void main(String ss[])
    {
        DrugsDisplay drugsObject = new DrugsDisplay();
        drugsObject.setVisible(true);
    }  
    */
}