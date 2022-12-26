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
public class Shape3D  {
    //KUBUS
    double p,l,t;
    double luas (double rusuk){
        return 6*(rusuk*rusuk);
    }
    double keliling (double s){
        return 12*s;      
    }
    double volume (double rusuk){
        return rusuk*rusuk*rusuk;
    }
}
