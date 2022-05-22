package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class ReportsDisplay extends Frame 
{
    TextField txt_email;
    Button btn_send_mail;
    Font font_bold;
    Label lbl_mail_entry;
    MyActionListener ml = new MyActionListener(this);
    ReportsDisplay()
    {
        super();
        setLayout(null);
        setBounds(0,0,600,500);

        txt_email = new TextField();
        btn_send_mail = new Button("GET REPORT");
        font_bold = new Font("Arial",Font.BOLD,16);
        lbl_mail_entry = new Label("Enter Mail");

        lbl_mail_entry.setBounds(100,50,300,40);
        txt_email.setBounds(100,100,300,60);
        btn_send_mail.setBounds(170,180,150,50);

        lbl_mail_entry.setFont(font_bold);
        txt_email.setFont(font_bold);
        btn_send_mail.setFont(font_bold);

        add(lbl_mail_entry);
        add(txt_email);
        add(btn_send_mail);

        btn_send_mail.addActionListener(ml);
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
        ReportsDisplay reportObject = new  ReportsDisplay();
        reportObject.setVisible(true);
    }  
}