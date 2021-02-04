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
public class Lingkaran {
       double jari,hasil,phi = 3.14;
       
       
    void hitung2(){
    Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jari jari lingkaran : ");
        jari = in.nextInt();
        hasil = phi*jari*jari;
        System.out.print("Luas lingkaran adalah : "+hasil);    
        }   
    }
    

