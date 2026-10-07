# 📦 Mini Project 3 PBO — Sistem Jasa Titip Belanja Luar Negeri

## 👤 1. Identitas diri dan project

| Keterangan | Detail |
|---|---|
| **Nama Mahasiswa** | Siti Nursinta |
| **Nim Mahasiswa** | 2509116087 |
| **Nama Project** | Sistem Jasa Titip Belanja Luar Negeri |
| **Praktikum** | Pemrograman Berorientasi Objek (PBO) |
| **Project** | Mini Project 3 |
| **Bahasa Pemrograman** | Java |
| **IDE** | NetBeans |
| **Konsep Utama** | Encapsulation, Inheritance, Polymorphism, Abstraction, Interface, MVC |

---


## 📝 2. Deskripsi Project

Mini Project 3 merupakan pengembangan lanjutan dari **Sistem Jasa Titip Luar Negeri** yang telah dibuat pada Mini Project 2.

Sistem ini digunakan untuk membantu proses pengelolaan pesanan jasa titip, mulai dari data pelanggan, barang yang dipesan, pembayaran, batch perjalanan, sampai dengan status pesanan.

Pada versi ini, sistem dikembangkan menggunakan beberapa konsep utama Pemrograman Berorientasi Objek, yaitu **encapsulation, inheritance, abstraction, polymorphism, dan interface**. Struktur program juga diperbaiki menggunakan pola **MVC (Model, View, Controller)** agar tanggung jawab setiap bagian program lebih jelas.

Selain memenuhi ketentuan utama Mini Project 3, sistem juga dikembangkan dengan validasi khusus berdasarkan jenis pesanan, yaitu **Fashion, Skincare, dan Elektronik**.

Pengembangan juga dilakukan pada alur penggunaan program, seperti validasi input yang lebih baik, opsi membatalkan proses input dengan `0`, pengelolaan status pesanan, riwayat status, batch jastip, struk, serta ringkasan pesanan.

---

## 🎯 3. Tujuan Pengembangan

Pengembangan Mini Project 3 bertujuan untuk:

- Menerapkan konsep-konsep PBO secara langsung pada sistem yang memiliki alur nyata.
- Menerapkan **abstraction** untuk menentukan struktur dasar pesanan jasa titip.
- Menerapkan **inheritance** untuk membuat beberapa jenis pesanan berdasarkan class induk.
- Menerapkan **polymorphism** melalui overriding dan overloading.
- Menerapkan **interface** untuk menangani perilaku validasi khusus pada setiap jenis pesanan.
- Menerapkan pola **MVC** agar kode lebih terstruktur dan mudah dikembangkan.
- Memisahkan tanggung jawab antara data barang dan transaksi pesanan.
- Membuat proses pengelolaan pesanan lebih realistis melalui status dan riwayat status.
- Meningkatkan validasi input agar data yang masuk ke sistem lebih sesuai.
- Memberikan opsi kepada pengguna untuk membatalkan proses input tanpa harus menyelesaikan seluruh data.
- Mengembangkan fitur pendukung seperti batch jastip, struk, dan ringkasan pesanan.

---

## ✨ 4. Fitur Sistem

Sistem memiliki beberapa fitur utama:

- 👤 Pengelolaan data pelanggan.
- 📦 Pengelolaan data barang.
- 🛍️ Pembuatan pesanan jasa titip.
- 👗 Pesanan khusus kategori Fashion.
- 🧴 Pesanan khusus kategori Skincare.
- 💻 Pesanan khusus kategori Elektronik.
- 💰 Pemilihan metode pembayaran.
- ✈️ Pengelolaan batch perjalanan jasa titip.
- 🔄 Perubahan status pesanan secara bertahap.
- 📜 Penyimpanan riwayat status pesanan.
- 💵 Perhitungan total harga barang.
- 🚚 Perhitungan estimasi biaya jasa titip berdasarkan berat.
- ✅ Validasi detail khusus berdasarkan jenis barang.
- ❌ Validasi input agar data tidak sembarangan masuk.
- 🚪 Opsi membatalkan proses input dengan `0`.
- 🧾 Fitur melihat struk pesanan.
- 📊 Fitur ringkasan pesanan.
- 🧩 Penerapan konsep PBO dan MVC dalam struktur program.

---

## 📁 5. Struktur Project

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20005855.png" width="100%">
    </td>
  </tr>
</table>

Struktur tersebut dibuat agar setiap bagian program mempunyai tanggung jawab yang jelas.

- **Model** digunakan untuk menyimpan data dan aturan utama sistem.
- **View** digunakan untuk menangani tampilan menu dan interaksi input/output pengguna.
- **Controller** digunakan untuk mengatur proses dan menghubungkan View dengan Model.
- **Main** digunakan sebagai titik awal ketika program dijalankan.

---

## 🏗️ 6. Penerapan MVC

Pola **MVC (Model, View, Controller)** diterapkan agar program tidak hanya berjalan, tetapi juga mempunyai struktur yang lebih rapi.

### Model

Bagian Model berisi object dan data utama sistem, seperti:

- `PesananJastip`
- `JastipFashion`
- `JastipSkincare`
- `JastipElektronik`
- `Barang`
- `Pelanggan`
- `Pembayaran`
- `BatchJastip`

Model bertanggung jawab terhadap data serta proses yang berkaitan langsung dengan object tersebut.

### View

Bagian View menangani interaksi dengan pengguna, seperti:

- Menampilkan menu.
- Menampilkan informasi pesanan.
- Meminta input pengguna.
- Menampilkan hasil proses.
- Melakukan validasi input dasar.

Class yang terdapat pada View:

- `MenuView`
- `PesananView`
- `BatchView`
- `ValidasiInput`

### Controller

Bagian Controller digunakan untuk mengatur proses yang dilakukan sistem.

Class `PesananController` menjadi penghubung antara input dari View dengan proses pada Model.

Dengan pemisahan ini, perubahan tampilan tidak harus mengubah seluruh logika sistem.

---

## 🔐 7. Encapsulation

Encapsulation diterapkan dengan membuat atribut pada class menggunakan access modifier `private`.

Contohnya pada class `Barang`:

```java
public class Barang {

    private String namaBarang;
    private String negaraAsal;
    private double harga;
    private double berat;
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20010200.png" width="100%">
    </td>
  </tr>
</table>

Atribut tidak dapat diakses langsung dari luar class. Untuk mengakses atau mengubah data, digunakan method seperti getter dan setter.

Contoh:

```java
public String getNamaBarang() {
    return namaBarang;
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20010336.png" width="100%">
    </td>
  </tr>
</table>

```java
public void setNamaBarang(String namaBarang) {
    this.namaBarang = namaBarang;
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20010401.png" width="100%">
    </td>
  </tr>
</table>

### Mengapa digunakan?

Encapsulation digunakan untuk menjaga data agar tidak dapat diubah secara sembarangan dari luar class.

### Manfaat dalam sistem

- Data menjadi lebih aman.
- Akses terhadap atribut lebih terkontrol.
- Perubahan data dilakukan melalui method yang sudah disediakan.
- Struktur class menjadi lebih rapi.

### Insight

Dari penerapan ini dapat dipahami bahwa object sebaiknya tidak memberikan akses langsung terhadap seluruh datanya. Class harus mengatur bagaimana data tersebut digunakan.

---

## 🧬 8. Inheritance

Inheritance digunakan agar class turunan dapat mewarisi atribut dan method dari class induk.

Pada project ini, `PesananJastip` menjadi class induk untuk beberapa jenis pesanan:

```java
public class JastipFashion extends PesananJastip
```

```java
public class JastipSkincare extends PesananJastip
```

```java
public class JastipElektronik extends PesananJastip
```

Ketiga class tersebut mempunyai karakteristik dasar yang sama sebagai pesanan jasa titip, tetapi masing-masing mempunyai detail khusus.

### Mengapa digunakan?

Tanpa inheritance, data dan method yang sama harus ditulis ulang pada setiap jenis pesanan.

### Manfaat dalam sistem

- Mengurangi pengulangan kode.
- Membuat hubungan antar-class lebih jelas.
- Mempermudah pengembangan jenis pesanan baru.
- Menjadi dasar untuk menerapkan polymorphism.

### Insight

Inheritance menunjukkan bahwa beberapa object dapat mempunyai karakteristik umum yang sama, tetapi tetap mempunyai perilaku atau detail khusus masing-masing.

---

## 🧩 9. Abstraction

Abstraction diterapkan melalui abstract class `PesananJastip`.

```java
public abstract class PesananJastip {
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20010753.png" width="100%">
    </td>
  </tr>
</table>

Class ini menjadi dasar untuk seluruh jenis pesanan jasa titip.

Di dalamnya terdapat abstract method:

```java
public abstract String getJenisPesanan();
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20011006.png" width="100%">
    </td>
  </tr>
</table>

Method tersebut tidak langsung mempunyai implementasi pada class induk. Implementasinya diberikan oleh class turunannya.

Contohnya pada `JastipFashion`:

```java
@Override
public String getJenisPesanan() {
    return "Jastip Fashion";
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20011058.png" width="100%">
    </td>
  </tr>
</table>

Pada `JastipSkincare`:

```java
@Override
public String getJenisPesanan() {
    return "Jastip Skincare";
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20011144.png" width="100%">
    </td>
  </tr>
</table>

Pada `JastipElektronik`:

```java
@Override
public String getJenisPesanan() {
    return "Jastip Elektronik";
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20011155.png" width="100%">
    </td>
  </tr>
</table>

### Mengapa digunakan?

Tidak semua detail pesanan dapat ditentukan oleh class induk. Class induk hanya menentukan bahwa setiap jenis pesanan harus mempunyai identitas jenis pesanan.

### Manfaat dalam sistem

- Menentukan struktur dasar pesanan.
- Memaksa class turunan menyediakan implementasi tertentu.
- Menghindari pembuatan object `PesananJastip` secara langsung.
- Membuat desain program lebih terarah.

### Insight

Abstraction membantu menentukan bagian mana yang memang harus dimiliki bersama dan bagian mana yang harus diserahkan kepada class turunan.

---

## 🔄 10. Polymorphism

Polymorphism diterapkan melalui **overriding** dan **overloading**.

### Overriding

Overriding terjadi ketika class turunan mempunyai method dengan nama dan parameter yang sama dengan method pada class induk.

Contohnya:

```java
@Override
public String getJenisPesanan() {
    return "Jastip Elektronik";
}
```

Method tersebut mempunyai nama yang sama, tetapi hasilnya berbeda sesuai object yang digunakan.

### Overloading

Overloading diterapkan pada method perhitungan.

Contohnya:

```java
public double hitungTotal() {
    return barang.getHarga() * jumlah;
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20011415.png" width="100%">
    </td>
  </tr>
</table>

dan:

```java
public double hitungTotal(double biayaJastip) {
    return hitungTotal() + biayaJastip;
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20011443.png" width="100%">
    </td>
  </tr>
</table>

Kedua method memiliki nama yang sama, tetapi parameter yang digunakan berbeda.

Polymorphism juga diterapkan pada estimasi biaya jasa titip:

```java
public double hitungEstimasiJastip() {
    double biayaPerKg = 50000;
    return barang.getBerat() * jumlah * biayaPerKg;
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20011523.png" width="100%">
    </td>
  </tr>
</table>

dan:

```java
public double hitungEstimasiJastip(double biayaPerKg) {
    return barang.getBerat() * jumlah * biayaPerKg;
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20011541.png" width="100%">
    </td>
  </tr>
</table>

### Mengapa digunakan?

Polymorphism membuat satu nama method dapat digunakan untuk kebutuhan yang berbeda tanpa harus membuat nama method baru untuk setiap variasi.

### Manfaat dalam sistem

- Kode menjadi lebih fleksibel.
- Method dapat digunakan dalam beberapa kondisi.
- Class turunan dapat mempunyai perilaku yang berbeda.
- Program menjadi lebih mudah dikembangkan.

---

## 👗 11. Validasi Fashion

`JastipFashion` menggunakan interface `BisaDivalidasi`.

```java
public class JastipFashion
       extends PesananJastip
       implements BisaDivalidasi {
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20011954.png" width="100%">
    </td>
  </tr>
</table>

Validasi dilakukan terhadap ukuran dan warna:

```java
@Override
public boolean validasiDetailPesanan() {
    return ukuran != null
            && !ukuran.trim().isEmpty()
            && warna != null
            && !warna.trim().isEmpty();
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20012003.png" width="100%">
    </td>
  </tr>
</table>

Artinya, pesanan fashion dianggap valid apabila ukuran dan warna sudah diisi.

### Manfaat

Validasi ini membuat data fashion lebih sesuai dengan kebutuhan barang yang dipesan. Contohnya, pakaian tanpa ukuran atau warna belum dapat dianggap sebagai pesanan yang lengkap.

---

## 🧴 12. Validasi Skincare

`JastipSkincare` juga menggunakan interface `BisaDivalidasi`.

```java
public class JastipSkincare
       extends PesananJastip
       implements BisaDivalidasi {
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20012015.png" width="100%">
    </td>
  </tr>
</table>

Validasi dilakukan terhadap jenis kulit dan ukuran produk:

```java
@Override
public boolean validasiDetailPesanan() {
    return jenisKulit != null
            && !jenisKulit.trim().isEmpty()
            && ukuranProduk > 0;
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20012026.png" width="100%">
    </td>
  </tr>
</table>

### Manfaat

Sistem dapat memastikan bahwa informasi penting untuk produk skincare sudah tersedia sebelum pesanan diproses.

---

## 💻 13. Validasi Elektronik

`JastipElektronik` juga mengimplementasikan `BisaDivalidasi`.

```java
public class JastipElektronik
       extends PesananJastip
       implements BisaDivalidasi {
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20012036.png" width="100%">
    </td>
  </tr>
</table>

Validasi dilakukan terhadap merek dan garansi:

```java
@Override
public boolean validasiDetailPesanan() {
    return merek != null
            && !merek.trim().isEmpty()
            && garansi >= 0;
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20012043.png" width="100%">
    </td>
  </tr>
</table>

### Manfaat

Sistem dapat memastikan bahwa informasi penting mengenai barang elektronik tersedia dan nilai garansi tidak menggunakan angka negatif.

---

## 🔌 14. Penggunaan Interface

Interface yang digunakan dalam project adalah:

```java
public interface BisaDivalidasi {

    boolean validasiDetailPesanan();
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20012157.png" width="100%">
    </td>
  </tr>
</table>

Interface ini digunakan karena setiap jenis pesanan memiliki kebutuhan validasi yang berbeda.

Ketiga class berikut mengimplementasikannya:

- `JastipFashion`
- `JastipSkincare`
- `JastipElektronik`

Meskipun ketiganya menggunakan method yang sama, isi validasinya berbeda.

### Mengapa interface digunakan?

Interface digunakan untuk menetapkan kontrak bahwa setiap jenis pesanan yang membutuhkan validasi harus mempunyai method `validasiDetailPesanan()`.

### Manfaat

- Menyamakan bentuk method antar-class.
- Memberikan fleksibilitas pada implementasi.
- Memisahkan aturan validasi dari class induk.
- Memudahkan penambahan jenis pesanan baru.

### Insight

Interface cocok digunakan untuk perilaku yang dimiliki beberapa object tetapi tidak harus menjadi bagian dari identitas utama object tersebut.

---

## 📦 15. Class Barang

Class `Barang` bertanggung jawab terhadap informasi dasar barang.

Atribut yang digunakan:

```java
private String namaBarang;
private String negaraAsal;
private double harga;
private double berat;
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20012314.png" width="100%">
    </td>
  </tr>
</table>

Data tersebut digunakan untuk mendukung proses pesanan dan perhitungan.

Class `Barang` tidak menangani proses transaksi. Tanggung jawabnya hanya berfokus pada data barang.

### Mengapa dipisahkan?

Pada Mini Project sebelumnya terdapat masukan mengenai pemisahan tanggung jawab antara barang dan pesanan. Oleh karena itu, pada project ini `Barang` dibuat sebagai object tersendiri.

### Manfaat

- Data barang lebih terorganisir.
- Class pesanan tidak terlalu penuh.
- Tanggung jawab setiap class lebih jelas.
- Object barang dapat digunakan oleh pesanan.

---

## 👤 16. Class Pelanggan

Class `Pelanggan` digunakan untuk menyimpan informasi pelanggan.

Atribut utama:

```java
private String idPelanggan;
private String namaPelanggan;
private String nomorTelepon;
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20012351.png" width="100%">
    </td>
  </tr>
</table>

Data pelanggan dipisahkan dari `PesananJastip` karena pelanggan merupakan entity yang berbeda dari transaksi.

### Manfaat

- Data pelanggan lebih terstruktur.
- Informasi pelanggan tidak bercampur dengan informasi barang.
- Pesanan cukup menyimpan object `Pelanggan`.

---

## 💳 17. Class Pembayaran

Class `Pembayaran` digunakan untuk menyimpan informasi mengenai metode pembayaran.

```java
private String metodePembayaran;
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20012429.png" width="100%">
    </td>
  </tr>
</table>

Object pembayaran kemudian dapat digunakan oleh `PesananJastip`.

### Mengapa dipisahkan?

Pembayaran merupakan bagian dari transaksi, tetapi bukan merupakan data dasar barang maupun pelanggan.

Dengan adanya class tersendiri, tanggung jawab sistem menjadi lebih jelas dan lebih mudah dikembangkan apabila nantinya terdapat tambahan seperti status pembayaran atau informasi transaksi lainnya.

---

## ✈️ 18. Class BatchJastip

`BatchJastip` digunakan untuk menyimpan informasi perjalanan jasa titip.

Atribut yang digunakan antara lain:

```java
private String idBatch;
private String negaraTujuan;
private String tanggalBuka;
private String batasOrder;
private String tanggalBerangkat;
private String statusBatch;
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20012456.png" width="100%">
    </td>
  </tr>
</table>

### Manfaat

Batch membantu mengelompokkan pesanan berdasarkan perjalanan jasa titip tertentu.

Dengan demikian, informasi perjalanan tidak perlu dicampurkan langsung ke dalam data barang.

---

## 🔄 19. Status Pesanan

Sistem mempunyai tahapan status pesanan:

1. `Menunggu Pembayaran`
2. `Pembayaran Berhasil`
3. `Sedang Dibeli`
4. `Dalam Pengiriman`
5. `Pesanan Selesai`

Perubahan status diatur menggunakan method:

```java
public boolean ubahStatus(String statusBaru)
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20012801.png" width="100%">
    </td>
  </tr>
</table>

Sistem memeriksa status sebelumnya sebelum menerima perubahan status berikutnya.

Contohnya:

```java
case "Menunggu Pembayaran":
    boleh = statusBaru.equals("Pembayaran Berhasil");
    break;
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20012829.png" width="100%">
    </td>
  </tr>
</table>

### Mengapa digunakan?

Status tidak dibuat bebas agar alur transaksi tetap logis.

### Manfaat

- Menghindari perubahan status yang tidak sesuai.
- Membuat proses pesanan lebih realistis.
- Memudahkan pengguna mengetahui posisi pesanan.

---

## 📜 20. Riwayat Status

Selain menyimpan status saat ini, sistem juga menyimpan seluruh perubahan status menggunakan:

```java
private ArrayList<String> riwayatStatus;
```

Ketika status berhasil berubah:

```java
riwayatStatus.add(statusBaru);
```

Riwayat kemudian dapat ditampilkan menggunakan:

```java
public void tampilkanRiwayatStatus()
```

### Manfaat

Pengguna tidak hanya dapat melihat status terakhir, tetapi juga dapat mengetahui tahapan yang sudah dilalui oleh pesanan.

---

## 💰 21. Perhitungan Total

Perhitungan total harga barang dilakukan menggunakan:

```java
public double hitungTotal() {
    return barang.getHarga() * jumlah;
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20020132.png" width="100%">
    </td>
  </tr>
</table>

Sedangkan total pembayaran dengan biaya jasa titip menggunakan overloading:

```java
public double hitungTotal(double biayaJastip) {
    return hitungTotal() + biayaJastip;
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20013020.png" width="100%">
    </td>
  </tr>
</table>

Method:

```java
public double getTotalPembayaran() {
    return hitungTotal(biayaJastip);
}
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20013033.png" width="100%">
    </td>
  </tr>
</table>

digunakan untuk memperoleh total pembayaran akhir.

### Manfaat

Perhitungan dibuat di dalam class `PesananJastip` karena total pembayaran merupakan bagian dari proses transaksi.

---

## 🚚 22. Estimasi Biaya Jastip

Sistem juga menyediakan estimasi biaya jasa titip berdasarkan berat barang.

Perhitungan dasar:

```java
public double hitungEstimasiJastip() {
    double biayaPerKg = 50000;
    return barang.getBerat() * jumlah * biayaPerKg;
}
```
Sistem juga menyediakan versi yang menerima biaya per kilogram:

```java
public double hitungEstimasiJastip(double biayaPerKg) {
    return barang.getBerat() * jumlah * biayaPerKg;
}
```
### Mengapa dibuat dua method?

Method pertama digunakan ketika sistem menggunakan tarif default.

Method kedua digunakan ketika tarif dapat diberikan secara khusus.

Hal tersebut sekaligus menjadi contoh penerapan **method overloading**.

---

## ✅ 23. Validasi Input

Validasi input digunakan agar data yang dimasukkan pengguna tidak langsung diterima tanpa pemeriksaan.

Validasi digunakan untuk beberapa kondisi seperti:

- Input kosong.
- Input angka yang tidak sesuai.
- Jumlah barang tidak valid.
- Data khusus kategori belum lengkap.
- Nama pelanggan tidak sesuai aturan input.

Class:

```text
ValidasiInput.java
```

diletakkan pada package `View` karena proses tersebut berkaitan dengan input pengguna.

### Manfaat

Validasi membantu mengurangi kesalahan data dan membuat interaksi program menjadi lebih aman.

---

## 🧱 24. Pemisahan Barang dan Pesanan

Salah satu perbaikan dari Mini Project sebelumnya adalah pemisahan tanggung jawab antara `Barang` dan `PesananJastip`.

`Barang` berfokus pada:

- Nama barang.
- Negara asal.
- Harga.
- Berat.

Sedangkan `PesananJastip` berfokus pada:

- Pelanggan.
- Barang yang dipesan.
- Jumlah.
- Pembayaran.
- Status.
- Biaya jasa titip.
- Batch.
- Request khusus.
- Riwayat status.

Dengan pemisahan ini, satu class tidak menangani terlalu banyak tanggung jawab yang berbeda.

### Insight

Pemisahan ini membuat program lebih mudah dipahami karena setiap object memiliki peran yang lebih jelas dalam sistem.

---

## 🔁 25. Alur Pengelolaan Pesanan

Pengelolaan pesanan pada sistem mencakup beberapa proses utama:

- Pengguna memilih menu pengelolaan pesanan.
- Sistem meminta data pelanggan.
- Sistem meminta data barang.
- Pengguna menentukan jenis pesanan.
- Sistem membuat object sesuai jenis pesanan.
- Detail khusus kategori dimasukkan.
- Sistem melakukan validasi.
- Pesanan dikaitkan dengan pembayaran dan batch.
- Sistem menghitung nilai transaksi.
- Status pesanan dapat diperbarui sesuai tahapan.
- Setiap perubahan status dicatat sebagai riwayat.
- Pengguna dapat melihat struk atau ringkasan pesanan.

Alur tersebut dibuat lebih terstruktur dibandingkan sekadar memasukkan data lalu langsung menampilkan hasil.

---

## 🧩 26. Class PesananJastip

`PesananJastip` merupakan bagian utama dalam desain sistem karena menjadi class induk untuk jenis pesanan.

Class ini menyimpan data umum yang dimiliki seluruh pesanan, seperti:

```java
private final String idPesanan;
private Pelanggan pelanggan;
private Barang barang;
private int jumlah;
private Pembayaran pembayaran;
private String statusPesanan;
private double biayaJastip;
private BatchJastip batch;
private String requestKhusus;
private ArrayList<String> riwayatStatus;
```
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20013214.png" width="100%">
    </td>
  </tr>
</table>

Class ini juga menyediakan proses umum seperti:

- Menghitung total.
- Menghitung estimasi biaya jastip.
- Mengubah status.
- Menampilkan riwayat status.

Sementara detail khusus jenis pesanan diberikan kepada class turunannya.

---

## 📸 27. Dokumentasi Program

### 🖥️ 27.1 Menu Utama

Pada bagian ini menampilkan tampilan awal **Sistem Jasa Titip Luar Negeri** beserta sembilan menu utama yang tersedia dalam program.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20070435.png" width="100%">
    </td>
  </tr>
</table>

---

### 🛒 27.2 Menu 1 — Tambah Pesanan

Pada bagian ini menampilkan proses penambahan pesanan baru, mulai dari pengisian data pelanggan, barang, jumlah pesanan, kategori barang, detail khusus pesanan, hingga data pembayaran.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20070926.png" width="100%">
    </td>
  </tr>
</table>

---

### 📋 27.3 Menu 2 — Lihat Pesanan

Pada bagian ini menampilkan daftar pesanan yang telah tersimpan di dalam sistem beserta informasi yang berkaitan dengan pesanan tersebut.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20020132.png" width="100%">
    </td>
  </tr>
</table>

---

### ✏️ 27.4 Menu 3 — Ubah Pesanan

Pada bagian ini menampilkan proses perubahan data pesanan yang sudah tersimpan berdasarkan ID pesanan yang dipilih.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20071442.png" width="100%">
    </td>
  </tr>
</table>

Pada bagian ini menampilkan validasi bahwa pesanan sudah berubah statusnya.
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20071507.png" width="100%">
    </td>
  </tr>
</table>

---

### 🗑️ 27.5 Menu 4 — Hapus Pesanan

Pada bagian ini menampilkan proses penghapusan pesanan berdasarkan ID pesanan yang dipilih oleh pengguna.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20072044.png" width="100%">
    </td>
  </tr>
</table>

Jadi sebelum benar-benar dihapus, sistem akan mengvalidasi kembali apakah benar ingin di hapus? 

---

### 🧾 27.6 Menu 5 — Lihat Struk

Pada bagian ini menampilkan rincian pesanan dalam bentuk struk, termasuk informasi barang, jumlah, harga, biaya jastip, metode pembayaran, dan total pembayaran.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20071611.png" width="100%">
    </td>
  </tr>
</table>

---

### 🔄 27.7 Menu 6 — Ubah Status

Pada bagian ini menampilkan proses perubahan status pesanan sesuai dengan tahapan status yang telah ditentukan dalam sistem.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20071701.png" width="100%">
    </td>
  </tr>
</table>

Pada bagian ini menampilkan validasi bahwa pesanan sudah berubah statusnya.
<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20071736.png" width="100%">
    </td>
  </tr>
</table>

---

### 📊 27.8 Menu 7 — Ringkasan Pesanan

Pada bagian ini menampilkan ringkasan informasi pesanan yang telah tersimpan sehingga pengguna dapat melihat gambaran pesanan secara lebih singkat.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20071801.png" width="100%">
    </td>
  </tr>
</table>

---

### 📦 27.9 Menu 8 — Batch Jastip

Pada bagian ini menampilkan informasi mengenai **Batch Jastip**, seperti data batch dan informasi perjalanan yang berkaitan dengan proses jastip.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20071837.png" width="100%">
    </td>
  </tr>
</table>

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20071950.png" width="100%">
    </td>
  </tr>
</table>

---

### 🚪 27.10 Menu 9 — Keluar

Pada bagian ini menampilkan proses ketika pengguna memilih menu **Keluar** untuk mengakhiri penggunaan program.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20072110.png" width="100%">
    </td>
  </tr>
</table>

---

### ⬅️ 27.11 Pengembangan Fitur Keluar dengan Input `0`

Pada bagian ini menampilkan pengembangan alur input pada Mini Project 3. Pengguna dapat memasukkan **`0`** pada bagian input yang mendukung fitur tersebut untuk membatalkan proses yang sedang dilakukan dan kembali ke menu sebelumnya.

Pengembangan ini membuat interaksi dengan sistem menjadi lebih fleksibel karena pengguna tidak harus menyelesaikan seluruh proses pengisian data ketika ingin membatalkan atau kembali ke menu sebelumnya.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20072351.png" width="100%">
    </td>
  </tr>
</table>

### 🔐 27.12 Pengembangan Validasi Input

Validasi input dikembangkan agar data yang dimasukkan pengguna sesuai dengan aturan sistem.
Salah satu perbaikan dari Mini Project 2 adalah validasi nama pelanggan, sehingga input seperti angka tidak lagi diterima sebagai nama.

Selain itu, validasi juga diterapkan pada jumlah barang, input angka, dan detail khusus berdasarkan jenis pesanan.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-08%20072243.png" width="100%">
    </td>
  </tr>
</table>

---

## 📚 28. Ringkasan Konsep PBO

| Konsep | Penerapan |
|---|---|
| **Encapsulation** | Atribut dibuat `private` dan diakses melalui getter/setter |
| **Inheritance** | `JastipFashion`, `JastipSkincare`, dan `JastipElektronik` mewarisi `PesananJastip` |
| **Abstraction** | `PesananJastip` dibuat sebagai abstract class |
| **Abstract Method** | `getJenisPesanan()` |
| **Polymorphism – Overriding** | Implementasi `getJenisPesanan()` pada class turunan |
| **Polymorphism – Overloading** | `hitungTotal()` dan `hitungTotal(double)`, serta `hitungEstimasiJastip()` dan `hitungEstimasiJastip(double)` |
| **Interface** | `BisaDivalidasi` digunakan untuk validasi khusus pesanan |
| **MVC** | Pemisahan package `Model`, `View`, dan `Controller` |

Penerapan konsep tersebut tidak hanya dilakukan untuk memenuhi ketentuan tugas, tetapi disesuaikan dengan kebutuhan sistem agar setiap konsep mempunyai fungsi yang jelas.

---

## 🏷️ 29. Class dan Tanggung Jawab

| Class | Tanggung Jawab |
|---|---|
| `PesananJastip` | Data dan proses umum transaksi pesanan |
| `JastipFashion` | Pesanan fashion dan validasi ukuran serta warna |
| `JastipSkincare` | Pesanan skincare dan validasi jenis kulit serta ukuran produk |
| `JastipElektronik` | Pesanan elektronik dan validasi merek serta garansi |
| `Barang` | Menyimpan informasi barang |
| `Pelanggan` | Menyimpan informasi pelanggan |
| `Pembayaran` | Menyimpan metode pembayaran |
| `BatchJastip` | Menyimpan informasi batch perjalanan |
| `BisaDivalidasi` | Kontrak untuk proses validasi |
| `PesananController` | Mengatur proses pengelolaan pesanan |
| `MenuView` | Menampilkan menu utama |
| `PesananView` | Menampilkan proses dan informasi pesanan |
| `BatchView` | Menampilkan informasi batch |
| `ValidasiInput` | Membantu validasi input pengguna |
| `SistemJastip_Minpro3` | Menjalankan program |

Pembagian tersebut membantu menjaga agar setiap class tidak memiliki tanggung jawab yang terlalu luas.

---

## ⭐ 30. Nilai Tambah Project

Selain memenuhi konsep wajib Mini Project 3, project ini memiliki beberapa pengembangan tambahan:

- Menggunakan interface `BisaDivalidasi`.
- Validasi dibuat berbeda sesuai jenis pesanan.
- Memisahkan class `Barang` dari `PesananJastip`.
- Menggunakan class `Pelanggan` sebagai object tersendiri.
- Menggunakan class `Pembayaran` sebagai bagian dari transaksi.
- Menggunakan `BatchJastip` untuk mengelompokkan perjalanan.
- Menyediakan riwayat perubahan status.
- Membatasi perubahan status agar mengikuti alur transaksi.
- Menyediakan perhitungan total pembayaran.
- Menyediakan estimasi biaya jasa titip.
- Menggunakan MVC agar struktur program lebih terorganisir.
- Menyediakan opsi membatalkan proses input menggunakan `0`.
- Menambahkan fitur struk dan ringkasan pesanan.
- Meningkatkan validasi input dibandingkan project sebelumnya.
- Membuat alur input lebih fleksibel dan mudah digunakan.

Nilai tambah tersebut dibuat berdasarkan kebutuhan sistem, sehingga fitur yang ditambahkan tetap memiliki hubungan dengan proses bisnis jasa titip.

---

## 💡 31. Insight yang Didapat

Dari pengembangan Mini Project 3, dapat dipahami bahwa konsep PBO tidak hanya digunakan untuk membuat kode menjadi lebih panjang atau memenuhi ketentuan tugas.

Setiap konsep mempunyai peran masing-masing dalam menyelesaikan masalah pada sistem.

- **Encapsulation** membantu menjaga data agar tidak dapat diakses sembarangan.
- **Inheritance** membantu mengurangi pengulangan kode ketika beberapa object mempunyai karakteristik yang sama.
- **Abstraction** membantu menentukan struktur dasar dari sebuah object.
- **Polymorphism** membuat satu method dapat mempunyai perilaku yang berbeda atau digunakan dalam beberapa bentuk.
- **Interface** membantu menentukan perilaku tertentu yang dapat digunakan oleh beberapa class dengan kebutuhan implementasi yang berbeda.
- **MVC** membantu memisahkan data, tampilan, dan proses sehingga program lebih mudah dipahami.

Pengembangan ini juga menunjukkan bahwa desain class harus dibuat berdasarkan tanggung jawabnya. Misalnya, `Barang` tidak seharusnya menangani proses transaksi karena tugasnya adalah menyimpan informasi barang.

Selain itu, pengembangan fitur seperti opsi membatalkan input dengan `0` menunjukkan bahwa perancangan program tidak hanya memperhatikan bagaimana kode bekerja, tetapi juga bagaimana pengguna berinteraksi dengan sistem.

Dengan demikian, semakin jelas pembagian tanggung jawab antar-class dan semakin baik alur interaksi pengguna, semakin mudah juga program dikembangkan ketika terdapat kebutuhan baru.

---

## 🎯 32. Kesimpulan

Mini Project 3 **Sistem Jasa Titip Luar Negeri** berhasil dikembangkan dengan menerapkan konsep utama Pemrograman Berorientasi Objek dan struktur MVC.

Konsep **encapsulation, inheritance, abstraction, polymorphism, dan interface** diterapkan secara langsung pada sistem dan memiliki fungsi masing-masing dalam mendukung proses pengelolaan pesanan. Penggunaan abstract class `PesananJastip` menjadi dasar untuk berbagai jenis pesanan, sedangkan `JastipFashion`, `JastipSkincare`, dan `JastipElektronik` memberikan implementasi serta validasi khusus sesuai karakteristik masing-masing. 

Interface `BisaDivalidasi` juga digunakan secara nyata dalam proses validasi, bukan hanya sebagai implementasi tambahan pada class. Selain itu, pemisahan `Model`, `View`, dan `Controller` membuat struktur program lebih terorganisir. Pemisahan `Barang`, `Pelanggan`, `Pembayaran`, dan `BatchJastip` juga membantu setiap class mempunyai tanggung jawab yang lebih jelas. Dari sisi pengembangan, Mini Project 3 memperbaiki beberapa bagian dari Mini Project 2, baik dari struktur kode, validasi, alur input, pengelolaan status, maupun fitur pendukung. 

Pengguna juga diberikan kontrol yang lebih baik melalui opsi membatalkan proses input menggunakan `0`, melihat struk, melihat ringkasan, dan mengelola batch jastip. Secara keseluruhan, pengembangan Mini Project 3 memberikan pemahaman bahwa penerapan PBO yang baik bukan hanya tentang memenuhi konsep, tetapi juga tentang bagaimana konsep tersebut digunakan untuk membuat sistem yang lebih terstruktur, mudah dipahami, nyaman digunakan, dan lebih mudah dikembangkan.
