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
public class balok {
    double luas (double p , double l ,double t){
        return 2*(p*l + p*t + l*t);
        
    }
    double volume ( double p , double l ,double t){
        return p*l*t;
        
    }
}
