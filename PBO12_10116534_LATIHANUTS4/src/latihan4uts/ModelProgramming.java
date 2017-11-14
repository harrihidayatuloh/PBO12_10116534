/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4uts;

/**
 *
 * @author ASUS
 */
public class ModelProgramming extends ModelEmployee{
    int bonus;

    public ModelProgramming() {
        this.bonus = 60000;
    }

    public void bonusProgramming() {
        System.out.println("Salary Employee Programming = " + super.salary);
        System.out.println("Bonus Designer = " + bonus);
    }
}
    

