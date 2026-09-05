/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class PesananJastip {

    // Access Modifier
    private String idPesanan;
    private String namaPelanggan;
    private String namaBarang;
    private String negaraAsal;
    private double harga;
    private int jumlah;
    
    // Constructor
    public PesananJastip(String idPesanan, String namaPelanggan, 
                         String namaBarang, String negaraAsal, 
                         double harga, int jumlah) {
        
        this.idPesanan = idPesanan;
        this.namaPelanggan = namaPelanggan;
        this.namaBarang = namaBarang;
        this.negaraAsal = negaraAsal;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    // Getter
    public String getIdPesanan() {
        return idPesanan;
    }
    
    public String getNamaPelanggan() {
        return namaPelanggan;
    }
    
    public String getNegaraAsal() {
        return negaraAsal;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    // Setter
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }
    
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    
    public void setNegaraAsal(String negaraAsal) {
        this.negaraAsal = negaraAsal;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    // Method menghitung total
    public double hitungTotal() {
        return harga * jumlah;
    }
    
    // Method menampilkan data
    public void tampilkanData() {
        System.out.println("ID Pesanan     : " + idPesanan);
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Nama Barang    : " + namaBarang);
        System.out.println("Negara Asal    : " + negaraAsal);
        System.out.println("Harga          : Rp" + harga);
        System.out.println("Jumlah         : " + jumlah);
        System.out.println("Total Harga    : Rp" + hitungTotal());
    }
}