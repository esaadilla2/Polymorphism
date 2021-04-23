/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author MOKLET-2
 */
public class AeroPlan extends Vechile{
    public void walk(){
        System.out.println("Aeroplan is flying");
    }
    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan();
        garuda.funtion();
        garuda.fuel();
        garuda.walk();
    }
}
