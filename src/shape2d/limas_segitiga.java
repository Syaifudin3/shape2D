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
public class limas_segitiga {
      double luas (double as , double ts, double a1, double a2, double a3, double t1
      , double t2, double t3){
          double L_alas=0.5*as*ts;
          double L_sgt1=0.5*a1*t1;
          double L_sgt2=0.5*a2*t2;
          double L_sgt3=0.5*a3*t3;
        return L_alas+L_sgt1+L_sgt2+L_sgt3;
        
    }
    double volume (double la , double t){
        return 0.75*la*t;
        
    }
}
