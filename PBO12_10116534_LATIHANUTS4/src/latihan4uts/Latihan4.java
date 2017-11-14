/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4uts;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Latihan4 {
    
       public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner oMD = new ModelDesigner();
        ModelProgramming oMP = new ModelProgramming();
        ModelSystemAnalyst oMSA = new ModelSystemAnalyst();
        
        oMD.bonusDesigner();
        oMP.bonusProgramming();
        oMSA.bonusSystemAnalyst();
       }
}
