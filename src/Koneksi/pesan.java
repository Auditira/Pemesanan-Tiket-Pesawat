/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class pesan {
    String name;
    String no_hp;
    String mail;

    public pesan(String nm, String no, String em) {
        this.name = nm;
        this.no_hp = no;
        this.mail = em;
    }

    public static void main(String[] args) {
        ArrayList<pesan> data = new ArrayList<pesan>();
        Scanner input = new Scanner(System.in);

        System.out.println("Pemesanan");
        while (true) {
            System.out.println("\n======================");
            System.out.print("Banyak Data Pemesan Tiket : ");
            int jumlah = input.nextInt();
            System.out.println("");
            if (jumlah <= 0) {
                System.out.println("Tidak Boleh Kosong");
            } else {
                for (int i = 0; i < jumlah; i++) {
                    System.out.println("Masukkan Data Pemesan Ke-" + (i + 1));
                    System.out.print("Nama Lengkap     : ");
                    String nama = input.next();
                    System.out.print("Nomor Handphone  : ");
                    String nomor = input.next();
                    System.out.print("Alamat E-Mail    : ");
                    String email = input.next();
                    System.out.println("");
                    data.add(new pesan(nama, nomor, email));
                }

                for (int i = 0; i < data.size(); i++) {
                    System.out.println(
                            "Daftar Pemesan Ke-" + (i + 1) + "\n"
                            + "Nama   : " + data.get(i).name + "\n"
                            + "Nomor  : " + data.get(i).no_hp + "\n"
                            + "E-Mail : " + data.get(i).mail + "\n"
                    );
                }
                break;
            }
        }
    }
}

   




