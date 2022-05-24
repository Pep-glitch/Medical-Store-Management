package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class UnderTenDisplay extends Frame
{
    TextField txt_disease_utd,txt_drug_name_utd,txt_expiry_utd,txt_availability_utd;
    Label lbl_disease,lbl_drug_name,lbl_expiry,lbl_availability;
    Button btn_next_utd, btn_prev_utd,btn_hom_utd;
    Font font_bold;
    MyActionListener ml = new MyActionListener(this);
    UnderTenDisplay()
    {
        super("Age 0 - 10");
        setLayout(null);
        setBounds(0,0,500,500);
        
        txt_disease_utd = new TextField();
        txt_drug_name_utd = new TextField();
        txt_expiry_utd = new TextField();
        txt_availability_utd = new TextField();
        btn_next_utd  = new Button("next");
        btn_prev_utd = new Button("prev");
        btn_hom_utd = new Button("HOME");
        lbl_disease = new Label("Disease");
        lbl_drug_name = new Label("Drug Name");
        lbl_expiry = new Label("Expiry");
        lbl_availability = new Label("Availability");
        font_bold = new Font("Arial",Font.BOLD,16);

        lbl_disease.setBounds(100,70,300,20);
        txt_disease_utd.setBounds(100,100,300,40);

        lbl_drug_name.setBounds(100,150,300,20);
        txt_drug_name_utd.setBounds(100,180,300,40);

        lbl_expiry.setBounds(100,230,300,20);
        txt_expiry_utd.setBounds(100,260,300,40);

        lbl_availability.setBounds(100,300,300,20);
        txt_availability_utd.setBounds(100,330,300,40);
       
        btn_next_utd.setBounds(255,380,145,40);
        btn_prev_utd.setBounds(100,380,145,40);
        btn_hom_utd.setBounds(100,430,300,40);

        txt_disease_utd.setFont(font_bold);
        txt_drug_name_utd.setFont(font_bold);
        txt_expiry_utd.setFont(font_bold);
        txt_availability_utd.setFont(font_bold);
        btn_next_utd.setFont(font_bold);
        btn_prev_utd.setFont(font_bold);
        btn_hom_utd.setFont(font_bold);
        lbl_disease.setFont(font_bold);
        lbl_drug_name.setFont(font_bold);
        lbl_expiry.setFont(font_bold);
        lbl_availability.setFont(font_bold);

        add(txt_disease_utd);
        add(txt_drug_name_utd);
        add(txt_expiry_utd);
        add(txt_availability_utd);
        add(btn_next_utd);
        add(btn_prev_utd);
        add(btn_hom_utd);
        add(lbl_disease);
        add(lbl_drug_name);
        add(lbl_expiry);
        add(lbl_availability);
       
        btn_next_utd.addActionListener(ml);
        btn_prev_utd.addActionListener(ml);
        btn_hom_utd.addActionListener(ml);
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
        UnderTenDisplay underTenObject = new  UnderTenDisplay();
        underTenObject.setVisible(true);
    }
}