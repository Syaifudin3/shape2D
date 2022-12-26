/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape2d;

/**
 *
 * @author ASUS
 */
public class segitiga extends Shape2D {
    
    @Override
    double luas(double alas , double tinggi){
        return 0.5 * alas * tinggi;       
    }
     double luas(int alas , double tinggi){
        return 0.5 * alas * tinggi;
     }

    @Override
    void print() {
        System.out.println("Rumus Segitiga ___");
    }
    
}
