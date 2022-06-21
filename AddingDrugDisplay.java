package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class AddingDrugDisplay extends Frame 
{
    TextField txt_drug_name,txt_expiry,txt_amount;//txt_category;
    Label lbl_drug_name,lbl_expiry,lbl_amount,lbl_cat;
    Button btn_add,btn_cancel;
    JComboBox<String> category;
    Font font_bold;
    String[] cat = {"underten","undertwenty","underforty","overforty","deficiency","infectious","hereditary","physiological"};
    MyActionListener ml = new MyActionListener(this);
    AddingDrugDisplay()
    {
        super("Add Drug");
        setLayout(null);
        setBounds(460,130,500,520);
        
        txt_drug_name = new TextField();
        txt_expiry = new TextField();
        txt_amount = new TextField();
        //txt_category = new TextField();
        category = new JComboBox<String>(cat);
        lbl_drug_name = new Label("Drug Name");
        lbl_expiry = new Label("Expiry Date");
        lbl_amount = new Label("Availability");
        lbl_cat = new Label("Category");
        btn_add = new Button("Add");
        btn_cancel = new Button("Discard");
        font_bold = new Font("Arial",Font.BOLD,16);

        lbl_drug_name.setBounds(100,70,300,20); 
        txt_drug_name.setBounds(100,100,300,40); 

        lbl_expiry.setBounds(100,150,300,20);
        txt_expiry.setBounds(100,180,300,40);  

        lbl_amount.setBounds(100,230,300,20);  
        txt_amount.setBounds(100,260,300,40); 
        
        lbl_cat.setBounds(100,310,300,20); 
        category.setBounds(100,340,300,40); 

        btn_add.setBounds(180,390,150,50);
        btn_cancel.setBounds(180,450,150,50);

        txt_drug_name.setFont(font_bold);
        category.setFont(font_bold);
        txt_expiry.setFont(font_bold); 
        txt_amount.setFont(font_bold); 
        lbl_drug_name.setFont(font_bold); 
        lbl_cat.setFont(font_bold);
        lbl_expiry.setFont(font_bold); 
        lbl_amount.setFont(font_bold); 
        btn_add.setFont(font_bold); 
        btn_cancel.setFont(font_bold);
        
        add(txt_drug_name);
        add(category);
        add(txt_expiry); 
        add(txt_amount); 
        add(lbl_drug_name); 
        add(lbl_cat);
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