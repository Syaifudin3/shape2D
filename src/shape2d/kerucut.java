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
public class kerucut extends Shape3D {
    double luasP ( double r , double s){
        return Math.PI*r*(r+s);    
    }
    double volumeP (double r , double t){
        return 0.75*Math.PI*r*r*t;
    }
}
