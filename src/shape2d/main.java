/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape2d;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.tree.DefaultTreeCellEditor;

/**
 *
 * @author ASUS
 */
public class main extends JFrame{
      public static void main(String[] args) {
        // TODO code application logic here
          Shape2D persegipanjang= new segitiga();
          System.out.println("Keliling Persegi Panjang : " + persegipanjang.keliling(3, 2)); 
          System.out.println("---------------------------------");
          
          segitiga segitiga = new segitiga();
          System.out.println("Luas Segitiga : "+segitiga.luas(6, 3));
          System.out.println("----------------------------------");
          
          lingkaran lingkaran = new lingkaran();
          System.out.println("Kelliling Lingkaran : "+lingkaran.keliling(3));
          System.out.println("Luas Lingkaran : "+lingkaran.luas(6));
          System.out.println("-----------------------------------");
         
          Shape3D kubus = new Shape3D();
          System.out.println("Luas Kubus : "+kubus.luas(4));
          System.out.println("Keliling Kubus : "+kubus.keliling(6));
          System.out.println("Volume Kubus : " + kubus.volume(7));
          System.out.println("----------------------------------");
          
          prisma prisma = new prisma();
          System.out.println("Luas Prisma : "+ prisma.luaspermukaan(5, 7, 4));
          System.out.println("Volume Prisma : "+prisma.volume(4, 7));
          System.out.println("----------------------------------");
      
          tabung tabung = new tabung();
          System.out.println("Luas tabung : "+ tabung.luas(4, 2));
          System.out.println("Volume tabung : "+tabung.volume(6, 2));
          System.out.println("----------------------------------");
      
          limas_segitiga limas = new limas_segitiga();
          System.out.println("Luas Limas : "+ limas.luas(4, 3, 2, 1, 1, 2, 5, 6));
          System.out.println("Volume Limas : "+limas.volume(6, 2));
          System.out.println("----------------------------------");
      
          balok balok  = new balok();
          System.out.println("Luas Balok : "+ balok.luas(2, 4, 1));
          System.out.println("Volume Balok : "+balok.volume(3, 2, 1));
          System.out.println("----------------------------------");
      
          kerucut kerucut = new kerucut();
          System.out.println("Luas kerucut : "+ kerucut.luasP(1, 2));
          System.out.println("Volume Kerucut : "+kerucut.volumeP(4, 2));
          System.out.println("----------------------------------");
      
          bola bola = new bola();
          System.out.println("Luas Bola : "+ bola.luas(4));
          System.out.println("Volume Bola : "+bola.volume(6));
          System.out.println("----------------------------------");
          
          limassegitigasamasisi limas1 = new limassegitigasamasisi();
          System.out.println(limas1.luas(2, 7, 2)); 
          System.out.println(limas1.volume(2, 7));
          
      main frame = new main();
      frame.setBounds(10, 50, 1000, 500);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(main.DISPOSE_ON_CLOSE);
      frame.setLayout(null);
      
          JTextField alas= new JTextField();
          alas.setBounds(5, 5, 100, 50);
      frame.add(alas);
      
      
          JTextField tinggi= new JTextField();
          tinggi.setBounds(5, 110, 100, 50);
      frame.add(tinggi);
      
          JTextField hasil= new JTextField();
          hasil.setBounds(5, 200, 100, 50);
      frame.add(hasil);
      
      
          JButton hitung = new JButton("Hitung");
          hitung.setBounds(115, 5, 100,50 );
          frame.add(hitung);
          
          hitung.addActionListener((ActionEvent ae) -> {
              double Tinggi , Alas , luas;
              Alas = Double.parseDouble(alas.getText());
              Tinggi = Double.parseDouble(tinggi.getText());
              luas =  0.5*(Alas*Tinggi) ;
              hasil.setText(String.valueOf(luas));
          });
          
      }
    
}
