package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class InfectiousDisplay extends Frame
{
   
    TextField txt_disease_id,txt_drug_name_id,txt_expiry_id,txt_availability_id;
    Label lbl_disease,lbl_drug_name,lbl_expiry,lbl_availability;
    Button btn_next, btn_prev,btn_hom_id;
    Font font_bold;
    MyActionListener ml = new MyActionListener(this);
    InfectiousDisplay()
    {
        super("Infectious Diseases");
        setLayout(null);
        setBounds(0,0,500,500);
        
          
        txt_disease_id = new TextField();
        txt_drug_name_id = new TextField();
        txt_expiry_id = new TextField();
        txt_availability_id = new TextField();
        btn_next  = new Button("next");
        btn_prev = new Button("prev");
        btn_hom_id = new Button("HOME");
        lbl_disease = new Label("Disease");
        lbl_drug_name = new Label("Drug Name");
        lbl_expiry = new Label("Expiry");
        lbl_availability = new Label("Availability");
        font_bold = new Font("Arial",Font.BOLD,16);

        lbl_disease.setBounds(100,70,300,20);
        txt_disease_id.setBounds(100,100,300,40);

        lbl_drug_name.setBounds(100,150,300,20);
        txt_drug_name_id.setBounds(100,180,300,40);

        lbl_expiry.setBounds(100,230,300,20);
        txt_expiry_id.setBounds(100,260,300,40);

        lbl_availability.setBounds(100,300,300,20);
        txt_availability_id.setBounds(100,330,300,40);
       
        btn_next.setBounds(255,380,145,40);
        btn_prev.setBounds(100,380,145,40);
        btn_hom_id.setBounds(100,430,300,40);

        txt_disease_id.setFont(font_bold);
        txt_drug_name_id.setFont(font_bold);
        txt_expiry_id.setFont(font_bold);
        txt_availability_id.setFont(font_bold);
        btn_next.setFont(font_bold);
        btn_prev.setFont(font_bold);
        btn_hom_id.setFont(font_bold);
        lbl_disease.setFont(font_bold);
        lbl_drug_name.setFont(font_bold);
        lbl_expiry.setFont(font_bold);
        lbl_availability.setFont(font_bold);

        add(txt_disease_id);
        add(txt_drug_name_id);
        add(txt_expiry_id);
        add(txt_availability_id);
        add(btn_next);
        add(btn_prev);
        add(btn_hom_id);
        add(lbl_disease);
        add(lbl_drug_name);
        add(lbl_expiry);
        add(lbl_availability);
       
        btn_next.addActionListener(ml);
        btn_prev.addActionListener(ml);
        btn_hom_id.addActionListener(ml);
       
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