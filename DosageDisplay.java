package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class DosageDisplay extends Frame
{
    TextField txt_suspected_illness,txt_drug_one,txt_drug_two,txt_drug_three;
    Label lbl_suspected_illness,lbl_drug_one, lbl_drug_two,lbl_drug_three;
    Button btn_cancel,btn_save;
    Font font_bold;
    MyActionListener ml = new MyActionListener(this);
    DosageDisplay()
    {
        super("DOSAGE");
        setLayout(null);
        setBounds(460,130,500,500);
        
        txt_suspected_illness = new TextField();
        txt_drug_one = new TextField();
        txt_drug_two = new TextField();
        txt_drug_three = new TextField();
        btn_cancel = new Button("CANCEL");
        btn_save= new Button("SAVE");
        lbl_suspected_illness = new Label("Suspected Illness");
        lbl_drug_one = new Label("Drug >>1");
        lbl_drug_two = new Label("Drug >>2");
        lbl_drug_three = new Label("Drug >>3");
        font_bold = new Font("Arial",Font.BOLD,16);

        lbl_suspected_illness.setBounds(100,70,300,20);
        txt_suspected_illness.setBounds(100,100,300,40);

        lbl_drug_one.setBounds(100,150,300,20);
        txt_drug_one.setBounds(100,180,300,40);

        lbl_drug_two.setBounds(100,230,300,20);
        txt_drug_two.setBounds(100,260,300,40);

        lbl_drug_three.setBounds(100,300,300,20);
        txt_drug_three.setBounds(100,330,300,40);

        btn_cancel.setBounds(100,380,145,40);
        btn_save.setBounds(255,380,145,40);
       
        txt_suspected_illness.setFont(font_bold);
        txt_drug_one.setFont(font_bold);
        txt_drug_two.setFont(font_bold);
        txt_drug_three.setFont(font_bold);
        btn_cancel.setFont(font_bold);
        btn_save.setFont(font_bold);
        lbl_suspected_illness.setFont(font_bold);
        lbl_drug_one.setFont(font_bold);
        lbl_drug_two.setFont(font_bold);
        lbl_drug_three.setFont(font_bold);

        add(txt_suspected_illness);
        add(txt_drug_one);
        add(txt_drug_two);
        add(txt_drug_three);
        add(btn_cancel);
        add(btn_save);
        add(lbl_suspected_illness);
        add(lbl_drug_one);
        add(lbl_drug_two);
        add(lbl_drug_three);
        
       
        btn_cancel.addActionListener(ml);
        btn_save.addActionListener(ml);
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
        DosageDisplay dosageObject = new  DosageDisplay();
        dosageObject.setVisible(true);
    }*/
}