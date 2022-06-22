package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
//import pharmacy.DosageDisplay;
public class MyActionListener implements ActionListener,ItemListener
{
    DataBaseMethods data_method_object;
    Admin ad1;
    Display dp;
    DiseaseBasedDisplay diseaseObject;
    AgeBasedDisplay ageBasedObject;
    DrugsDisplay drugsObject ;
    MainDisplay  mainDisplayObject;
    ReportsDisplay reportObject;
    PriscriptionsDisplay prisciptionsObject;
    OverFortyDisplay overFortyObject;
    UnderFortyDisplay underFortyObject;
    DeficiencyDisplay  deficiencyObject;
    UnderTenDisplay underTenObject;
    UnderTwentyDisplay underTwentyObject;
    PhysiologicalDisplay physiologicalObject;
    InfectiousDisplay infectiousObject;
    HereditaryDisplay hereditaryObject;
    ReportTypeDisplay reportTypeObject;
    DosageDisplay dosageObject;
    AddingDrugDisplay addDrugObject;
    Drugs drugObject;
    ArrayList <Deficiency> deficiency = new ArrayList<Deficiency>();
    ArrayList <Infectious> infectious = new ArrayList<Infectious>();
    ArrayList <Hereditary> hereditary = new ArrayList<Hereditary>();
    ArrayList <Phsiological> phsiological = new ArrayList<Phsiological>();
    ArrayList <UnderTenDrugs> underTenDrugs = new ArrayList<UnderTenDrugs>();
    ArrayList <UnderTwentyDrugs> underTwentyDrugs  = new ArrayList<UnderTwentyDrugs>();
    ArrayList <UnderFortyDrugs> underFortyDrugs = new ArrayList<UnderFortyDrugs>();
    ArrayList <OverFortyDrugs> overFortyDrugs = new ArrayList<OverFortyDrugs>();
    ArrayList <Drugs> drugs = new ArrayList<Drugs>();
    ArrayList <String> dosage = new ArrayList<String>();

    MyActionListener(Display d)
    {
        this.dp=d;
    }
    MyActionListener(DiseaseBasedDisplay dbd)
    {
        this.diseaseObject=dbd;
    }
    MyActionListener(AgeBasedDisplay abd)
    {
        this.ageBasedObject =abd;
    }
    MyActionListener(DrugsDisplay dd)
    {
        this.drugsObject=dd;
    }
    MyActionListener(MainDisplay md)
    {
        this.mainDisplayObject = md;
    }
    MyActionListener(ReportsDisplay rd)
    {
        this.reportObject =rd;
    }
    MyActionListener(PriscriptionsDisplay pd)
    {
        this.prisciptionsObject = pd;
    }
    MyActionListener(OverFortyDisplay ofd)
    {
        this.overFortyObject = ofd;
    }
    MyActionListener(UnderFortyDisplay ufd)
    {
      this.underFortyObject = ufd;
    }
    MyActionListener(DeficiencyDisplay dfd)
    {
      this.deficiencyObject =dfd; 
    }
    MyActionListener(UnderTenDisplay ut)
    {
       this.underTenObject = ut; 
    }
    MyActionListener( UnderTwentyDisplay uttd)
    {
       this.underTwentyObject = uttd;
    }
    MyActionListener( PhysiologicalDisplay phd)
    {
      this. physiologicalObject= phd;
    }
    MyActionListener(InfectiousDisplay id)
    {
        this.infectiousObject = id;
    }
    MyActionListener(HereditaryDisplay hd)
    {
       this.hereditaryObject = hd; 
    }
    MyActionListener(ReportTypeDisplay rtd)
    {
        this.reportTypeObject = rtd;
    }
    MyActionListener(DosageDisplay dsgd)
    {
        this.dosageObject =dsgd;
    }
    MyActionListener(AddingDrugDisplay add)
    {
        this.addDrugObject = add;
    }
    MyActionListener(Admin ad)
    {
        this.ad1 = ad;
    }
     public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getStateChange()==ie.SELECTED)
        {
            dosage.add(ie.getItem().toString());
            try {
                FileWriter fw = new FileWriter("dosage.txt");
                fw.write(dosage.toString());
                fw.close();
            } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e, "Exception", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            dosage.remove(ie.getItem().toString());
        }
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Display dp = new Display();
        DiseaseBasedDisplay diseaseObject = new DiseaseBasedDisplay();
        AgeBasedDisplay ageBasedObject = new  AgeBasedDisplay() ;
        DrugsDisplay drugsObject = new DrugsDisplay() ;
        MainDisplay  mainDisplayObject = new MainDisplay();
        ReportsDisplay reportObject = new  ReportsDisplay();
        PriscriptionsDisplay prisciptionsObject = new PriscriptionsDisplay();
        OverFortyDisplay overFortyObject = new  OverFortyDisplay();
        UnderFortyDisplay underFortyObject = new  UnderFortyDisplay();
        DeficiencyDisplay  deficiencyObject = new  DeficiencyDisplay();
        UnderTenDisplay underTenObject = new  UnderTenDisplay();
        UnderTwentyDisplay underTwentyObject = new  UnderTwentyDisplay();
        PhysiologicalDisplay physiologicalObject = new PhysiologicalDisplay();
        InfectiousDisplay infectiousObject = new  InfectiousDisplay();
        HereditaryDisplay hereditaryObject = new  HereditaryDisplay();
        ReportTypeDisplay reportTypeObject = new ReportTypeDisplay();
        DosageDisplay dosageObject = new DosageDisplay();
        AddingDrugDisplay addDrugObject = new AddingDrugDisplay();
        DataBaseMethods data_method_object = new DataBaseMethods();  
        Admin ad1 = new Admin(40, "50");
        ad1.admin_id = 30;
        ad1.admin_pass ="40";
        Integer pass = Integer.parseInt(ad1.admin_pass);
        if(e.getActionCommand().equals("Log In"))
        {
            System.out.println(this.dp.txt_admin_id.getText());
            System.out.println(this.dp.txt_admin_pass.getText());
            Integer num_id = Integer.parseInt(this.dp.txt_admin_id.getText());
            Integer num_pass = Integer.parseInt(this.dp.txt_admin_pass.getText());
            if(ad1.admin_id==num_id && pass==num_pass)
            {
                this.dp.setVisible(false);
                mainDisplayObject.setVisible(true);   
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Incorrect id or password","Error",JOptionPane.INFORMATION_MESSAGE);  
            }
   
        }
       if(e.getActionCommand().equals("DRUGS")) 
       {
          this.mainDisplayObject.setVisible(false);
          drugsObject.setVisible(true);
       }
       if(e.getActionCommand().equals("AGE GROUPS"))
       {
          this.drugsObject.setVisible(false);
          ageBasedObject.setVisible(true);
       }
       if(e.getActionCommand().equals("DISEASE TYPE"))
       {
           this.drugsObject.setVisible(false);
           diseaseObject.setVisible(true);
       }
       if(e.getActionCommand().equals("ADD DRUG"))
       {
          this.drugsObject.setVisible(false);
          addDrugObject.setVisible(true);
       }
       if(e.getActionCommand().equals("0-10"))
       {
           this. ageBasedObject.setVisible(false);
           underTenObject.setVisible(true);
       }
       if(e.getActionCommand().equals("10-20"))
       {
           this. ageBasedObject.setVisible(false);
           underTwentyObject.setVisible(true);
       }
       if(e.getActionCommand().equals("20-40"))
       {
            this. ageBasedObject.setVisible(false);
            underFortyObject.setVisible(true);
       }
       if(e.getActionCommand().equals("40+"))
       {
           this. ageBasedObject.setVisible(false);
           overFortyObject.setVisible(true);
       }
       if(e.getActionCommand().equals("INFECTIOUS"))
       {
            this.diseaseObject.setVisible(false);
            infectiousObject.setVisible(true);
       }
       if(e.getActionCommand().equals("DEFICIENCY"))
       {
            this.diseaseObject.setVisible(false);
            deficiencyObject.setVisible(true);
       }
       if(e.getActionCommand().equals("HEREDITARY"))
       {
            this.diseaseObject.setVisible(false);
            hereditaryObject.setVisible(true);
       }
       if(e.getActionCommand().equals("PHYSIOLOGICAL"))
       {
            this.diseaseObject.setVisible(false);
            physiologicalObject.setVisible(true);
       }
       if(e.getActionCommand().equals("PRESCRIPTIONS"))
       {
            this.mainDisplayObject.setVisible(false);
            prisciptionsObject.setVisible(true);
       }
       if(e.getActionCommand().equals("REPORTS"))
       {
            this.mainDisplayObject.setVisible(false);
            reportObject.setVisible(true);
       }
       if(e.getActionCommand().equals("FRONT PAGE"))
       {
            this.ageBasedObject.setVisible(false);  
            mainDisplayObject.setVisible(true);
       }
       if(e.getActionCommand().equals("FRONT VIEW"))
       {
            this.diseaseObject.setVisible(false); 
            mainDisplayObject.setVisible(true); 
       }
       if(e.getActionCommand().equals("FIRST VIEW"))
       {
             this.drugsObject.setVisible(false);
             mainDisplayObject.setVisible(true); 
       }
       if(e.getActionCommand().equals("BACK"))
       {
             this.prisciptionsObject.setVisible(false); 
             mainDisplayObject.setVisible(true); 
       }
       if(e.getActionCommand().equals("RETURN"))
       {
            this.reportObject.setVisible(false); 
            mainDisplayObject.setVisible(true);  
       }
       if(e.getActionCommand().equals("CLOSE"))
       { 
             System.exit(0); 
       }
       if(e.getActionCommand().equals("DOSAGE"))
       {
            this.prisciptionsObject.setVisible(false);
            dosageObject.setVisible(true);
            
       }
       if(e.getActionCommand().equals("show") )//&& dosage.get(0).equals("Head pain"))
       {
           char ch[] = new char[40];
           try {
              FileReader fr = new FileReader("dosage.txt");
              fr.read(ch);
              fr.close();
              String dosageTest = new String(ch);
              System.out.println(dosageTest);
              if(dosageTest.contains("Head pain") && dosageTest.contains("fever"))
              {
                this.dosageObject.txt_suspected_illness.setText("Malaria");
                this.dosageObject.txt_drug_one.setText("panadol");
                this.dosageObject.txt_drug_two.setText("buffen");
                this.dosageObject.txt_drug_three.setText("LA");
              }
              else if(dosageTest.contains("vomiting") && dosageTest.contains("Diarrhea") )
              {
                this.dosageObject.txt_suspected_illness.setText("Cholera");
                this.dosageObject.txt_drug_one.setText("Orfloxacin");
                this.dosageObject.txt_drug_two.setText("TMP-SMX");
                this.dosageObject.txt_drug_three.setText("ciprofloxacin");
              }
              else if(dosageTest.contains("cough") && dosageTest.contains("flu"))
              {
                this.dosageObject.txt_suspected_illness.setText("Flu");
                this.dosageObject.txt_drug_one.setText("baloxavir marboxil");
                this.dosageObject.txt_drug_two.setText("oseltamivir");
                this.dosageObject.txt_drug_three.setText("peramivir");   
              }
              else if(dosageTest.contains("fever") && dosageTest.contains("cough"))
              {
                this.dosageObject.txt_suspected_illness.setText("Fever");
                this.dosageObject.txt_drug_one.setText("Naprosyn");
                this.dosageObject.txt_drug_two.setText("Naprelan");
                this.dosageObject.txt_drug_three.setText("Aflaxen");  
              }
              else if(dosageTest.contains("Nausea") && dosageTest.contains("Congestion"))
              {
                this.dosageObject.txt_suspected_illness.setText("stomach flu");
                this.dosageObject.txt_drug_one.setText("Kaopectate");
                this.dosageObject.txt_drug_two.setText(" Pepto-Bismol");
                this.dosageObject.txt_drug_three.setText("N/A");  
              }
              else if(dosageTest.contains("Spinal") && dosageTest.contains("Muscle"))
              {
                this.dosageObject.txt_suspected_illness.setText("Spinal muscular atrophy");
                this.dosageObject.txt_drug_one.setText("nusinersen");
                this.dosageObject.txt_drug_two.setText("Zolgensma");
                this.dosageObject.txt_drug_three.setText("Evrysdi");
              }
              else if(dosageTest.contains("fever") && dosageTest.contains("vomiting"))
              {
                this.dosageObject.txt_suspected_illness.setText("gastroenteritis");
                this.dosageObject.txt_drug_one.setText("promethazine");
                this.dosageObject.txt_drug_two.setText("prochlorperazine ");
                this.dosageObject.txt_drug_three.setText("droperidol");
              }
              else if(dosageTest.contains("Skin rash") && dosageTest.contains("fever"))
              {
                this.dosageObject.txt_suspected_illness.setText("mononucleosis");
                this.dosageObject.txt_drug_one.setText("ganciclovir");
                this.dosageObject.txt_drug_two.setText("interferon-gamma");
                this.dosageObject.txt_drug_three.setText("acyclovir");
              }
              else if(dosageTest.contains("Tooth ache") && dosageTest.contains("Sore throat"))
              {
                this.dosageObject.txt_suspected_illness.setText("common cold");
                this.dosageObject.txt_drug_one.setText("Afrin");
                this.dosageObject.txt_drug_two.setText("Sudafed PE");
                this.dosageObject.txt_drug_three.setText("pseudoephedrine");
              }
              else if(dosageTest.contains("Stomach ache") && dosageTest.contains("fever"))
              {
                this.dosageObject.txt_suspected_illness.setText("gastroenteritis");
                this.dosageObject.txt_drug_one.setText("Imodium");
                this.dosageObject.txt_drug_two.setText("Kaopectate");
                this.dosageObject.txt_drug_three.setText("Pepto-Bismol");
              }
              else if(dosageTest.contains("Neck pain") && dosageTest.contains("Spinal"))
              {
                this.dosageObject.txt_suspected_illness.setText("osteoarthritis");
                this.dosageObject.txt_drug_one.setText("Motrin");
                this.dosageObject.txt_drug_two.setText("Advil");
                this.dosageObject.txt_drug_three.setText("naproxen");
              }
              else
              {
                JOptionPane.showMessageDialog(null, "No Illness Found");   
              }
           } catch (Exception excp) {
            JOptionPane.showMessageDialog(null,excp,"Exception",JOptionPane.INFORMATION_MESSAGE);
           }
          
       }
       if(e.getActionCommand().equals("GET REPORT"))
       {
          //  this.reportObject.setVisible(false); 
          //  reportTypeObject.setVisible(true); 
          JOptionPane.showMessageDialog(null, "SMTP Config Error", "Error", JOptionPane.INFORMATION_MESSAGE);
       }
       if(e.getActionCommand().equals("CANCEL"))
       {
           this.dosageObject.setVisible(false);
           mainDisplayObject.setVisible(true);
       }
       if(e.getActionCommand().equals("SAVE"))
       {
           JOptionPane.showMessageDialog(null, "Administered Dosage Successfully","Dosage", JOptionPane.INFORMATION_MESSAGE);
           this.dosageObject.setVisible(false);
           prisciptionsObject.setVisible(true);
         //Write to file as Administered Dosage.  
       }
       //for under ten
       if(e.getActionCommand().equals(".Exit"))
       {
           this.underTenObject.setVisible(false);
           drugsObject.setVisible(true);
       }
       if(e.getActionCommand().equals(".Get"))
       {
        JOptionPane.showMessageDialog(null,"Work in Progress", "Notice", JOptionPane.INFORMATION_MESSAGE); 
       }
       if(e.getActionCommand().equals(""))
       {
           
       }
       //for under twenty
       if(e.getActionCommand().equals("Exit,"))
       {
            this.underTwentyObject.setVisible(false);
            drugsObject.setVisible(true);
       }
       if(e.getActionCommand().equals("Get,"))
       {
        JOptionPane.showMessageDialog(null,"Work in Progress", "Notice", JOptionPane.INFORMATION_MESSAGE);
       }
       if(e.getActionCommand().equals(""))
       {
           
       }
       //for under forty
       if(e.getActionCommand().equals(".Exit."))
       {
            this.underFortyObject.setVisible(false);
            drugsObject.setVisible(true);  
       }
       if(e.getActionCommand().equals(".Get."))
       {
        JOptionPane.showMessageDialog(null,"Work in Progress", "Notice", JOptionPane.INFORMATION_MESSAGE); 
       }
       if(e.getActionCommand().equals(""))
       {
           
       }
       //for above forty
       if(e.getActionCommand().equals(",Exit."))
       {
            this.overFortyObject.setVisible(false);
            drugsObject.setVisible(true); 
       }
       if(e.getActionCommand().equals(",Get."))
       {
        JOptionPane.showMessageDialog(null,"Work in Progress", "Notice", JOptionPane.INFORMATION_MESSAGE);
       }  
       if(e.getActionCommand().equals(""))
       {
      
       }
       //for phsiological diseases
       if(e.getActionCommand().equals("Exit."))
       {
           this.physiologicalObject.setVisible(false);
           drugsObject.setVisible(true);  
       }
       if(e.getActionCommand().equals("Get."))
       {
          // System.out.println(data_method_object.get_from_physiological());
        int m;
        for(m=0;m<5;m++)
        {
        String one_object = data_method_object.get_from_physiological(m);
        for(int i = 0; i<3;i++)
        {
            String obj_arr[] = one_object.split("#");
            System.out.println(obj_arr[i]);
            this.physiologicalObject.tab.setValueAt(obj_arr[0],m,0);
            this.physiologicalObject.tab.setValueAt(obj_arr[1],m,1);
            this.physiologicalObject.tab.setValueAt(obj_arr[2],m,2);
        } 
       } 
       }
       if(e.getActionCommand().equals(""))
       {
           
       }
        //for hereditary diseases
        if(e.getActionCommand().equals("Exit,,"))
        {
            this.hereditaryObject.setVisible(false);
            drugsObject.setVisible(true);
        }
       if(e.getActionCommand().equals("Get,,"))
       {
           
       }
       if(e.getActionCommand().equals(""))
       {
           
       }
        //for deficiency diseases
        if(e.getActionCommand().equals("..Exit"))
        {
            this.deficiencyObject.setVisible(false);
            drugsObject.setVisible(true);
        }
       if(e.getActionCommand().equals("..Get"))
       {
        JOptionPane.showMessageDialog(null,"Work in Progress", "Notice", JOptionPane.INFORMATION_MESSAGE);  
       }
       if(e.getActionCommand().equals(""))
       {
           
       }
        //for infectious diseases
        if(e.getActionCommand().equals("Exit.."))
        {
           this.infectiousObject.setVisible(false);
           drugsObject.setVisible(true);  
        }
       if(e.getActionCommand().equals("Get.."))
       {
           
       }
       if(e.getActionCommand().equals(""))
       {
           
       }
       if(e.getActionCommand().equals("Add"))
       {   
               String table_selection = this.addDrugObject.category.getSelectedItem().toString();
               System.out.println(table_selection);
               switch(table_selection)
               {
                   case "deficiency":
                   data_method_object.enter_into_deficiency(this.addDrugObject.txt_drug_name.getText(), this. addDrugObject.txt_expiry.getText(), Integer.parseInt(this. addDrugObject.txt_amount.getText()));
                   JOptionPane.showMessageDialog(null, "Successfully Added", "Admin Info", JOptionPane.INFORMATION_MESSAGE);
                   break;
                   case "infectious":
                   data_method_object.enter_into_infectious(this.addDrugObject.txt_drug_name.getText(), this. addDrugObject.txt_expiry.getText(), Integer.parseInt(this. addDrugObject.txt_amount.getText()));
                   JOptionPane.showMessageDialog(null, "Successfully Added", "Admin Info", JOptionPane.INFORMATION_MESSAGE);
                   break;
                   case "hereditary":
                   data_method_object.enter_into_hereditary(this.addDrugObject.txt_drug_name.getText(), this. addDrugObject.txt_expiry.getText(), Integer.parseInt(this. addDrugObject.txt_amount.getText()));
                   JOptionPane.showMessageDialog(null, "Successfully Added", "Admin Info", JOptionPane.INFORMATION_MESSAGE);
                   break;
                   case "physiological":
                   data_method_object.enter_into_physiological(this.addDrugObject.txt_drug_name.getText(), this. addDrugObject.txt_expiry.getText(), Integer.parseInt(this. addDrugObject.txt_amount.getText()));
                   JOptionPane.showMessageDialog(null, "Successfully Added", "Admin Info", JOptionPane.INFORMATION_MESSAGE);
                   break;
                   case "underten":
                   data_method_object.enter_into_under_ten(this.addDrugObject.txt_drug_name.getText(), this. addDrugObject.txt_expiry.getText(), Integer.parseInt(this. addDrugObject.txt_amount.getText()));
                   JOptionPane.showMessageDialog(null, "Successfully Added", "Admin Info", JOptionPane.INFORMATION_MESSAGE);
                   break;
                   case "undertwenty":
                   data_method_object.enter_into_under_twenty(this.addDrugObject.txt_drug_name.getText(), this. addDrugObject.txt_expiry.getText(), Integer.parseInt(this. addDrugObject.txt_amount.getText()));
                   JOptionPane.showMessageDialog(null, "Successfully Added", "Admin Info", JOptionPane.INFORMATION_MESSAGE);
                   break;
                   case "underforty":
                   data_method_object.enter_into_under_forty(this.addDrugObject.txt_drug_name.getText(), this. addDrugObject.txt_expiry.getText(), Integer.parseInt(this. addDrugObject.txt_amount.getText()));
                   JOptionPane.showMessageDialog(null, "Successfully Added", "Admin Info", JOptionPane.INFORMATION_MESSAGE);
                   break;
                   case "overforty":
                   data_method_object.enter_into_over_forty(this.addDrugObject.txt_drug_name.getText(), this. addDrugObject.txt_expiry.getText(), Integer.parseInt(this. addDrugObject.txt_amount.getText()));
                   JOptionPane.showMessageDialog(null, "Successfully Added", "Admin Info", JOptionPane.INFORMATION_MESSAGE);
                   break;
                   default:
                   JOptionPane.showMessageDialog(null, "Invalid Category", "Error", JOptionPane.INFORMATION_MESSAGE);
                   break;
               }
            this.addDrugObject.txt_drug_name.setText("");
            this.addDrugObject.txt_expiry.setText("");
            this.addDrugObject.txt_amount.setText("");
       }
       if(e.getActionCommand().equals("Discard"))
       {
             this.addDrugObject.setVisible(false);
             drugsObject.setVisible(true);
       }
       if(e.getActionCommand().equals(""))
       {
           
       }
       if(e.getActionCommand().equals(""))
       {
           
       }
       if(e.getActionCommand().equals(""))
       {
           
       }
       

    }
    
}