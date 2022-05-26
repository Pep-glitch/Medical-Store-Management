package pharmacy;
public class Deficiency
{
    
    String drug_name,expiry_date;
    Integer amount;
    Deficiency(String name, String date,Integer mount)
    {
        this.drug_name = name;
        this.expiry_date = date;
        this.amount=mount;
    }
}