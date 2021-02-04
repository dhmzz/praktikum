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
public class Main {
    public static void main(String[]args){
        Persegi user = new Persegi();
        Lingkaran user2 = new Lingkaran();
        int pilih;        
        
     
        Scanner in = new Scanner(System.in);
        System.out.println("Berikut program menghitung luas : ");
        System.out.println("1)luas Persegi");
        System.out.println("2)Luas Lingkaran");
        System.out.print("Pogram mana yang akan anda pilih : ");
        pilih = in.nextInt();
        if(pilih == 1){
            user.hitung();
        }else if(pilih==2){
            user2.hitung2();
        }
            
    }
}