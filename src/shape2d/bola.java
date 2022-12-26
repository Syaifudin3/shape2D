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
public class bola extends Shape3D  {
    @Override
    double luas (double r){
        return 4*Math.PI*Math.pow(r, 2);
        
    }
    @Override
    double volume (double r){
        return 0.75*Math.PI*r*r*r;    
        
    }
}
