# Mini Project 4 — Sistem Jasa Titip Luar Negeri

## 1. Identitas Project

- **Nama Project:** Sistem Jasa Titip Luar Negeri
- **Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)
- **Mini Project:** 4
- **Bahasa Pemrograman:** Java
- **Database:** MySQL
- **Build Tool:** Maven
- **IDE:** NetBeans
- **Repository:** `Minpro-4-SistemJastip`

---

## 2. Deskripsi Project

Sistem Jasa Titip Luar Negeri merupakan aplikasi berbasis Java yang digunakan untuk membantu proses pengelolaan pesanan jasa titip dari luar negeri.

Pada Mini Project 4, program dikembangkan dari Mini Project 3 dengan menambahkan integrasi database menggunakan **JDBC, PreparedStatement, dan DAO**. Data yang sebelumnya dikelola melalui program sekarang dapat disimpan dan diambil langsung dari database MySQL.

Selain JDBC, project ini juga menerapkan **Hibernate ORM sebagai nilai tambah**. Hibernate digunakan untuk melakukan pemetaan beberapa class Java menjadi entity yang terhubung dengan tabel database.

Pengembangan ini membuat sistem tidak hanya menerapkan konsep PBO, tetapi juga menggabungkan konsep PBO dengan pengelolaan database menggunakan pendekatan JDBC dan ORM.

---

## 3. Tujuan Pengembangan

Pengembangan Mini Project 4 bertujuan untuk:

- Menghubungkan aplikasi Java dengan database MySQL.
- Menerapkan JDBC menggunakan `PreparedStatement`.
- Menerapkan pola DAO untuk memisahkan proses akses database dari bagian program lainnya.
- Membuat fitur CRUD yang terhubung dengan database.
- Menyediakan dummy data awal melalui file `.sql`.
- Mempertahankan konsep PBO yang sudah diterapkan pada Mini Project 3.
- Menerapkan Hibernate ORM sebagai nilai tambah.
- Memahami perbedaan pendekatan akses database menggunakan JDBC dan ORM.
- Membuat struktur program yang lebih terorganisir dan mudah dikembangkan.

---

## 4. Fitur Sistem

Sistem memiliki beberapa fitur utama:

- Tambah pesanan jasa titip.
- Menampilkan data pesanan.
- Mengubah data pesanan.
- Menghapus pesanan.
- Menampilkan struk pesanan.
- Mengubah status pesanan.
- Menampilkan ringkasan pesanan.
- Mengelola batch jasa titip.
- Validasi input pengguna.
- Penyimpanan data ke database MySQL.
- Pembacaan data dari database menggunakan JDBC.
- CRUD menggunakan DAO.
- Pemetaan entity menggunakan Hibernate ORM.

---

## 5. Struktur Project

```text
SistemJastip_Minpro4
├── Controller
│   └── PesananController.java
│
├── Model
│   ├── PesananJastip.java
│   ├── JastipFashion.java
│   ├── JastipSkincare.java
│   ├── JastipElektronik.java
│   ├── Barang.java
│   ├── Pelanggan.java
│   ├── Pembayaran.java
│   └── BatchJastip.java
│
├── View
│   ├── MenuView.java
│   ├── PesananView.java
│   ├── BatchView.java
│   └── ValidasiInput.java
│
├── DAO
│   ├── PesananDAO.java
│   ├── PesananDAOImpl.java
│   └── PelangganHibernateDAO.java
│
├── Config
│   ├── DatabaseConnection.java
│   └── HibernateUtil.java
│
└── Main
    └── SistemJastip_Minpro4.java

database
└── sistem_jastip.sql
```

Struktur tersebut digunakan agar setiap bagian program memiliki tanggung jawab yang jelas. Model menangani data dan aturan objek, View menangani tampilan serta input, Controller mengatur proses sistem, DAO menangani akses database, sedangkan Config menangani konfigurasi koneksi dan Hibernate.

---

## 6. Penerapan MVC

Project menggunakan pembagian **Model, View, dan Controller**.

### Model

Package `Model` berisi class yang merepresentasikan data dan objek dalam sistem, seperti:

- `PesananJastip`
- `JastipFashion`
- `JastipSkincare`
- `JastipElektronik`
- `Barang`
- `Pelanggan`
- `Pembayaran`
- `BatchJastip`

Model juga berisi atribut, constructor, getter, setter, method perhitungan, validasi, serta aturan perubahan status.

### View

Package `View` digunakan untuk mengatur interaksi dengan pengguna.

Contohnya:

- `MenuView` menampilkan menu utama.
- `PesananView` menangani tampilan yang berkaitan dengan pesanan.
- `BatchView` menangani tampilan batch.
- `ValidasiInput` menangani validasi input pengguna.

### Controller

`PesananController` menjadi penghubung antara View, Model, dan DAO.

Controller menerima proses dari View, menjalankan aturan pada Model, kemudian menggunakan DAO untuk menyimpan atau mengambil data dari database.

---

## 7. Encapsulation

Encapsulation diterapkan dengan membuat atribut pada class menggunakan access modifier `private`.

Contohnya pada `Pelanggan`:

```java
private String idPelanggan;
private String namaPelanggan;
private String nomorTelepon;
```

Data tersebut tidak dapat diakses secara langsung dari luar class. Untuk mengakses atau mengubah data digunakan getter dan setter.

Contohnya:

```java
public String getNamaPelanggan() {
    return namaPelanggan;
}

public void setNamaPelanggan(String namaPelanggan) {
    this.namaPelanggan = namaPelanggan;
}
```

### Alasan penggunaan

Encapsulation digunakan agar data pada objek tidak dapat diubah secara sembarangan dari luar class.

### Manfaat

- Data lebih terlindungi.
- Perubahan nilai dapat dikontrol melalui method.
- Struktur class menjadi lebih rapi.
- Program lebih mudah dikembangkan.

---

## 8. Inheritance

Inheritance diterapkan pada class jenis pesanan.

Class:

```text
PesananJastip
├── JastipFashion
├── JastipSkincare
└── JastipElektronik
```

`PesananJastip` menjadi parent class, sedangkan ketiga jenis jasa titip menjadi subclass.

Dengan inheritance, atribut dan method umum yang dimiliki semua jenis pesanan dapat digunakan kembali oleh subclass.

### Alasan penggunaan

Setiap jenis jasa titip memiliki data umum yang sama, tetapi juga mempunyai detail khusus yang berbeda.

Dengan inheritance, bagian yang sama tidak perlu dibuat berulang pada setiap class.

### Manfaat

- Mengurangi duplikasi kode.
- Mempermudah pengembangan jenis pesanan baru.
- Membentuk hubungan antar-class yang lebih jelas.
- Mendukung penerapan polymorphism.

---

## 9. Abstraction

Abstraction diterapkan melalui class `PesananJastip` yang memiliki method abstrak:

```java
public abstract String getJenisPesanan();
```

Class tersebut tidak menentukan secara langsung jenis pesanan yang digunakan.

Implementasinya diberikan oleh subclass seperti:

```java
JastipFashion
JastipSkincare
JastipElektronik
```

Setiap subclass dapat memberikan hasil sesuai jenis pesanan masing-masing.

### Alasan penggunaan

Tidak semua detail implementasi perlu ditentukan pada parent class. Parent class hanya menentukan aturan umum yang harus dimiliki oleh subclass.

### Manfaat

- Membuat struktur program lebih jelas.
- Memaksa subclass memiliki implementasi tertentu.
- Mempermudah penambahan jenis pesanan baru.
- Mengurangi ketergantungan pada implementasi tertentu.

---

## 10. Polymorphism

Polymorphism diterapkan melalui overriding dan penggunaan referensi parent class untuk objek subclass.

Contohnya, objek:

```java
JastipFashion
JastipSkincare
JastipElektronik
```

dapat diperlakukan sebagai objek:

```java
PesananJastip
```

Method `getJenisPesanan()` kemudian menghasilkan perilaku yang berbeda sesuai objek sebenarnya.

### Contoh konsep

```java
PesananJastip pesanan;

pesanan = new JastipFashion();
```

Ketika method jenis pesanan dipanggil, implementasi dari `JastipFashion` yang digunakan.

### Manfaat

Polymorphism membuat sistem lebih fleksibel karena Controller maupun bagian lain dapat bekerja menggunakan tipe `PesananJastip` tanpa harus selalu bergantung pada subclass tertentu.

---

## 11. Interface `BisaDivalidasi`

Project juga menggunakan interface:

```java
public interface BisaDivalidasi {
    boolean validasiDetailPesanan();
}
```

Interface tersebut digunakan untuk menentukan bahwa jenis pesanan tertentu memiliki kemampuan untuk melakukan validasi detail pesanan.

Interface diimplementasikan sesuai kebutuhan masing-masing subclass.

---

## 12. Validasi Jastip Fashion

`JastipFashion` memiliki detail khusus berupa:

- Ukuran.
- Warna.

Validasi dilakukan melalui method:

```java
validasiDetailPesanan()
```

Validasi ini memastikan detail yang diperlukan untuk pesanan fashion tersedia sebelum pesanan diproses.

---

## 13. Validasi Jastip Skincare

`JastipSkincare` memiliki detail khusus berupa:

- Jenis kulit.
- Ukuran produk.

Detail tersebut digunakan untuk menyesuaikan informasi produk skincare yang dipesan.

---

## 14. Validasi Jastip Elektronik

`JastipElektronik` memiliki detail khusus berupa:

- Merek.
- Garansi.

Informasi tersebut digunakan karena barang elektronik membutuhkan informasi tambahan yang berbeda dari fashion maupun skincare.

---

## 15. Penggunaan Interface

Interface `BisaDivalidasi` membantu membuat aturan validasi yang dapat digunakan oleh berbagai jenis pesanan.

Konsep ini membuat setiap jenis pesanan dapat mempunyai mekanisme validasi sendiri tanpa menghilangkan struktur umum pada sistem.

---

## 16. Class `Barang`

Class `Barang` digunakan untuk menyimpan informasi barang yang dititipkan.

Atribut utama:

- `idBarang`
- `namaBarang`
- `negaraAsal`
- `harga`
- `berat`

Class ini kemudian dipetakan ke tabel:

```text
barang
```

pada database.

---

## 17. Class `Pelanggan`

Class `Pelanggan` digunakan untuk menyimpan data pelanggan.

Atribut:

- `idPelanggan`
- `namaPelanggan`
- `nomorTelepon`

Class ini dipetakan ke tabel:

```text
pelanggan
```

---

## 18. Class `Pembayaran`

Class `Pembayaran` digunakan untuk menyimpan informasi metode pembayaran.

Atribut:

- `idPembayaran`
- `metodePembayaran`

Class ini dipetakan ke tabel:

```text
pembayaran
```

---

## 19. Class `BatchJastip`

`BatchJastip` digunakan untuk mengelompokkan proses jasa titip berdasarkan perjalanan atau periode tertentu.

Atribut yang digunakan:

- `idBatch`
- `negaraTujuan`
- `tanggalBuka`
- `batasOrder`
- `tanggalBerangkat`
- `statusBatch`

Class ini dipetakan ke tabel:

```text
batch_jastip
```

---

## 20. Status Pesanan

Pesanan memiliki status untuk menunjukkan kondisi pesanan.

Status digunakan untuk membantu sistem mengetahui proses pesanan dari awal sampai tahap berikutnya.

Perubahan status dilakukan melalui method yang sudah disediakan pada `PesananJastip` sehingga status tidak dapat diubah secara sembarangan.

---

## 21. Riwayat Status

Sistem juga menyediakan tabel:

```text
riwayat_status
```

Tabel tersebut digunakan untuk menyimpan perubahan status pesanan.

Contohnya:

```text
Menunggu Pembayaran
        ↓
Pembayaran Berhasil
```

Dengan adanya riwayat status, perubahan kondisi pesanan dapat dicatat sehingga informasi proses pesanan lebih mudah ditelusuri.

---

## 22. Perhitungan Total Pesanan

`PesananJastip` memiliki proses perhitungan total biaya berdasarkan:

- Harga barang.
- Jumlah barang.
- Biaya jasa titip.

Perhitungan dilakukan melalui method pada Model sehingga aturan perhitungan tidak ditempatkan langsung pada View.

Hal ini membuat tanggung jawab program menjadi lebih terpisah dan mudah dikelola.

---

## 23. Estimasi Biaya Jasa Titip

Sistem juga menyediakan perhitungan atau estimasi biaya jasa titip berdasarkan jenis pesanan.

Dengan demikian, setiap jenis pesanan dapat memiliki aturan biaya yang sesuai dengan kebutuhan sistem.

Perhitungan tersebut ditempatkan pada bagian Model agar aturan bisnis tidak bercampur dengan tampilan program.

---

## 24. Validasi Input

Validasi input dilakukan melalui class:

```text
View/ValidasiInput.java
```

Validasi digunakan untuk memastikan input pengguna sesuai dengan tipe data dan aturan yang dibutuhkan.

Contohnya:

- Input angka harus berupa angka.
- Input jumlah tidak boleh sembarangan.
- Input tertentu dapat dibatalkan menggunakan pilihan `0`.

Penggunaan validasi membantu mencegah error ketika pengguna memasukkan data yang tidak sesuai.

---

## 25. Pemisahan Barang dan Pesanan

Data barang dan data pesanan dibuat dalam class yang berbeda.

`Barang` berfokus pada informasi barang, sedangkan `PesananJastip` berfokus pada proses pemesanan.

Pemisahan ini membuat setiap class memiliki tanggung jawab yang lebih spesifik.

---

# 26. Database

Database yang digunakan dalam project ini adalah:

```text
sistem_jastip
```

Database dibuat menggunakan MySQL.

Tabel yang digunakan:

```text
pelanggan
barang
pembayaran
batch_jastip
pesanan
detail_fashion
detail_skincare
detail_elektronik
riwayat_status
```

---

## 27. File SQL

File database disimpan di:

```text
database/sistem_jastip.sql
```

File tersebut berisi:

- Pembuatan database.
- Pembuatan tabel.
- Primary key.
- Foreign key.
- Dummy data awal.

File `.sql` disertakan dalam repository agar database dapat dibuat kembali tanpa harus memasukkan seluruh data secara manual.

---

## 28. Dummy Data

Mini Project 4 memiliki dummy data awal yang dimasukkan melalui file SQL.

Contoh data pelanggan:

```text
P001 - Alya Putri
P002 - Raka Pratama
```

Contoh barang:

```text
Dress Korea
Skincare Serum
```

Contoh pesanan:

```text
PJ001
PJ002
```

Dummy data digunakan agar ketika fitur Read dijalankan, data langsung dapat ditampilkan dari database.

Data awal tersebut tidak dibuat melalui kode Java, tetapi dimasukkan melalui file:

```text
sistem_jastip.sql
```

Hal ini sesuai dengan ketentuan Mini Project 4.

---

# 29. JDBC

JDBC digunakan sebagai pendekatan utama untuk menghubungkan program Java dengan database MySQL.

JDBC digunakan untuk:

- Membuka koneksi database.
- Menjalankan query.
- Membaca data.
- Menambahkan data.
- Mengubah data.
- Menghapus data.

Library MySQL Connector digunakan melalui Maven.

Dependency yang digunakan:

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>9.4.0</version>
</dependency>
```

---

## 30. DatabaseConnection

Class:

```text
Config/DatabaseConnection.java
```

digunakan untuk membuat koneksi antara aplikasi Java dengan database MySQL.

Konfigurasi database meliputi:

```java
private static final String URL =
        "jdbc:mysql://localhost:3306/sistem_jastip";

private static final String USER = "root";

private static final String PASSWORD = "";
```

Koneksi dibuat menggunakan:

```java
DriverManager.getConnection(
    URL,
    USER,
    PASSWORD
);
```

Pemisahan konfigurasi koneksi ke dalam satu class membuat proses koneksi lebih mudah dikelola.

---

# 31. PreparedStatement

Akses database pada DAO menggunakan `PreparedStatement`.

PreparedStatement digunakan untuk menjalankan query dengan parameter.

Contoh konsep:

```java
String sql = "DELETE FROM pesanan WHERE id_pesanan = ?";

PreparedStatement ps = connection.prepareStatement(sql);

ps.setString(1, idPesanan);

ps.executeUpdate();
```

Parameter tidak langsung digabungkan ke dalam query.

### Alasan penggunaan

PreparedStatement dipilih karena:

- Query lebih terstruktur.
- Parameter lebih mudah dikelola.
- Mengurangi risiko SQL Injection.
- Sesuai dengan ketentuan Mini Project 4.

---

# 32. DAO

DAO merupakan singkatan dari **Data Access Object**.

DAO digunakan untuk memisahkan proses akses database dari Controller dan Model.

Project menggunakan:

```text
PesananDAO.java
PesananDAOImpl.java
```

`PesananDAO` berisi kontrak operasi database.

Contohnya:

```java
List<PesananJastip> getAllPesanan();

boolean tambahPesanan(PesananJastip pesanan);

boolean ubahPesanan(PesananJastip pesanan);

boolean hapusPesanan(String idPesanan);

boolean ubahStatusPesanan(
    String idPesanan,
    String statusBaru
);
```

---

# 33. Implementasi DAO

`PesananDAOImpl` menjadi implementasi dari `PesananDAO`.

Class ini bertanggung jawab melakukan operasi database seperti:

- SELECT.
- INSERT.
- UPDATE.
- DELETE.

Query database dijalankan menggunakan JDBC dan PreparedStatement.

Dengan pola ini, Controller tidak perlu menuliskan query SQL secara langsung.

---

# 34. CRUD

CRUD merupakan singkatan dari:

- **Create** — menambahkan data.
- **Read** — membaca data.
- **Update** — mengubah data.
- **Delete** — menghapus data.

Pada sistem ini:

### Create

Data pesanan baru dimasukkan ke database.

### Read

Data pesanan dibaca dari database menggunakan query SELECT.

### Update

Data pesanan dapat diperbarui menggunakan query UPDATE.

### Delete

Pesanan dapat dihapus menggunakan query DELETE.

CRUD menjadi bagian utama pengembangan Mini Project 4 karena data program sudah tidak hanya tersimpan selama program berjalan, tetapi juga tersimpan secara permanen di database.

---

# 35. Controller dan DAO

Controller bertugas mengatur proses sistem, sedangkan DAO bertugas mengakses database.

Alur sederhananya:

```text
View
  ↓
Controller
  ↓
DAO
  ↓
Database
```

Ketika data dibaca:

```text
Database
  ↓
DAO
  ↓
Controller
  ↓
View
```

Pemisahan ini membuat program lebih terstruktur karena masing-masing bagian memiliki tanggung jawab yang berbeda.

---

# 36. Integrasi JDBC dengan Program

Integrasi JDBC dilakukan dengan mempertahankan Model dan Controller dari Mini Project 3 kemudian menambahkan DAO dan koneksi database.

Dengan pendekatan ini, pengembangan Mini Project 4 tidak membuat ulang seluruh program dari awal.

Struktur program yang sudah ada tetap digunakan, kemudian ditambahkan bagian:

```text
Config
DAO
Database
```

untuk mendukung penyimpanan data secara permanen.

---

# 37. Hibernate ORM — Nilai Tambah

Selain JDBC, project ini juga menerapkan **Hibernate ORM** sebagai nilai tambah.

Hibernate ORM digunakan untuk menghubungkan object Java dengan tabel database.

ORM merupakan singkatan dari:

> Object Relational Mapping

Konsep ini memungkinkan class Java dipetakan ke tabel database menggunakan annotation seperti:

```java
@Entity
@Table(name = "pelanggan")
```

Dengan ORM, developer tidak selalu harus menuliskan query SQL secara manual untuk operasi tertentu.

---

# 38. Dependency Hibernate

Hibernate ditambahkan ke `pom.xml` menggunakan dependency:

```xml
<dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>6.6.26.Final</version>
</dependency>
```

Hibernate digunakan sebagai teknologi tambahan dan tidak menggantikan JDBC yang sudah menjadi ketentuan utama.

Dengan demikian, project memiliki dua pendekatan:

```text
JDBC  → ketentuan utama
Hibernate ORM → nilai tambah
```

---

# 39. HibernateUtil

Class:

```text
Config/HibernateUtil.java
```

digunakan untuk membuat dan mengatur `SessionFactory`.

HibernateUtil mendaftarkan entity yang digunakan:

```java
configuration.addAnnotatedClass(Pelanggan.class);
configuration.addAnnotatedClass(Barang.class);
configuration.addAnnotatedClass(Pembayaran.class);
configuration.addAnnotatedClass(BatchJastip.class);
```

Konfigurasi database juga dilakukan pada class ini.

Hibernate diarahkan ke database:

```text
sistem_jastip
```

serta menggunakan:

```text
com.mysql.cj.jdbc.Driver
```

Hibernate juga dikonfigurasi dengan:

```text
hibernate.hbm2ddl.auto = none
```

sehingga Hibernate tidak membuat atau mengubah struktur tabel database yang sudah dibuat melalui file SQL.

---

# 40. Entity Hibernate

Beberapa class Model digunakan sebagai entity Hibernate.

Entity yang digunakan:

```text
Pelanggan
Barang
Pembayaran
BatchJastip
```

Contoh mapping:

```java
@Entity
@Table(name = "pelanggan")
public class Pelanggan {
    ...
}
```

Annotation tersebut memberitahu Hibernate bahwa class `Pelanggan` dipetakan ke tabel `pelanggan`.

---

# 41. Mapping Primary Key

Primary key pada entity ditandai menggunakan:

```java
@Id
```

Contohnya:

```java
@Id
@Column(name = "id_pelanggan")
private String idPelanggan;
```

Untuk kolom yang menggunakan auto increment seperti `id_barang`, digunakan:

```java
@GeneratedValue(strategy = GenerationType.IDENTITY)
```

Contohnya:

```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_barang")
private int idBarang;
```

---

# 42. Constructor Kosong Hibernate

Entity yang digunakan Hibernate memiliki constructor kosong.

Contohnya:

```java
public Pelanggan() {
}
```

Constructor kosong diperlukan agar Hibernate dapat membuat instance object ketika mengambil data dari database.

Constructor dengan parameter tetap digunakan untuk kebutuhan pembuatan object secara normal pada program.

---

# 43. PelangganHibernateDAO

DAO khusus Hibernate dibuat pada:

```text
DAO/PelangganHibernateDAO.java
```

Class ini digunakan untuk mengambil data pelanggan menggunakan Hibernate.

Contohnya:

```java
public List<Pelanggan> getAllPelanggan() {

    try (Session session =
            HibernateUtil.getSessionFactory().openSession()) {

        return session
                .createQuery(
                        "FROM Pelanggan",
                        Pelanggan.class
                )
                .getResultList();

    } catch (Exception e) {

        System.out.println(
                "Gagal mengambil data pelanggan menggunakan Hibernate: "
                + e.getMessage()
        );

        return List.of();
    }
}
```

Query:

```text
FROM Pelanggan
```

merupakan HQL atau Hibernate Query Language.

Query tersebut menggunakan nama entity Java, bukan nama tabel SQL secara langsung.

---

# 44. Alasan Menggunakan Hibernate ORM

Hibernate digunakan sebagai nilai tambah karena dapat menunjukkan bahwa program tidak hanya memahami JDBC, tetapi juga memahami konsep ORM.

Pada JDBC, developer berinteraksi dengan database menggunakan SQL dan PreparedStatement.

Pada Hibernate, object Java dapat dipetakan ke tabel database menggunakan annotation.

Perbandingan pendekatannya:

| JDBC | Hibernate ORM |
|---|---|
| Menggunakan SQL secara langsung | Menggunakan entity dan HQL |
| PreparedStatement | Session dan Query |
| Developer mengatur mapping secara manual | Mapping menggunakan annotation |
| Cocok untuk memahami SQL dan kontrol query | Membantu mengurangi kode akses database |

---

# 45. Implementasi ORM pada Project

ORM diterapkan pada package:

```text
Model
Config
DAO
```

Bagian yang digunakan:

```text
Model/Pelanggan.java
Model/Barang.java
Model/Pembayaran.java
Model/BatchJastip.java

Config/HibernateUtil.java

DAO/PelangganHibernateDAO.java
```

Dengan demikian, lokasi penerapan nilai tambah ORM dapat dilihat secara jelas pada struktur project.

---

# 46. JDBC Tetap Dipertahankan

Walaupun Hibernate ORM diterapkan sebagai nilai tambah, JDBC tetap digunakan sebagai teknologi utama untuk memenuhi ketentuan Mini Project 4.

Jadi project tidak mengganti JDBC dengan Hibernate.

Strukturnya:

```text
JDBC
├── DatabaseConnection
├── PesananDAO
└── PesananDAOImpl

Hibernate ORM
├── HibernateUtil
├── Entity
└── PelangganHibernateDAO
```

Pendekatan tersebut menunjukkan bahwa project dapat menggunakan dua pendekatan akses database tanpa menghilangkan ketentuan utama.

---

# 47. Alur Pengelolaan Pesanan

Proses utama pengelolaan pesanan pada program:

- Pengguna memilih menu pada View.
- View menerima input pengguna.
- Controller menerima proses dari View.
- Controller memproses object Model.
- DAO menjalankan operasi database menggunakan JDBC.
- Database menyimpan atau mengembalikan data.
- Controller memperbarui data pada program.
- View menampilkan hasil kepada pengguna.

Untuk proses Read:

```text
User
↓
View
↓
Controller
↓
PesananDAO
↓
PesananDAOImpl
↓
MySQL
↓
Data Pesanan
↓
View
```

---

# 48. Pengujian Program

Pengujian dilakukan untuk memastikan program dapat berkomunikasi dengan database dan menjalankan fitur CRUD.

Pengujian mencakup:

- Menjalankan program.
- Menampilkan dummy data.
- Menambahkan pesanan.
- Mengubah data pesanan.
- Menghapus pesanan.
- Mengubah status pesanan.
- Memastikan data tersimpan pada database.
- Memastikan data dari database dapat ditampilkan kembali.

---

# 49. Pengujian Read

Ketika program pertama kali dijalankan, data dummy dari database dapat ditampilkan tanpa harus memasukkan data baru terlebih dahulu.

Hal tersebut membuktikan bahwa:

```text
File SQL
↓
Database MySQL
↓
JDBC
↓
DAO
↓
Controller
↓
View
```

sudah terhubung dengan baik.

---

# 50. Dokumentasi Menu Program

Menu utama program menyediakan beberapa pilihan pengelolaan sistem, seperti:

```text
1. Tambah Pesanan
2. Lihat Pesanan
3. Ubah Pesanan
4. Hapus Pesanan
5. Cetak Struk
6. Ubah Status
7. Ringkasan
8. Kelola Batch
9. Keluar
```

Menu digunakan sebagai pusat interaksi pengguna dengan sistem.

---

# 51. Class dan Tanggung Jawab

| Class | Tanggung Jawab |
|---|---|
| `PesananJastip` | Menyimpan aturan umum pesanan |
| `JastipFashion` | Menangani pesanan fashion |
| `JastipSkincare` | Menangani pesanan skincare |
| `JastipElektronik` | Menangani pesanan elektronik |
| `Barang` | Menyimpan data barang |
| `Pelanggan` | Menyimpan data pelanggan |
| `Pembayaran` | Menyimpan data pembayaran |
| `BatchJastip` | Mengatur batch jasa titip |
| `PesananController` | Mengatur alur proses sistem |
| `PesananDAO` | Menentukan operasi akses data |
| `PesananDAOImpl` | Implementasi akses database JDBC |
| `DatabaseConnection` | Mengatur koneksi JDBC |
| `HibernateUtil` | Mengatur SessionFactory Hibernate |
| `PelangganHibernateDAO` | Akses data pelanggan menggunakan Hibernate |
| `MenuView` | Menampilkan menu utama |
| `PesananView` | Menampilkan proses pesanan |
| `BatchView` | Menampilkan proses batch |
| `ValidasiInput` | Validasi input pengguna |

---

# 52. Konsep PBO yang Diterapkan

Project ini menerapkan beberapa konsep utama PBO:

- **Encapsulation**
  - Atribut menggunakan `private`.
  - Akses data melalui getter dan setter.

- **Inheritance**
  - `JastipFashion`, `JastipSkincare`, dan `JastipElektronik` mewarisi `PesananJastip`.

- **Abstraction**
  - `PesananJastip` merupakan abstract class.
  - Method `getJenisPesanan()` dibuat abstract.

- **Polymorphism**
  - Subclass memberikan implementasi berbeda terhadap method parent.

- **Interface**
  - `BisaDivalidasi` digunakan untuk mendefinisikan kemampuan validasi.

- **Constructor**
  - Digunakan untuk membuat object dengan data awal.

- **Access Modifier**
  - Digunakan untuk mengatur hak akses atribut dan method.

---

# 53. Konsep Database yang Diterapkan

Project juga menerapkan konsep database:

- Primary Key.
- Foreign Key.
- Relasi antar tabel.
- Auto Increment.
- CRUD.
- PreparedStatement.
- DAO.
- Dummy Data.
- Database Connection.
- ORM menggunakan Hibernate.

---

# 54. Nilai Tambah Project

Nilai tambah pada project ini adalah penerapan:

```text
Hibernate ORM
```

Penerapan ORM dilakukan dengan:

- Menambahkan dependency Hibernate.
- Membuat `HibernateUtil`.
- Memberikan annotation `@Entity`.
- Memberikan annotation `@Table`.
- Menentukan primary key menggunakan `@Id`.
- Melakukan mapping kolom menggunakan `@Column`.
- Membuat constructor kosong untuk entity.
- Membuat DAO menggunakan Hibernate.
- Mengambil data menggunakan HQL.

---

# 55. Insight yang Didapat

Melalui pengembangan Mini Project 4, diperoleh beberapa pemahaman baru.

Pertama, integrasi database membuat program menjadi lebih nyata karena data tidak hanya tersimpan selama aplikasi berjalan. Data dapat disimpan di database dan digunakan kembali ketika program dijalankan.

Kedua, penggunaan DAO membantu memahami pentingnya pemisahan tanggung jawab. Controller tidak perlu mengetahui detail query SQL karena proses tersebut ditangani oleh DAO.

Ketiga, PreparedStatement menunjukkan bahwa query database sebaiknya dibuat dengan parameter agar lebih aman dan lebih mudah dikelola.

Keempat, penggunaan dummy data melalui file SQL membuat proses pengujian lebih praktis karena program dapat langsung membaca data ketika dijalankan.

Kelima, Hibernate ORM memberikan pemahaman mengenai cara object Java dapat dipetakan ke tabel database. Dengan ORM, hubungan antara class pada program dan tabel database dapat dibuat melalui annotation.

Terakhir, penggunaan JDBC dan Hibernate secara bersamaan memberikan pemahaman mengenai dua pendekatan akses database yang berbeda. JDBC memberikan kontrol yang lebih langsung terhadap SQL, sedangkan Hibernate membantu melakukan pemetaan object dan database.

---

# 56. Kesimpulan

Mini Project 4 merupakan pengembangan dari Sistem Jasa Titip Luar Negeri pada Mini Project 3 dengan menambahkan integrasi database menggunakan JDBC, PreparedStatement, dan DAO.

Program telah menggunakan database MySQL untuk menyimpan data pelanggan, barang, pembayaran, batch, pesanan, detail jenis pesanan, dan riwayat status.

Penerapan DAO membuat akses database menjadi lebih terorganisir, sedangkan PreparedStatement digunakan untuk menjalankan query dengan parameter.

Selain ketentuan utama tersebut, project juga menerapkan Hibernate ORM sebagai nilai tambah. Hibernate digunakan untuk melakukan mapping beberapa class Java menjadi entity yang terhubung dengan tabel database.

Dengan pengembangan ini, sistem tidak hanya menerapkan konsep dasar PBO seperti encapsulation, inheritance, abstraction, polymorphism, dan interface, tetapi juga menunjukkan bagaimana konsep tersebut dapat diterapkan pada aplikasi yang terintegrasi dengan database.

Project ini memberikan pemahaman bahwa pengembangan aplikasi tidak hanya berfokus pada pembuatan class dan method, tetapi juga pada bagaimana data dikelola, disimpan, diakses, dan dihubungkan dengan struktur program secara terorganisir.
