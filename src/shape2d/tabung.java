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
public class tabung {
    double luas (double r , double t){
        return 2*Math.PI*r*(t+r);
        
    }
    double volume (double r , double t){
        return Math.PI*r*r*t;
        
    }
}
