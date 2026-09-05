/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemjastip_minpro1;

import java.util.Scanner;
import Model.PesananJastip;
import Logic.KelolaPesanan;
import Helper.ValidasiInput;

/**
 *
 * @author Lenovo
 */
public class SistemJastip_Minpro1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        KelolaPesanan kelola = new KelolaPesanan();
        ValidasiInput input = new ValidasiInput(scanner);

        int pilihan;

        do {
            System.out.println("\n==============================");
            System.out.println("  SISTEM JASA TITIP LUAR NEGERI");
            System.out.println("================================");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Lihat Pesanan");
            System.out.println("3. Ubah Pesanan");
            System.out.println("4. Hapus Pesanan");
            System.out.println("5. Keluar");
            System.out.println("================================");

            pilihan = input.inputInteger("Pilih menu: ");
            scanner.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.println("\n======= TAMBAH PESANAN --=====");

                    String id = input.inputString("ID Pesanan       : ");
                    String nama = input.inputString("Nama Pelanggan : ");
                    String barang = input.inputString("Nama Barang  : ");
                    String negara = input.inputString("Negara Asal  : ");

                    double harga = input.inputDouble("Harga         : ");
                    int jumlah = input.inputInteger("Jumlah         : ");

                    scanner.nextLine();

                    PesananJastip pesanan = new PesananJastip(
                            id, nama, barang, negara, harga, jumlah
                    );

                    kelola.tambahPesanan(pesanan);
                    break;

                case 2:
                    kelola.tampilkanPesanan();
                    break;

                case 3:
                    System.out.println("\n======= UBAH PESANAN =======");

                    String idUbah = input.inputString("ID Pesanan         : ");
                    String namaBaru = input.inputString("Nama Pelanggan   : ");
                    String barangBaru = input.inputString("Nama Barang    : ");
                    String negaraBaru = input.inputString("Negara Asal    : ");

                    double hargaBaru = input.inputDouble("Harga           : ");
                    int jumlahBaru = input.inputInteger("Jumlah           : ");

                    scanner.nextLine();

                    kelola.ubahPesanan(
                            idUbah,
                            namaBaru,
                            barangBaru,
                            negaraBaru,
                            hargaBaru,
                            jumlahBaru
                    );
                    break;

                case 4:
                    System.out.println("\n===== HAPUS PESANAN =====");

                    String idHapus = input.inputString("ID Pesanan: ");

                    kelola.hapusPesanan(idHapus);
                    break;

                case 5:
                    System.out.println("\nProgram selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("\nPilihan tidak tersedia.");
            }

        } while (pilihan != 5);

        scanner.close();
    }
}
