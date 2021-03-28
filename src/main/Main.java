/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        int pilih = 0;
        String nama,nim;
        int usia,uts,uas;    
        Scanner input = new Scanner (System.in);

        System.out.println("Input data=======");
        System.out.print("Nama\t: "); nama = input.nextLine();
        System.out.print("NIM\t: "); nim = input.nextLine();
        System.out.print("Usia\t: "); usia = input.nextInt();
        System.out.print("UTS\t: "); uts = input.nextInt();
        System.out.print("UAS\t: "); uas = input.nextInt();
         Mahasiswa mahasiswa = new Mahasiswa(nama,nim,usia,uts,uas);
        System.out.println("");
        System.out.println("");
         while(pilih!=3){
            System.out.println("");
            System.out.println("Opsi=======");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Edit Data");
            System.out.println("3. exit");
            System.out.print("Pilih : ");pilih= input.nextInt();
        
            if (pilih==1) {  
             System.out.println("");
             System.out.println("Perkenalkan nama saya "+ mahasiswa.nama+", nim " +mahasiswa.nim);
             System.out.println("Usia\t\t : " + mahasiswa.usia);
             System.out.println("Nilai Akhir\t : " + mahasiswa.nilai());
             }
            else if (pilih==2) {
                
            System.out.println("Input data=======");
            System.out.print("Nama\t: "); mahasiswa.nama = input.nextLine();
            System.out.print("NIM\t: "); mahasiswa.nim = input.nextLine();
            System.out.print("Usia\t: "); mahasiswa.usia = input.nextInt();
            System.out.print("UTS\t: "); mahasiswa.uts = input.nextInt();
            System.out.print("UAS\t: "); mahasiswa.uas = input.nextInt();
         
            System.out.println("");
            System.out.println("");
            } 
            
        }
       
    }
    
}