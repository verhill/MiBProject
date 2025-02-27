/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib_projekt;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author David, William
 */

//Denna klass är enligt kravspecifikationen fristående och syftar till att validera användarinmatningen.
//Detta är om vi ska använda if(Inmatningsvalidering.textValidering(jtxtAlien)
//                                  try{
// Annars kan vi göra enskilda valideringar för vardera klass, vi får bestämma det
public class Inmatningsvalidering {
     
    // Metoden för att validera om textfältet är tomt
    public static boolean textValidering(JTextField Varde){
        
        //Om sann forsätter metoden
        boolean inmatat1 = true;
        if(Varde.getText().isEmpty()){
            //Om varde inte lagts in visas detta och metoden forsätter inte:
            JOptionPane.showMessageDialog(null, "Någon/några fält saknar värden");
            Varde.requestFocus();
            inmatat1  = false;
            
        }
        // Returnerar det inmatade värdet.
        return inmatat1;
    }
    
    //Metod för att validera att det faktiskt är en epost
    public static boolean emailValidering(JTextField Varde){
        boolean inmatat2 = false;
        //Gör om textfältet till en string
        String text = Varde.getText();
        //Kollar först om den är tom
        if(textValidering(Varde)){
            //Kollar ifall man använder sig utav @
            if(text.contains("@")){
               inmatat2 = true; 
            }
            else{
                JOptionPane.showMessageDialog(null, "För att det ska räknas som email behövs ett @");
                Varde.requestFocus();
            }
        }
        System.out.println(inmatat2);
        return inmatat2;        
    }
    
    //Metod för att validera att det är ett telefon nummer
    public static boolean telefonValidering(JTextField Varde){
        boolean inmatat3 = false;
        String text = Varde.getText();
        //Kollar om den är tom
        if(textValidering(Varde)){
            //Kollar så att det endast är minustecken och siffror
            //med hjälp av regex
            String regex1 = "\\d+-\\d+";
          if(text.matches(regex1)){
              inmatat3 = true;
          }
          else{
              JOptionPane.showMessageDialog(null, "Ett telefonnummer får endast innehålla siffror och - Ex: 000-111");
              Varde.requestFocus();
          }
        }
        return inmatat3;
    }
    
    public static boolean datumValidering(JTextField Varde){
        boolean inmatat4 = false;
        String text = Varde.getText();
        if(textValidering(Varde)){
            //Kollar ifall det är skrivet på åååå-mm-dd
            String regex = "\\d{4}-\\d{2}-\\d{2}";
            if(text.matches(regex)){
                inmatat4 = true;
                System.out.println("Såja");
            }
            else{
                JOptionPane.showMessageDialog(null, "Datumet är skrivet på fel format skriv åååå-mm-dd");
                Varde.requestFocus();
                System.out.println("Okej");
            }
        }
        return inmatat4;
    }
    
    
    
    
}

