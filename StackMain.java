/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.util.Scanner;

/**
 *
 * @author ACHE
 */
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Buku st = new Buku(8);
        char pilih;
        do
        {
            System.out.println("Judul: ");
            String judul = sc.nextLine();
            System.out.println("Nama Pengarang: ");
            String nama = sc.nextLine();
            System.out.println("Tahun Terbit: ");
            int tahun = sc.nextInt();
            System.out.println("Jumlah Halaman: ");
            int jml = sc.nextInt();
            System.out.println("Harga: ");
            int harga = sc.nextInt();
            
            Buku bk = new Buku (judul, nama, tahun, jml, harga);
            System.out.println("Apakah Anda Akan menambahkan data baru ke Stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            st.push(bk);
        } while (pilih == 'y');
        st.print();
        st.pop();
        st.peek();
        st.print();
    }
    
}
