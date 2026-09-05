/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.ArrayList;
import Model.PesananJastip;

/**
 *
 * @author Lenovo
 */
public class KelolaPesanan {

    private ArrayList<PesananJastip> daftarPesanan;

    // Constructor
    public KelolaPesanan() {
        daftarPesanan = new ArrayList<>();
    }

    // Create - Menambah pesanan
    public void tambahPesanan(PesananJastip pesanan) {
        daftarPesanan.add(pesanan);
        System.out.println("Pesanan berhasil ditambahkan.");
    }

    // Read - Menampilkan semua pesanan
    public void tampilkanPesanan() {

        if (daftarPesanan.isEmpty()) {
            System.out.println("Belum ada pesanan.");
        } else {

            System.out.println("\n====== DAFTAR PESANAN ======");

            for (PesananJastip pesanan : daftarPesanan) {
                System.out.println("---------------------------");
                pesanan.tampilkanData();
            }
        }
    }

    // Mencari pesanan berdasarkan ID
    public PesananJastip cariPesanan(String id) {

        for (PesananJastip pesanan : daftarPesanan) {

            if (pesanan.getIdPesanan().equals(id)) {
                return pesanan;
            }
        }

        return null;
    }

    // Update - Mengubah pesanan
    public void ubahPesanan(String id,
                            String namaPelanggan,
                            String namaBarang,
                            String negaraAsal,
                            double harga,
                            int jumlah) {

        PesananJastip pesanan = cariPesanan(id);

        if (pesanan != null) {

            pesanan.setNamaPelanggan(namaPelanggan);
            pesanan.setNamaBarang(namaBarang);
            pesanan.setNegaraAsal(negaraAsal);
            pesanan.setHarga(harga);
            pesanan.setJumlah(jumlah);

            System.out.println("Pesanan berhasil diubah.");

        } else {

            System.out.println("Pesanan tidak ditemukan.");
        }
    }

    // Delete - Menghapus pesanan
    public void hapusPesanan(String id) {

        PesananJastip pesanan = cariPesanan(id);

        if (pesanan != null) {

            daftarPesanan.remove(pesanan);
            System.out.println("Pesanan berhasil dihapus.");

        } else {

            System.out.println("Pesanan tidak ditemukan.");
        }
    }
}