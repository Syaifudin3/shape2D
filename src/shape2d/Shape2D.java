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
public abstract class Shape2D extends shape{
double panjang;
double lebar;
double tinggi;
 double luas (double panjang , double lebar){
     return panjang*lebar;     
 }
 double keliling (double panjang , double lebar){
     return 2*(panjang+lebar);
     
     
 }
    
}
