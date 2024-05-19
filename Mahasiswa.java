package com.main;
import java.util.ArrayList;

public class Mahasiswa {
    private ArrayList<String> namaMahasiswa;

    public Mahasiswa() {
        this.namaMahasiswa = new ArrayList<>();
    }

    public void addNamaMahasiswa(String nama) throws IllegalArgumentException {
        if (nama.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.namaMahasiswa.add(nama);
    }

    public void printNamaMahasiswa() {
        System.out.println("Daftar mahasiswa yang diinputkan:");
        for (int i = 0; i < namaMahasiswa.size(); i++) {
            System.out.println("Masukkan nama ke-" + (i + 1) + ": " + namaMahasiswa.get(i));
        }
    }
}