//set classpath=mysql-connector.jar;.;
package pharmacy; 
import java.util.*;
import javax.swing.JOptionPane;
import java.sql.*;
public class DataBaseMethods
{
    public  void enter_into_deficiency(String name,String date, Integer value)
    {
       
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost/medical storre management?characterEncoding=utf8","root","");  
            String query ="INSERT INTO  `deficiency` (`Name`, `Date`, `Amount`) VALUES (?,?,?)";	 
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1,name);
            stmt.setString(2,date );
            stmt.setInt(3,value );	
			int send = stmt.executeUpdate();
			con.close();  
            System.out.println(value);
            System.out.println(name);
            System.out.println(date);
		}
		catch(Exception e)
		{ 
			JOptionPane.showMessageDialog(null, e, "Exception", JOptionPane.INFORMATION_MESSAGE);
		}  
	  
    }
     void enter_into_hereditary()
    {

    }
    public void enter_into_infectious()
    {

    }
    public void enter_into_physiological()
    {

    }
    public void enter_into_under_ten()
    {

    }
    public void enter_into_under_twenty()
    {

    }
    public void enter_into_under_forty()
    {

    }
    public void enter_into_over_forty()
    {

    }
    public void get_from_deficiency()
    {

    }
    public void get_from_hereditary()
    {

    }
    public void get_from_infectious()
    {

    }
    public void get_from_physiological()
    {

    }
    public void get_from_under_ten()
    {

    }
    public void get_from_under_twenty()
    {

    }
    public void get_from_under_forty()
    {

    }
    public void get_from_over_forty()
    {
        
    }
    public static void main(String str[])
    {
        DataBaseMethods data_method_object = new DataBaseMethods();  
    }
}