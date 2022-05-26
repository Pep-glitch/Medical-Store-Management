package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class PhysiologicalDisplay extends Frame
{
   
    TextField txt_disease_pyd,txt_drug_name_pyd,txt_expiry_pyd,txt_availability_pyd;
    Label lbl_disease,lbl_drug_name,lbl_expiry,lbl_availability;
    Button btn_next, btn_prev,btn_hom_pyd;
    Font font_bold;
    MyActionListener ml = new MyActionListener(this);
    PhysiologicalDisplay()
    {
        super("Physiological Diseases");
        setLayout(null);
        setBounds(460,130,500,500);
        
           
        txt_disease_pyd = new TextField();
        txt_drug_name_pyd = new TextField();
        txt_expiry_pyd = new TextField();
        txt_availability_pyd = new TextField();
        btn_next  = new Button("next-");
        btn_prev = new Button("-prev");
        btn_hom_pyd = new Button("FIRST PAGE");
        lbl_disease = new Label("Disease");
        lbl_drug_name = new Label("Drug Name");
        lbl_expiry = new Label("Expiry");
        lbl_availability = new Label("Availability");
        font_bold = new Font("Arial",Font.BOLD,16);

        lbl_disease.setBounds(100,70,300,20);
        txt_disease_pyd.setBounds(100,100,300,40);

        lbl_drug_name.setBounds(100,150,300,20);
        txt_drug_name_pyd.setBounds(100,180,300,40);

        lbl_expiry.setBounds(100,230,300,20);
        txt_expiry_pyd.setBounds(100,260,300,40);

        lbl_availability.setBounds(100,300,300,20);
        txt_availability_pyd.setBounds(100,330,300,40);
       
        btn_next.setBounds(255,380,145,40);
        btn_prev.setBounds(100,380,145,40);
        btn_hom_pyd.setBounds(100,430,300,40);

        txt_disease_pyd.setFont(font_bold);
        txt_drug_name_pyd.setFont(font_bold);
        txt_expiry_pyd.setFont(font_bold);
        txt_availability_pyd.setFont(font_bold);
        btn_next.setFont(font_bold);
        btn_prev.setFont(font_bold);
        btn_hom_pyd.setFont(font_bold);
        lbl_disease.setFont(font_bold);
        lbl_drug_name.setFont(font_bold);
        lbl_expiry.setFont(font_bold);
        lbl_availability.setFont(font_bold);

        add(txt_disease_pyd);
        add(txt_drug_name_pyd);
        add(txt_expiry_pyd);
        add(txt_availability_pyd);
        add(btn_next);
        add(btn_prev);
        add(btn_hom_pyd);
        add(lbl_disease);
        add(lbl_drug_name);
        add(lbl_expiry);
        add(lbl_availability);
       
        btn_next.addActionListener(ml);
        btn_prev.addActionListener(ml);
        btn_hom_pyd.addActionListener(ml);
       
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