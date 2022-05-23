package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class UnderTwentyDisplay extends Frame
{
    TextField txt_disease_uttd,txt_drug_name_uttd,txt_expiry_uttd,txt_availability_uttd;
    Label lbl_disease,lbl_drug_name,lbl_expiry,lbl_availability;
    Button  btn_next_uttd, btn_prev_uttd,btn_hom_uttd;
    Font font_bold;
    MyActionListener ml = new MyActionListener(this);
    UnderTwentyDisplay()
    {
        super();
        setLayout(null);
        setBounds(0,0,500,500);

        txt_disease_uttd = new TextField();
        txt_drug_name_uttd = new TextField();
        txt_expiry_uttd = new TextField();
        txt_availability_uttd = new TextField();
        btn_next_uttd = new Button("next");
        btn_prev_uttd= new Button("prev");
        btn_hom_uttd = new Button("HOME");
        lbl_disease = new Label("Disease");
        lbl_drug_name = new Label("Drug Name");
        lbl_expiry = new Label("Expiry");
        lbl_availability = new Label("Availability");
        font_bold = new Font("Arial",Font.BOLD,16);

        lbl_disease.setBounds(100,70,300,20);
        txt_disease_uttd.setBounds(100,100,300,40);

        lbl_drug_name.setBounds(100,150,300,20);
        txt_drug_name_uttd.setBounds(100,180,300,40);

        lbl_expiry.setBounds(100,230,300,20);
        txt_expiry_uttd.setBounds(100,260,300,40);

        lbl_availability.setBounds(100,300,300,20);
        txt_availability_uttd.setBounds(100,330,300,40);
       
        btn_next_uttd.setBounds(255,380,145,40);
        btn_prev_uttd.setBounds(100,380,145,40);
        btn_hom_uttd.setBounds(100,430,300,40);

        txt_disease_uttd.setFont(font_bold);
        txt_drug_name_uttd.setFont(font_bold);
        txt_expiry_uttd.setFont(font_bold);
        txt_availability_uttd.setFont(font_bold);
        btn_next_uttd.setFont(font_bold);
        btn_prev_uttd.setFont(font_bold);
        btn_hom_uttd.setFont(font_bold);
        lbl_disease.setFont(font_bold);
        lbl_drug_name.setFont(font_bold);
        lbl_expiry.setFont(font_bold);
        lbl_availability.setFont(font_bold);

        add( txt_disease_uttd);
        add(txt_drug_name_uttd);
        add(txt_expiry_uttd);
        add(txt_availability_uttd);
        add(btn_next_uttd);
        add(btn_prev_uttd);
        add(btn_hom_uttd);
        add(lbl_disease);
        add(lbl_drug_name);
        add(lbl_expiry);
        add(lbl_availability);
       
        btn_next_uttd.addActionListener(ml);
        btn_prev_uttd.addActionListener(ml);
        btn_hom_uttd.addActionListener(ml);
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