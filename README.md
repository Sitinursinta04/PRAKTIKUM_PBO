# 📦🛍️ Sistem Jasa Titip Belanja Luar Negeri - Mini Project 4

<p align="center">
  <b>Pengembangan Sistem Jasa Titip Berbasis Java, JDBC, DAO, dan Hibernate ORM</b>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-26-orange?style=for-the-badge&logo=openjdk" alt="Java">
  <img src="https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql" alt="MySQL">
  <img src="https://img.shields.io/badge/JDBC-PreparedStatement-1f6feb?style=for-the-badge" alt="JDBC">
  <img src="https://img.shields.io/badge/Hibernate-ORM-59666C?style=for-the-badge&logo=hibernate" alt="Hibernate">
  <img src="https://img.shields.io/badge/Maven-Project-C71A36?style=for-the-badge&logo=apachemaven" alt="Maven">
</p>

---

## 📌 Tentang Project

**Sistem Jasa Titip Luar Negeri** merupakan aplikasi berbasis Java yang dikembangkan untuk membantu proses pengelolaan pesanan jasa titip dari luar negeri.

Project ini merupakan lanjutan dari **Mini Project 3**. Pada Mini Project 4, sistem dikembangkan agar dapat terhubung dengan database MySQL menggunakan **JDBC, PreparedStatement, dan DAO**. Dengan adanya database, data pesanan tidak hanya tersimpan selama program berjalan, tetapi dapat disimpan secara permanen dan digunakan kembali ketika aplikasi dijalankan.

Sebagai nilai tambah, project ini juga menerapkan **Hibernate ORM**. JDBC tetap digunakan sebagai mekanisme utama pengelolaan data sesuai ketentuan Mini Project 4, sedangkan Hibernate digunakan sebagai implementasi tambahan untuk memperkenalkan pendekatan ORM dalam menghubungkan object Java dengan tabel database.

---

## 🎯 Tujuan Pengembangan

Pengembangan Mini Project 4 dilakukan untuk:

- Menghubungkan aplikasi Java dengan database MySQL.
- Menerapkan koneksi database menggunakan JDBC.
- Menerapkan `PreparedStatement` dalam proses query.
- Menerapkan pola **DAO (Data Access Object)** untuk memisahkan akses database dari logika program.
- Mengimplementasikan operasi **CRUD** pada data pesanan.
- Menyediakan dummy data awal melalui file `.sql`.
- Mempertahankan dan menerapkan kembali konsep OOP dari Mini Project 3.
- Menerapkan **Hibernate ORM** sebagai nilai tambah.
- Memahami hubungan antara object Java, proses aplikasi, dan database.

---

# 🧩 Struktur Package

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="" width="100%">
    </td>
  </tr>
</table>

Struktur package dipisahkan berdasarkan tanggung jawabnya agar kode lebih terorganisir.

`Model` menangani representasi data dan konsep OOP, `View` menangani interaksi dengan pengguna, `Controller` mengatur jalannya proses, sedangkan `DAO` menangani akses data ke database. Package `Config` digunakan untuk menangani konfigurasi koneksi JDBC dan Hibernate.

Pemisahan tersebut digunakan agar setiap bagian program memiliki tanggung jawab yang jelas. Dengan struktur seperti ini, perubahan pada proses database tidak harus langsung mengubah bagian tampilan maupun logika utama program.

---

# ⏩ Alur Program

Alur sistem dimulai ketika program dijalankan melalui class `SistemJastip_Minpro4`. Program kemudian mempersiapkan koneksi database dan memuat data pesanan melalui `PesananController` dan `PesananDAOImpl`.

Secara umum, proses program berjalan sebagai berikut:

- Program dijalankan melalui `SistemJastip_Minpro4`.
- `PesananController` memuat data pesanan dari DAO.
- `PesananDAOImpl` melakukan query ke database menggunakan JDBC dan `PreparedStatement`.
- Data dari database diubah menjadi object `PesananJastip`.
- Data ditampilkan melalui bagian `View`.
- Pengguna memilih operasi yang tersedia.
- Controller meneruskan proses ke DAO.
- DAO menjalankan query sesuai operasi yang dipilih.
- Database menyimpan perubahan.
- Data dimuat kembali sehingga tampilan program sesuai dengan kondisi database terbaru.

Pemisahan alur tersebut membuat proses antara **tampilan, logika program, akses database, dan database** menjadi lebih jelas.

---

# 🔐 Penerapan Encapsulation

**Encapsulation** merupakan konsep OOP yang digunakan untuk membatasi akses langsung terhadap data yang dimiliki oleh sebuah object.

Pada project ini, encapsulation diterapkan pada berbagai class dalam package `Model` dengan menggunakan atribut `private`. Contohnya pada class `Pelanggan`:

```java
private String idPelanggan;
private String namaPelanggan;
private String nomorTelepon;
```

Data tersebut tidak dapat diakses secara langsung dari luar class. Untuk membaca atau mengubah data, digunakan method getter dan setter.

```java
public String getNamaPelanggan() {
    return namaPelanggan;
}

public void setNamaPelanggan(String namaPelanggan) {
    this.namaPelanggan = namaPelanggan;
}
```

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="" width="100%">
    </td>
  </tr>
</table>

Encapsulation digunakan agar data object lebih terkontrol dan tidak dapat diubah secara sembarangan dari luar class. Selain menjaga data, penerapan ini juga membuat tanggung jawab setiap class menjadi lebih jelas, misalnya data pelanggan dikelola oleh `Pelanggan`, sedangkan data barang dikelola oleh `Barang`.

---

# 🧬 Penerapan Inheritance

**Inheritance** merupakan konsep OOP yang memungkinkan sebuah class mewarisi atribut dan method dari class lain.

Pada sistem ini, inheritance diterapkan pada jenis pesanan jasa titip. Class induknya adalah:

```java
public abstract class PesananJastip {
    ...
}
```

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="" width="100%">
    </td>
  </tr>
</table>

Class tersebut kemudian memiliki beberapa class turunan:

```text
PesananJastip
├── JastipFashion
├── JastipSkincare
└── JastipElektronik
```

Ketiga jenis pesanan tersebut memiliki karakteristik umum sebagai pesanan jasa titip, tetapi mempunyai detail khusus yang berbeda.

- `JastipFashion` memiliki ukuran dan warna.
- `JastipSkincare` memiliki jenis kulit dan ukuran produk.
- `JastipElektronik` memiliki merek dan informasi garansi.

Inheritance digunakan agar atribut dan perilaku yang bersifat umum tidak perlu ditulis ulang pada setiap class. Class turunan cukup menambahkan bagian yang memang khusus untuk jenis pesanan tersebut.

---

# 🗐 Penerapan Polymorphism

**Polymorphism** memungkinkan object dari beberapa class yang berbeda diperlakukan melalui tipe induk yang sama.

Pada project ini, polymorphism diterapkan melalui hubungan antara `PesananJastip` dengan class turunannya:

```text
JastipFashion
JastipSkincare
JastipElektronik
```

Salah satu bentuk penerapannya adalah overriding method:

```java
@Override
public String getJenisPesanan() {
    return "Jastip Fashion";
}
```

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="" width="100%">
    </td>
  </tr>
</table>

Class turunan lainnya juga memberikan implementasi terhadap method yang sama sesuai jenis pesanan masing-masing.

Dengan pendekatan tersebut, program dapat memperlakukan berbagai jenis pesanan sebagai `PesananJastip`, tetapi tetap menjalankan perilaku yang sesuai dengan object sebenarnya.

Penerapan polymorphism membuat sistem lebih fleksibel karena jenis pesanan baru dapat ditambahkan melalui class turunan tanpa harus membuat struktur program yang sepenuhnya berbeda.

---

# 🌌 Penerapan Abstraction

**Abstraction** digunakan untuk menyederhanakan struktur program dengan hanya menampilkan bagian penting dan menyembunyikan detail implementasi yang tidak perlu diketahui oleh bagian lain.

Pada project ini, abstraction diterapkan melalui abstract class:

```java
public abstract class PesananJastip
```

Salah satu method abstract yang digunakan adalah:

```java
public abstract String getJenisPesanan();
```

Class `PesananJastip` menjadi dasar untuk berbagai jenis pesanan, sedangkan detail mengenai jenis pesanan diserahkan kepada class turunannya.

Penggunaan abstraction membuat class induk berfokus pada karakteristik umum sebuah pesanan, sementara karakteristik khusus ditangani oleh masing-masing subclass.

---

# 🔗 Penerapan Interface

Selain abstract class, sistem juga menggunakan interface:

```java
public interface BisaDivalidasi {
    boolean validasiDetailPesanan();
}
```

Interface tersebut digunakan untuk memberikan kemampuan validasi kepada jenis pesanan.

Setiap jenis pesanan memiliki aturan validasi yang berbeda:

- Fashion melakukan validasi ukuran dan warna.
- Skincare melakukan validasi jenis kulit dan ukuran produk.
- Elektronik melakukan validasi merek dan garansi.

Interface digunakan karena setiap jenis pesanan memiliki tujuan validasi yang sama, tetapi aturan detailnya dapat berbeda.

---

# 🗄️ Database MySQL

Database yang digunakan pada project ini bernama:

```sql
sistem_jastip
```

Database terdiri dari beberapa tabel utama:

| Tabel | Fungsi |
|---|---|
| `pelanggan` | Menyimpan data pelanggan |
| `barang` | Menyimpan data barang |
| `pembayaran` | Menyimpan metode pembayaran |
| `batch_jastip` | Menyimpan informasi batch jasa titip |
| `pesanan` | Menyimpan data utama pesanan |
| `detail_fashion` | Menyimpan detail pesanan fashion |
| `detail_skincare` | Menyimpan detail pesanan skincare |
| `detail_elektronik` | Menyimpan detail pesanan elektronik |
| `riwayat_status` | Menyimpan riwayat status pesanan |

Relasi antar tabel digunakan agar data tidak seluruhnya disimpan dalam satu tabel. Contohnya, data pelanggan disimpan pada tabel `pelanggan`, kemudian tabel `pesanan` menyimpan `id_pelanggan` sebagai foreign key.

Pendekatan ini membuat data lebih terstruktur dan mengurangi pengulangan data yang tidak diperlukan.

---

# 📄 Dummy Data

Sesuai ketentuan Mini Project 4, database harus memiliki data awal sehingga fitur **Read** dapat langsung menampilkan data ketika program dijalankan.

Dummy data dimasukkan melalui:

```text
database/sistem_jastip.sql
```

Contoh data awal:

```sql
INSERT INTO pelanggan
(id_pelanggan, nama_pelanggan, nomor_telepon)
VALUES
('P001', 'Alya Putri', '081234567890'),
('P002', 'Raka Pratama', '082345678901');
```

Data awal tersebut dimasukkan melalui file SQL, bukan melalui kode Java. Dengan demikian, ketika fitur Read dijalankan, sistem sudah memiliki data yang dapat langsung ditampilkan.

---

# 🔌 Penerapan JDBC

**JDBC (Java Database Connectivity)** digunakan sebagai penghubung antara aplikasi Java dengan database MySQL.

Koneksi database terdapat pada:

```text
Config/DatabaseConnection.java
```

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="" width="100%">
    </td>
  </tr>
</table>

Contoh konfigurasi:

```java
private static final String URL =
        "jdbc:mysql://localhost:3306/sistem_jastip";

private static final String USER = "root";

private static final String PASSWORD = "";
```

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="" width="100%">
    </td>
  </tr>
</table>

Koneksi dibuat menggunakan:

```java
DriverManager.getConnection(URL, USER, PASSWORD);
```

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="" width="100%">
    </td>
  </tr>
</table>

JDBC digunakan sebagai mekanisme utama akses database karena merupakan bagian wajib dalam Mini Project 4. Melalui JDBC, aplikasi dapat berkomunikasi langsung dengan MySQL untuk mengambil maupun mengubah data.

---

# 🛡️ PreparedStatement

Dalam proses JDBC, project menggunakan **PreparedStatement** untuk menjalankan query database.

Contohnya:

```java
String sql = "DELETE FROM pesanan WHERE id_pesanan = ?";

PreparedStatement ps = connection.prepareStatement(sql);

ps.setString(1, idPesanan);

ps.executeUpdate();
```

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="" width="100%">
    </td>
  </tr>
</table>

Penggunaan parameter `?` membuat nilai data diberikan secara terpisah dari perintah SQL.

PreparedStatement digunakan agar query lebih terstruktur dan parameter tidak digabungkan langsung ke dalam string SQL. Pendekatan ini juga lebih aman dibandingkan menyusun query menggunakan penggabungan string secara langsung.

---

# 🗂️ Penerapan DAO

**DAO (Data Access Object)** digunakan untuk memisahkan proses akses database dari controller dan tampilan.

Interface DAO terdapat pada:

```text
DAO/PesananDAO.java
```

dengan operasi utama:

```java
List<PesananJastip> getAllPesanan();
boolean tambahPesanan(PesananJastip pesanan);
boolean ubahPesanan(PesananJastip pesanan);
boolean hapusPesanan(String idPesanan);
boolean ubahStatusPesanan(String idPesanan, String statusBaru);
```

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="" width="100%">
    </td>
  </tr>
</table>

Implementasinya terdapat pada:

```text
DAO/PesananDAOImpl.java
```

Dengan adanya DAO, `PesananController` tidak perlu menjalankan query SQL secara langsung. Controller cukup meminta DAO untuk melakukan operasi database.

Pemisahan ini membuat kode lebih terstruktur dan memudahkan pemeliharaan karena proses akses database berada pada bagian khusus.

---

# 📥 Penerapan CRUD

JDBC dan DAO digunakan untuk mendukung operasi CRUD pada data pesanan.

### ➕ Create

Digunakan untuk menambahkan data pesanan baru ke database.

```sql
INSERT INTO pesanan ...
```

### 📖 Read

Digunakan untuk mengambil data pesanan dari database.

Pada proses Read, beberapa tabel digabungkan menggunakan `JOIN` sehingga informasi pelanggan, barang, pembayaran, batch, dan detail jenis pesanan dapat ditampilkan secara bersamaan.

### ✏️ Update

Digunakan untuk mengubah data pesanan yang sudah tersimpan.

```sql
UPDATE pesanan
SET ...
WHERE id_pesanan = ?
```

### 🗑️ Delete

Digunakan untuk menghapus data pesanan berdasarkan ID.

```sql
DELETE FROM pesanan
WHERE id_pesanan = ?
```

CRUD diterapkan agar sistem dapat mengelola data secara lengkap, mulai dari menambahkan hingga menghapus data yang tersimpan di database.

---

# 🧭 Peran Controller

`PesananController` menjadi penghubung antara bagian `View`, `Model`, dan `DAO`.

Controller menerima tindakan dari pengguna melalui View, kemudian meneruskan proses sesuai operasi yang dipilih.

Contohnya pada proses pengambilan data:

```text
View
   ↓
PesananController
   ↓
PesananDAOImpl
   ↓
Database
   ↓
PesananDAOImpl
   ↓
PesananController
   ↓
View
```

Controller tidak menjalankan query SQL secara langsung karena proses tersebut menjadi tanggung jawab DAO. Pembagian ini membuat setiap bagian program memiliki tugas yang lebih jelas.

---

# 🖥️ Dokumentasi Output Program

Bagian ini berisi screenshot hasil program setelah fitur-fitur utama dijalankan. Dokumentasi output digunakan sebagai bukti visual bahwa fitur yang dikembangkan dapat berjalan dan terhubung dengan database.

## 1. Tampilan Menu Utama

Menampilkan menu utama sistem setelah program berhasil dijalankan.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-19%20211755.png" width="100%">
    </td>
  </tr>
</table>

---

## 2. Menampilkan Data Pesanan

Menampilkan data pesanan yang berasal dari database. Data dapat langsung muncul karena sebelumnya telah tersedia dummy data pada file `sistem_jastip.sql`.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-12%20235100.png" width="100%">
    </td>
  </tr>
</table>

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-13%20004622.png" width="100%">
    </td>
  </tr>
</table>

---

## 3. Menambahkan Pesanan

Menampilkan proses ketika pengguna menambahkan data pesanan baru melalui program.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-13%20000605.png" width="100%">
    </td>
  </tr>
</table>

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-13%20000628.png" width="100%">
    </td>
  </tr>
</table>

---

## 4. Mengubah Data Pesanan

Menampilkan proses dan hasil perubahan data pesanan yang sebelumnya telah tersimpan.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-13%20001127.png" width="100%">
    </td>
  </tr>
</table>

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-13%20001158.png" width="100%">
    </td>
  </tr>
</table>

---

## 5. Menghapus Data Pesanan

Menampilkan proses dan hasil penghapusan data pesanan berdasarkan ID.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-13%20002128.png" width="100%">
    </td>
  </tr>
</table>

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-13%20002137.png" width="100%">
    </td>
  </tr>
</table>

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-13%20002152.png" width="100%">
    </td>
  </tr>
</table>

---

## 6. Mengubah Status Pesanan

Menampilkan proses dan hasil perubahan status pesanan melalui sistem.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-13%20001513.png" width="100%">
    </td>
  </tr>
</table>

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-13%20001530.png" width="100%">
    </td>
  </tr>
</table>

---

## 7. Penerapan Hibernate ORM

Menampilkan hasil penerapan Hibernate ORM, khususnya proses pengambilan data melalui `PelangganHibernateDAO`.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-13%20001753.png" width="100%">
    </td>
  </tr>
</table>

---

## 9. Keluar dari Program

Menampilkan proses ketika pengguna memilih menu `9` untuk keluar dari sistem. Setelah memilih menu tersebut, program menghentikan proses dan menampilkan pesan bahwa aplikasi telah selesai digunakan.

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/kedua/Screenshot%202026-10-13%20005130.png" width="100%">
    </td>
  </tr>
</table>

---

# ✨ Penerapan Nilai Tambah - Hibernate ORM

Sebagai nilai tambah, project ini mengimplementasikan **Hibernate ORM**.

Hibernate merupakan framework ORM yang digunakan untuk memetakan object Java dengan tabel database sehingga proses interaksi dengan database dapat dilakukan melalui object.

Dependency Hibernate ditambahkan pada:

```text
pom.xml
```

```xml
<dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>6.6.26.Final</version>
</dependency>
```

Hibernate digunakan sebagai **nilai tambah**, sehingga tidak menggantikan JDBC yang menjadi ketentuan utama Mini Project 4.

Dalam project ini:

- **JDBC** digunakan sebagai mekanisme utama CRUD.
- **Hibernate ORM** digunakan sebagai implementasi tambahan untuk menunjukkan penggunaan framework ORM.

Penerapan dua pendekatan tersebut memberikan pemahaman mengenai perbedaan antara pengelolaan database menggunakan JDBC secara langsung dan pendekatan ORM yang bekerja melalui pemetaan object.

---

# ⚙️ Konfigurasi Hibernate

Konfigurasi Hibernate terdapat pada:

```text
Config/HibernateUtil.java
```

Class tersebut bertanggung jawab untuk membuat `SessionFactory` dan mengatur koneksi Hibernate dengan database.

Beberapa konfigurasi yang digunakan:

```java
configuration.setProperty(
        "hibernate.connection.driver_class",
        "com.mysql.cj.jdbc.Driver"
);

configuration.setProperty(
        "hibernate.connection.url",
        "jdbc:mysql://localhost:3306/sistem_jastip"
);

configuration.setProperty(
        "hibernate.connection.username",
        "root"
);

configuration.setProperty(
        "hibernate.connection.password",
        ""
);
```

Hibernate juga dikonfigurasi agar tidak mengubah struktur database:

```java
configuration.setProperty(
        "hibernate.hbm2ddl.auto",
        "none"
);
```

Pengaturan tersebut digunakan karena struktur tabel sudah dibuat melalui file SQL. Hibernate kemudian digunakan untuk berinteraksi dengan struktur database yang sudah tersedia.

---

# 🏷️ Entity Mapping

Beberapa class pada package `Model` digunakan sebagai entity Hibernate:

```text
Model
├── Pelanggan
├── Barang
├── Pembayaran
└── BatchJastip
```

Entity ditandai menggunakan annotation:

```java
@Entity
@Table(name = "pelanggan")
public class Pelanggan {
    ...
}
```

Primary key ditandai menggunakan:

```java
@Id
```

Sedangkan pemetaan atribut terhadap kolom database menggunakan:

```java
@Column(name = "nama_pelanggan")
```

Contohnya:

```java
@Entity
@Table(name = "pelanggan")
public class Pelanggan {

    @Id
    @Column(name = "id_pelanggan")
    private String idPelanggan;

    @Column(name = "nama_pelanggan")
    private String namaPelanggan;

    @Column(name = "nomor_telepon")
    private String nomorTelepon;
}
```

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="" width="100%">
    </td>
  </tr>
</table>

Entity mapping digunakan agar Hibernate mengetahui hubungan antara object Java dengan tabel dan kolom database yang digunakan.

---

# 🗃️ Hibernate DAO

Implementasi Hibernate DAO terdapat pada:

```text
DAO/PelangganHibernateDAO.java
```

Contoh pengambilan data:

```java
try (Session session =
        HibernateUtil.getSessionFactory().openSession()) {

    return session
            .createQuery(
                    "FROM Pelanggan",
                    Pelanggan.class
            )
            .getResultList();
}
```

<table border="1" bordercolor="black">
  <tr>
    <td>
      <img src="" width="100%">
    </td>
  </tr>
</table>

Pada bagian ini, Hibernate digunakan untuk mengambil data `Pelanggan` menggunakan entity dan object Java tanpa menulis query SQL `SELECT` secara langsung.

Penerapan ini menjadi contoh bagaimana ORM dapat menyederhanakan proses akses data tertentu karena developer bekerja melalui entity yang telah dipetakan ke tabel database.

---

# 🗺️ Lokasi Penerapan Konsep

| Konsep | Lokasi |
|---|---|
| Encapsulation | `Model/` |
| Inheritance | `Model/JastipFashion.java`, `JastipSkincare.java`, `JastipElektronik.java` |
| Polymorphism | `Model/PesananJastip.java` dan class turunannya |
| Abstraction | `Model/PesananJastip.java` |
| Interface | `Model/BisaDivalidasi.java` |
| JDBC | `Config/DatabaseConnection.java` |
| PreparedStatement | `DAO/PesananDAOImpl.java` |
| DAO | `DAO/PesananDAO.java`, `PesananDAOImpl.java` |
| CRUD | `DAO/PesananDAOImpl.java` dan `Controller/PesananController.java` |
| Database | `database/sistem_jastip.sql` |
| Hibernate Configuration | `Config/HibernateUtil.java` |
| Hibernate Entity | `Model/Pelanggan.java`, `Barang.java`, `Pembayaran.java`, `BatchJastip.java` |
| Hibernate DAO | `DAO/PelangganHibernateDAO.java` |
| Hibernate Dependency | `pom.xml` |

---

# 🗂️ File Database

File database disediakan dalam repository pada:

```text
database/sistem_jastip.sql
```

File tersebut berisi:

- Pembuatan database.
- Pembuatan tabel.
- Primary key.
- Foreign key.
- Relasi antar tabel.
- Dummy data awal.

File SQL disertakan agar database dapat dibuat kembali dengan struktur dan data awal yang sama ketika project dijalankan pada lingkungan lain.

---

# 🔗 Dependency Project

Project menggunakan Maven untuk mengelola dependency.

### MySQL Connector

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>9.4.0</version>
</dependency>
```

Dependency tersebut digunakan agar aplikasi Java dapat berkomunikasi dengan MySQL melalui JDBC.

### Hibernate ORM

```xml
<dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>6.6.26.Final</version>
</dependency>
```

Dependency tersebut digunakan untuk menerapkan Hibernate sebagai nilai tambah ORM pada project.

---

# 📑 Kesimpulan

Mini Project 4 mengembangkan **Sistem Jasa Titip Luar Negeri** menjadi aplikasi Java yang telah terintegrasi dengan database MySQL.

Penggunaan **JDBC, PreparedStatement, dan DAO** memungkinkan aplikasi melakukan proses penyimpanan, pembacaan, perubahan, dan penghapusan data secara langsung pada database. Struktur DAO juga membantu memisahkan proses akses database dari controller sehingga kode menjadi lebih terorganisir.

Konsep OOP dari Mini Project sebelumnya tetap dipertahankan melalui penerapan **encapsulation, inheritance, polymorphism, abstraction, dan interface**. Konsep tersebut tidak hanya digunakan sebagai teori, tetapi diterapkan langsung pada struktur class yang membangun sistem jasa titip.

Sebagai nilai tambah, project mengimplementasikan **Hibernate ORM** melalui `HibernateUtil`, entity mapping, dan `PelangganHibernateDAO`. Implementasi ini menunjukkan alternatif pendekatan dalam mengakses database tanpa menghilangkan JDBC sebagai mekanisme utama yang diwajibkan.

Secara keseluruhan, project ini memberikan pemahaman mengenai hubungan antara **konsep OOP, pengelolaan database, JDBC, DAO, CRUD, dan ORM** dalam membangun sebuah aplikasi Java yang lebih terstruktur.

---

<p align="center">
  <b>📦🛍️ Mini Project 4 - Sistem Jasa Titip Luar Negeri</b><br>
  <i>Java • JDBC • DAO • MySQL • Hibernate ORM</i>
</p>
