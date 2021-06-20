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
public class Stack2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Buku st = new Buku(8);
        char pilih;
        int ulang =0;
        do{
            System.out.println("");
            System.out.println("   ~~~ Program Buku~~~");
            System.out.println("______________________________");
            System.out.println("| Pilih menu dibawah ini!    |");
            System.out.println("| 1. Push                    |");
            System.out.println("| 2. Pop                     |");
            System.out.println("| 3. Peek                    |");
            System.out.println("| 4. Print                   |");
            System.out.println("| 5. Keluar                  |");
            System.out.print("| Pilihah menu : ");
            int pilih1 = sc.nextInt();
            if(pilih1 == 1){
            do
            {
            System.out.println("Judul: ");
            String judul = input.nextLine();
            System.out.println("Nama Pengarang: ");
            String nama = input.nextLine();
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
                continue;
            }else if(pilih1 == 2){
                st.pop();
                continue;
            } else if (pilih1 == 3){
                st.peek();
            } else if (pilih1 == 4){
                st.print();
            }else if(pilih1 == 5){
                System.out.println("Anda telah keluar dari program");
                System.exit(0);
                break;
            }else{
                System.out.println("Menu yang anda berikan tidak tersedia");
                System.out.println("");
            }
        }while(ulang !=0 || ulang<3);
    }
    
}
