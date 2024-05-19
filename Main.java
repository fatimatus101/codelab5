 package com.main;
 import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
         Mahasiswa mahasiswa = new Mahasiswa();
         Scanner scanner = new Scanner(System.in);
         String nama;

//         System.out.println("Masukkan nama mahasiswa:");
         for (int i = 1; i <= 5; i++) {
             System.out.println("Masukkan nama ke-" + i + ":");
             nama = scanner.nextLine();
             if (nama.equalsIgnoreCase("selesai")) {
                 break;
             }
             try {
                 mahasiswa.addNamaMahasiswa(nama);
             } catch (IllegalArgumentException e) {
                 System.out.println("Error: " + e.getMessage());
                 i--;
             }
         }

         mahasiswa.printNamaMahasiswa();
     }
 }