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
public class prisma extends Shape3D{
    
    double luaspermukaan(double  tinggi, double alas, double k ){
        return  2*alas +(k * tinggi);       
    } 
    double volume ( double alas , double t){
        return alas * t ;
    }
    
}