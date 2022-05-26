package pharmacy;
public class Drugs 
{
    String drug_name,expiry_date;
    Integer amount;
    Drugs(String name,String date, Integer mount)
    {
        this.drug_name = name;
        this.expiry_date = date;
        this.amount = mount;
    }
    public void add_drug()
    {

    }
    public void edit_drug()
    {

    }
    public void list_all_drugs()
    {
        
    }
    public String objectToString()
    {
        return this.drug_name+"#"+this.expiry_date+"#"+this.amount;
    }
    public static void main(String arg[])
     {
        
    }
    
}
