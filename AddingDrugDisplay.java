package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class AddingDrugDisplay extends Frame 
{
    TextField txt_drug_name,txt_expiry,txt_amount;
    Label lbl_drug_name,lbl_expiry,lbl_amount;
    Button btn_add,btn_cancel;
    Font font_bold;
    MyActionListener ml = new MyActionListener(this);
    AddingDrugDisplay()
    {
        super("Add Drug");
        setLayout(null);
        setBounds(0,0,500,500);
        
        txt_drug_name = new TextField();
        txt_expiry = new TextField();
        txt_amount = new TextField();
        lbl_drug_name = new Label("Drug Name");
        lbl_expiry = new Label("Expiry Date");
        lbl_amount = new Label("Availability");
        btn_add = new Button("Add");
        btn_cancel = new Button("Discard");
        font_bold = new Font("Arial",Font.BOLD,16);

        lbl_drug_name.setBounds(100,70,300,20); 
        txt_drug_name.setBounds(100,100,300,40); 

        lbl_expiry.setBounds(100,150,300,20);
        txt_expiry.setBounds(100,180,300,40);  

        lbl_amount.setBounds(100,230,300,20);  
        txt_amount.setBounds(100,260,300,40); 
        
        btn_add.setBounds(180,310,150,50); 
        btn_cancel.setBounds(180,370,150,50); 

        txt_drug_name.setFont(font_bold);
        txt_expiry.setFont(font_bold); 
        txt_amount.setFont(font_bold); 
        lbl_drug_name.setFont(font_bold); 
        lbl_expiry.setFont(font_bold); 
        lbl_amount.setFont(font_bold); 
        btn_add.setFont(font_bold); 
        btn_cancel.setFont(font_bold);
        
        add(txt_drug_name);
        add(txt_expiry); 
        add(txt_amount); 
        add(lbl_drug_name); 
        add(lbl_expiry); 
        add(lbl_amount); 
        add(btn_add); 
        add(btn_cancel);

        btn_add.addActionListener(ml);
        btn_cancel.addActionListener(ml);
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
        AddingDrugDisplay addDrugObject = new AddingDrugDisplay();
        addDrugObject.setVisible(true);
    }  
}