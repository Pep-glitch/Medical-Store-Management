package pharmacy;
public class Phsiological 
{
    
    String drug_name,expiry_date;
    Integer amount;
    Phsiological(String name, String date,Integer mount)
    {
        this.drug_name = name;
        this.expiry_date = date;
        this.amount=mount;
    }
}