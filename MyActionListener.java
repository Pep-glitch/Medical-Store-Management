package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

//import pharmacy.DosageDisplay;
public class MyActionListener implements ActionListener,ItemListener
{
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
     public void itemStateChanged(ItemEvent ie)
    {

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


        if(e.getActionCommand().equals("Log In"))
        {
            this.dp.setVisible(false);
            mainDisplayObject.setVisible(true);
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
       if(e.getActionCommand().equals("GENERIC"))
       {
          this.drugsObject.setVisible(false);
          dp.setVisible(true);
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
       if(e.getActionCommand().equals("GET REPORT"))
       {
            this.reportObject.setVisible(false); 
            reportTypeObject.setVisible(true); 
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
       if(e.getActionCommand().equals("HOME"))
       {
           this.underTenObject.setVisible(false);
           mainDisplayObject.setVisible(true);
       }
       if(e.getActionCommand().equals("next"))
       {
            this.underTenObject.txt_disease_utd.setText("Lighton");
       }
       if(e.getActionCommand().equals("prev"))
       {
           
       }
       //for under twenty
       if(e.getActionCommand().equals("HOME PAGE"))
       {
            this.underTwentyObject.setVisible(false);
            mainDisplayObject.setVisible(true);
       }
       if(e.getActionCommand().equals("next."))
       {
          this.underTwentyObject.txt_disease_uttd.setText("Under Twenty"); 
       }
       if(e.getActionCommand().equals("prev."))
       {
           
       }
       //for under forty
       if(e.getActionCommand().equals("HOME VIEW"))
       {
            this.underFortyObject.setVisible(false);
            mainDisplayObject.setVisible(true);  
       }
       if(e.getActionCommand().equals(".next"))
       {
           this.underFortyObject.txt_disease_ufd.setText("Under forty");
       }
       if(e.getActionCommand().equals(".prev"))
       {
           
       }
       //for above forty
       if(e.getActionCommand().equals("MAIN"))
       {
            this.overFortyObject.setVisible(false);
            mainDisplayObject.setVisible(true); 
       }
       if(e.getActionCommand().equals("next,"))
       {
          this.overFortyObject.txt_disease_ofd.setText("above 40"); 
       }  
       if(e.getActionCommand().equals("prev,"))
       {
           
       }
       //for phsiological diseases
       if(e.getActionCommand().equals("FIRST PAGE"))
       {
           this.physiologicalObject.setVisible(false);
           mainDisplayObject.setVisible(true);  
       }
       if(e.getActionCommand().equals("next-"))
       {
           
       }
       if(e.getActionCommand().equals("-prev"))
       {
           
       }
        //for hereditary diseases
        if(e.getActionCommand().equals("START VIEW"))
        {
            this.hereditaryObject.setVisible(false);
            mainDisplayObject.setVisible(true);
        }
       if(e.getActionCommand().equals(",next"))
       {
           
       }
       if(e.getActionCommand().equals(",prev"))
       {
           
       }
        //for deficiency diseases
        if(e.getActionCommand().equals("START PAGE"))
        {
            this.deficiencyObject.setVisible(false);
            mainDisplayObject.setVisible(true);
        }
       if(e.getActionCommand().equals("-next"))
       {
           
       }
       if(e.getActionCommand().equals("prev-"))
       {
           
       }
        //for infectious diseases
        if(e.getActionCommand().equals("START"))
        {
           this.infectiousObject.setVisible(false);
           mainDisplayObject.setVisible(true);  
        }
       if(e.getActionCommand().equals(".next."))
       {
           
       }
       if(e.getActionCommand().equals(".prev."))
       {
           
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
       if(e.getActionCommand().equals(""))
       {
           
       }
       if(e.getActionCommand().equals(""))
       {
           
       }

    }
    
}