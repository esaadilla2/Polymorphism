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
public class Perkalian extends OperasiBil {
    @Override
    protected void set_A(double a){
        this.a=a;
    }@Override
    protected double get_A(){
        return a;
    }@Override
    protected void set_B(double b){
        this.b=b;
    }@Override
    protected double get_B(){
        return b;
    }@Override
    protected void set_C(){
        this.c=this.a - this.b;
    }@Override
    protected double get_C(){
        return c;
    }@Override
    protected void tampil(){
        System.out.println("----Operasi Perkalian----");
        System.out.println(get_A()+" x "+get_B()+" = " +(get_A()*get_B()));
    }  
}

