/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5uts;

/**
 *
 * @author ASUS
 */
public class main {
    
    public static void main(String[] args) {
            
        JajarGenjang oJG = new JajarGenjang(50, 60, 70, 80, 100, 120);
        oJG.hitungKeliling();
        oJG.hitungLuas();
        Segitiga oSG = new Segitiga(50, 60, 70, 100, 120);
        oSG.hitungKeliling();
        oSG.hitungLuas();
    }
    
}
