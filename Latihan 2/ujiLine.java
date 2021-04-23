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
public class ujiLine {
    
    public static void main(String[] args) {
        Line l1 = new Line(1,2,3,4);
        Line l2 = new Line(1,2,3,4);
        l1.getLength();
        l2.getLength();
        
        System.out.println("Line 1 > Line 2 = "+l1.isGreater(l1, l2)) ;
        System.out.println("Line 1 < Line 2 = "+l1.isLess(l1, l2));
        System.out.println("Line 1 = Line 2 = "+l1.isEqual(l1, l2));
    }
}
