package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class UnderFortyDisplay extends Frame
{
    TextField txt_disease_ufd,txt_drug_name_ufd,txt_expiry_ufd,txt_availability_ufd;
    Label lbl_disease,lbl_drug_name,lbl_expiry,lbl_availability;
    Button btn_next_ufd, btn_prev_ufd,btn_hom_ufd;
    Font font_bold;
    MyActionListener ml = new MyActionListener(this);
    UnderFortyDisplay()
    {
        super("Age 20-40");
        setLayout(null);
        setBounds(0,0,500,500);

        txt_disease_ufd = new TextField();
        txt_drug_name_ufd = new TextField();
        txt_expiry_ufd = new TextField();
        txt_availability_ufd = new TextField();
        btn_next_ufd  = new Button("next");
        btn_prev_ufd = new Button("prev");
        btn_hom_ufd = new Button("HOME");
        lbl_disease = new Label("Disease");
        lbl_drug_name = new Label("Drug Name");
        lbl_expiry = new Label("Expiry");
        lbl_availability = new Label("Availability");
        font_bold = new Font("Arial",Font.BOLD,16);

        lbl_disease.setBounds(100,70,300,20);
        txt_disease_ufd.setBounds(100,100,300,40);

        lbl_drug_name.setBounds(100,150,300,20);
        txt_drug_name_ufd.setBounds(100,180,300,40);

        lbl_expiry.setBounds(100,230,300,20);
        txt_expiry_ufd.setBounds(100,260,300,40);

        lbl_availability.setBounds(100,300,300,20);
        txt_availability_ufd.setBounds(100,330,300,40);
       
        btn_next_ufd.setBounds(255,380,145,40);
        btn_prev_ufd.setBounds(100,380,145,40);
        btn_hom_ufd.setBounds(100,430,300,40);

        txt_disease_ufd.setFont(font_bold);
        txt_drug_name_ufd.setFont(font_bold);
        txt_expiry_ufd.setFont(font_bold);
        txt_availability_ufd.setFont(font_bold);
        btn_next_ufd.setFont(font_bold);
        btn_prev_ufd.setFont(font_bold);
        btn_hom_ufd.setFont(font_bold);
        lbl_disease.setFont(font_bold);
        lbl_drug_name.setFont(font_bold);
        lbl_expiry.setFont(font_bold);
        lbl_availability.setFont(font_bold);

        add(txt_disease_ufd);
        add(txt_drug_name_ufd);
        add(txt_expiry_ufd);
        add(txt_availability_ufd);
        add(btn_next_ufd);
        add(btn_prev_ufd);
        add(btn_hom_ufd);
        add(lbl_disease);
        add(lbl_drug_name);
        add(lbl_expiry);
        add(lbl_availability);
       
        btn_next_ufd.addActionListener(ml);
        btn_prev_ufd.addActionListener(ml);
        btn_hom_ufd.addActionListener(ml);
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
        UnderFortyDisplay underFortyObject = new   UnderFortyDisplay();
        underFortyObject.setVisible(true);
    }
}