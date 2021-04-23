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
public final class OperasiBilCetak {
    private final void cetakSemua(OperasiBil[]OB, double a, double b){
        System.out.println("Operasi Bilangan");
        System.out.println("-------");
        
        for (int i=0;i<OB.length;i++){
            OB[i].set_A(10.5);
            OB[i].set_B(4.5);
            OB[i].tampil();
        }
    }
    public static void main(String[] args) {
        OperasiBil [] OB={
        new Jumlah(),
        new Pengurangan(),
        new Perkalian(),
        new Pembagian()
    };   
      OperasiBilCetak abc = new OperasiBilCetak();
    abc.cetakSemua(OB, 10.5, 4.5);
    }

}
