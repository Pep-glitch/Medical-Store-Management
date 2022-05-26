package pharmacy;

public class Hereditary 
{
    String drug_name,expiry_date;
    Integer amount;
    Hereditary(String name, String date,Integer mount)
    {
        this.drug_name = name;
        this.expiry_date = date;
        this.amount=mount;
    }
}