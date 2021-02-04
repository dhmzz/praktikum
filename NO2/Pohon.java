/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NO2;

import java.util.Scanner;

/**
 *
 * @author Dhimaz Nur Ramadhan
 */
public class Pohon {
    String nama;
    int tinggi;
    Scanner in = new Scanner(System.in);    
    
    void setNama(){
        System.out.print("Masukkan nama Pohon : ");    
        nama = in.next();        
    }
    void setTinggi(){
        System.out.print("Tinggi pohon : ");
        tinggi = in.nextInt();                
    }
    void getNama(){
        System.out.print(nama);     
    }
    void getTinggi(){
        System.out.print(tinggi);
    }
            
}
