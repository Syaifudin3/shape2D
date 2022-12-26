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
public class lingkaran extends Shape2D{
    final double PI = 3.14;
    double keliling(double r){
        return 2*Math.PI*r;
    }
   double luas (double r){
       
       return PI*r*r;
   }

    @Override
    void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
