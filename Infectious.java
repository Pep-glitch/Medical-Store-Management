package pharmacy;
public class Infectious
{
    
    String drug_name,expiry_date;
    Integer amount;
    Infectious(String name, String date,Integer mount)
    {
        this.drug_name = name;
        this.expiry_date = date;
        this.amount=mount;
    }
}