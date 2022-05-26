package pharmacy;
public class UnderTenDrugs 
{
   
    String drug_name,expiry_date;
    Integer amount;
    UnderTenDrugs(String name, String date,Integer mount)
    {
        this.drug_name = name;
        this.expiry_date = date;
        this.amount=mount;
    }  
}