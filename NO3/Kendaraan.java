/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NO3;

import java.util.Scanner;

/**
 *
 * @author Dhimaz Nur Ramadhan
 */
public class Kendaraan {
     void data(){
         String merk,warna;
         int cc,tahun,plat;
         Scanner in = new Scanner(System.in);
         System.out.print("Merk mobil : ");
         merk = in.next();
         System.out.print("Warna : ");
         warna = in.next();
         System.out.print("Besar CC : ");
         cc = in.nextInt(); 
         System.out.print("Tahun keluaran : ");
         tahun = in.nextInt();
         System.out.print("Plat nomor : ");
         plat = in.nextInt();
         
         System.out.println("Hasil Data");
         System.out.println("===========");
         System.out.println("Merk mobil : "+merk);
         System.out.println("Warna mobil : "+warna);
         System.out.println("Besar CC mobil : "+cc+" CC");
         System.out.println("Tahun keluar : "+tahun);
         System.out.println("Plat nomor : "+plat);
        }    
}
