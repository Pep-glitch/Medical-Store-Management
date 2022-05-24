package pharmacy;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
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
       /*
       if(e.getActionCommand().equals("HOME"))
       {
        // this.drugsObject.setVisible(false);
          mainDisplayObject.setVisible(true);
       }
       */
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
       if(e.getActionCommand().equals(""))
       {

       }
       if(e.getActionCommand().equals(""))
       {

       }

       //for Under Ten frame
       if(e.getSource().equals(this.underTenObject.btn_hom_utd))
       {
                this.underTenObject.setVisible(false);
                mainDisplayObject.setVisible(true);
       }
       if(e.getSource()== underTenObject.btn_next_utd)
       {

       }
       if(e.getSource()== underTenObject.btn_prev_utd)
       {

       }

      //for Under Twenty Frame
      //getName()
      if(e.getSource()==underTwentyObject.btn_hom_uttd)
      {
              this.underTwentyObject.setVisible(false);
              mainDisplayObject.setVisible(true);
      }
      if(e.getSource()==underTwentyObject.btn_next_uttd)
      {
          
      }
      if(e.getSource()==underTwentyObject.btn_prev_uttd)
      {
          
      }

      //for Under Forty frame
      if(e.getSource()==underFortyObject.btn_hom_ufd)
      {
               this.underFortyObject.setVisible(false);
               mainDisplayObject.setVisible(true);  
      }
      if(e.getSource()==underFortyObject.btn_next_ufd)
      {
          
      }
      if(e.getSource()==underFortyObject.btn_prev_ufd)
      {
          
      }

      //for OverForty Frame
      if(e.getSource()==overFortyObject.btn_hom_ofd)
      {
               this.overFortyObject.setVisible(false);
               mainDisplayObject.setVisible(true);
      }
      if(e.getSource()==overFortyObject.btn_next)
      {
          
      }
      if(e.getSource()==overFortyObject.btn_prev)
      {
          
      }

      //for Infectious Frame
      if(e.getSource()==infectiousObject.btn_hom_id)
      {
              this.infectiousObject.setVisible(false);
              mainDisplayObject.setVisible(true);
      }
      if(e.getSource()==infectiousObject.btn_next)
      {
          
      }
      if(e.getSource()==infectiousObject.btn_prev)
      {
          
      }

      //for Deficiency Frame
      if(e.getSource()==deficiencyObject.btn_hom_dd)
      {
              this.deficiencyObject.setVisible(false);
              mainDisplayObject.setVisible(true);
      }
      if(e.getSource()==deficiencyObject.btn_next)
      {
          
      }
      if(e.getSource()==deficiencyObject.btn_prev)
      {
          
      }

      //for Hereditary Frame
      if(e.getSource()== hereditaryObject.btn_hom_hd)
      {
            this.hereditaryObject.setVisible(false);
            mainDisplayObject.setVisible(true);
      }
      if(e.getSource()== hereditaryObject.btn_next)
      {
          
      }
      if(e.getSource()== hereditaryObject.btn_prev)
      {
          
      }

      //for Phsiological Frame
      if(e.getSource()== physiologicalObject.btn_hom_pyd)
      {
               this.physiologicalObject.setVisible(false);
               mainDisplayObject.setVisible(true); 
      }
      if(e.getSource()== physiologicalObject.btn_next)
      {
          
      }
      if(e.getSource()== physiologicalObject.btn_prev)
      {
          
      }
    }
    
}