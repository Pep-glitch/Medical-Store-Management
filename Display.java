package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.awt.Color.*;
public class Display extends Frame
{
    TextField txt_admin_id,txt_admin_pass;
    Label lbl_admin_id, lbl_admin_pass;
    Button btn_login;
    Font font_bold;
    Color bgColor;
    Icon image;
    MyActionListener ml = new MyActionListener(this);
    Display()
    {
        super("Admin Log In");
        setLayout(null);
        setBounds(460,130,600,500);

        bgColor = new Color(100,200,100);
        setBackground(bgColor);
       

        lbl_admin_id = new Label("Admin ID");
        lbl_admin_pass= new Label("Admin Password");
        txt_admin_id = new TextField();
        txt_admin_pass = new TextField();
        btn_login = new Button("Log In");
        font_bold = new Font("sans-serif",Font.BOLD,16);

        lbl_admin_id.setBounds(200,70,200,30);
        txt_admin_id.setBounds(200,100,200,50);
        lbl_admin_pass.setBounds(200,190,200,30);
        txt_admin_pass.setBounds(200,220,200,50);
        btn_login.setBounds(200,300,150,80);

        lbl_admin_id.setFont(font_bold);
        lbl_admin_pass.setFont(font_bold);
        btn_login.setFont(font_bold);

       // add(font_bold);
        add( lbl_admin_id);
        add( lbl_admin_pass);
        add(txt_admin_id);
        add(txt_admin_pass);
        add(btn_login);

        btn_login.addActionListener(ml);
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
        Display dp = new Display();
        dp.setVisible(true);
    }
}