/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author Dhimaz Nur Ramadhan
 */
public class Persegi {
        int sisi,hasil;
        
    void hitung(){
    Scanner in = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi : ");
        sisi = in.nextInt();
        hasil = sisi*sisi;
        System.out.print("Luas persegi adalah : "+hasil);
            
    }        
}
