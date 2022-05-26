package pharmacy;
import java.io.FileReader;
import java.io.FileWriter;
public class Admin
{
    int admin_id;
    String admin_pass;
    Admin(int id,String pass)
    {
        this.admin_id=id;
        this.admin_pass=pass;
    }
    public String toString()
    {
      return this.admin_id+"#"+this.admin_pass;
    }
    /*
    public static String objectToString(Admin ad1)
    {
      
    }
    */
    public static boolean validate_user()throws Exception
    {
        String admin_det[];
        char ch[] = new char[30];
        FileReader fr = new FileReader("admin/login.txt");
        fr.read(ch);
        fr.close();
        String test_admin = new String(ch);
        //admin det stands for admin details
        admin_det = test_admin.split("#");
      
        //ch for used id in login screen
        char ch1[] = new char[30];
        FileReader fr1 = new FileReader("admintest/logid.txt");
        fr1.read(ch1);
        fr1.close();
        String id = new String(ch1);

        
        //ch for used pass in login screem
        char ch2[] = new char[30];
        FileReader fr2 = new FileReader("admintest/logpass.txt");
        fr2.read(ch2);
        fr2.close();
        String pass = new String(ch2);
        Integer  num_4_id = Integer .parseInt(admin_det[0].trim());
        Integer num_4_pass = Integer.parseInt(admin_det[1].trim());
        Integer  test_num_4_id =Integer .parseInt(id.trim());
        Integer test_num_4_pass = Integer.parseInt(pass.trim());
        if(num_4_id==test_num_4_id && num_4_pass==test_num_4_pass)
        {
            return true;
        }
        else
        {
           return false;
        } 
    }
    public static void main(String args[])
    {
      Admin ad1 = new Admin(20, "20");
      String object_value = ad1.toString();
      try {
       FileWriter fw = new FileWriter("admin/login.txt");
       fw.write(object_value);
       fw.close();
      } catch (Exception e) {
        System.out.println(e);
      }
    }
}