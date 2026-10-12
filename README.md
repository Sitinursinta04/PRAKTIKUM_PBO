# 🌏 Sistem Jasa Titip Luar Negeri

> **Mini Project 4 — Pemrograman Berorientasi Objek (PBO)**  
> Pengembangan lanjutan dari **Mini Project 3** dengan integrasi database menggunakan **JDBC, PreparedStatement, DAO**, serta **Hibernate ORM sebagai nilai tambah**.

---

## 👤 Identitas Project

| Informasi | Keterangan |
|---|---|
| **Nama Project** | Sistem Jasa Titip Luar Negeri |
| **Mini Project** | 4 |
| **Mata Kuliah** | Pemrograman Berorientasi Objek (PBO) |
| **Bahasa** | Java |
| **Database** | MySQL |
| **Build Tool** | Maven |
| **IDE** | NetBeans |
| **Database Access** | JDBC + DAO |
| **Value-Add** | Hibernate ORM |

---

# 📖 1. Tentang Project

**Sistem Jasa Titip Luar Negeri** merupakan aplikasi berbasis Java yang digunakan untuk mengelola proses pemesanan jasa titip barang dari luar negeri.

Project ini merupakan pengembangan dari **Mini Project 3**. Pada Mini Project sebelumnya, sistem telah menerapkan berbagai konsep Pemrograman Berorientasi Objek seperti **encapsulation, inheritance, abstraction, polymorphism, interface, validasi, dan pengelompokan class berdasarkan tanggung jawabnya**.

Pada Mini Project 4, pengembangan difokuskan pada integrasi program dengan **database MySQL**. Data yang sebelumnya dikelola oleh program kemudian dikembangkan agar dapat disimpan secara permanen di database.

Integrasi tersebut dilakukan menggunakan:

- **JDBC** untuk menghubungkan Java dengan MySQL.
- **PreparedStatement** untuk menjalankan query dengan parameter.
- **DAO (Data Access Object)** untuk memisahkan proses akses database dari bagian program lainnya.
- **CRUD** untuk mengelola data pesanan.
- **Dummy data melalui file SQL** agar data dapat langsung ditampilkan ketika program dijalankan.

Sebagai nilai tambah, project ini juga menerapkan **Hibernate ORM**. Penerapan Hibernate digunakan untuk memahami pendekatan lain dalam menghubungkan object Java dengan tabel database melalui konsep **Object Relational Mapping**.

Dengan demikian, Mini Project 4 tidak hanya melanjutkan fitur dari Mini Project 3, tetapi juga memperlihatkan bagaimana konsep PBO dapat dikembangkan menjadi aplikasi yang sudah terhubung dengan database.

---

# 🎯 2. Tujuan Pengembangan

Pengembangan Mini Project 4 dilakukan dengan beberapa tujuan utama:

- Mengembangkan program Mini Project 3 agar dapat menyimpan data secara permanen.
- Menghubungkan aplikasi Java dengan database MySQL.
- Menerapkan JDBC sebagai mekanisme utama akses database.
- Menerapkan `PreparedStatement` dalam menjalankan query.
- Menerapkan pola DAO agar akses database tidak bercampur dengan logika program.
- Mengimplementasikan operasi CRUD pada data pesanan.
- Menyediakan dummy data awal melalui file `.sql`.
- Mempertahankan konsep PBO yang telah diterapkan pada Mini Project 3.
- Menerapkan Hibernate ORM sebagai nilai tambah.
- Memahami perbedaan pendekatan akses database menggunakan JDBC dan ORM.
- Membuat program yang lebih terstruktur dan lebih dekat dengan kebutuhan aplikasi nyata.

---

# ✨ 3. Fitur Sistem

Sistem Jasa Titip Luar Negeri memiliki beberapa fitur utama:

### 📦 Pengelolaan Pesanan

- Menambahkan pesanan.
- Menampilkan pesanan.
- Mengubah data pesanan.
- Menghapus pesanan.
- Mengubah status pesanan.
- Menampilkan struk pesanan.
- Menampilkan ringkasan pesanan.

### 🧳 Pengelolaan Batch

- Menampilkan informasi batch jasa titip.
- Mengelola informasi perjalanan atau batch jasa titip.

### 🔐 Validasi

- Validasi input pengguna.
- Validasi detail pesanan berdasarkan jenis barang.
- Validasi agar data yang dimasukkan sesuai dengan kebutuhan sistem.

### 🗄️ Database

- Penyimpanan data pelanggan.
- Penyimpanan data barang.
- Penyimpanan data pembayaran.
- Penyimpanan data batch.
- Penyimpanan data pesanan.
- Penyimpanan detail berdasarkan jenis pesanan.
- Penyimpanan riwayat status.

### 🚀 Nilai Tambah

- Hibernate ORM.
- Entity mapping.
- Hibernate Session.
- HQL.
- DAO berbasis Hibernate.

---

# 🧩 4. Struktur Project

```text
SistemJastip_Minpro4
│
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
├── Main
│   └── SistemJastip_Minpro4.java
│
└── database
    └── sistem_jastip.sql
```

Struktur tersebut dibuat untuk memisahkan tanggung jawab setiap bagian program.

| Package | Peran |
|---|---|
| `Model` | Menyimpan data dan aturan objek |
| `View` | Mengatur tampilan dan input pengguna |
| `Controller` | Mengatur jalannya proses sistem |
| `DAO` | Menangani akses data |
| `Config` | Menangani konfigurasi database dan Hibernate |
| `Main` | Menjadi titik awal program |
| `database` | Menyimpan file SQL database |

Pemisahan tersebut membuat kode lebih mudah dibaca, diuji, dan dikembangkan karena setiap bagian tidak menangani terlalu banyak tanggung jawab sekaligus.

---

# 🏗️ 5. Arsitektur Program

Project menggunakan pendekatan **Model–View–Controller (MVC)** yang kemudian dilengkapi dengan DAO untuk kebutuhan database.

Secara sederhana, tanggung jawabnya adalah:

**View → Controller → Model / DAO → Database**

View berinteraksi langsung dengan pengguna.

Controller mengatur proses yang diminta pengguna.

Model menangani object dan aturan data.

DAO menangani komunikasi dengan database.

Database menjadi tempat penyimpanan data secara permanen.

Pembagian tersebut penting karena ketika proses database berubah, bagian View tidak harus ikut berubah. Begitu juga ketika tampilan program diubah, query database tidak perlu ditempatkan ulang pada View.

---

# 🧠 6. Penerapan Konsep PBO

## 6.1 Encapsulation

Encapsulation diterapkan dengan menyembunyikan atribut class menggunakan access modifier `private`.

Contohnya:

```java
private String idPelanggan;
private String namaPelanggan;
private String nomorTelepon;
```

Atribut tersebut tidak diakses secara langsung dari luar class. Pengaksesan data dilakukan melalui getter dan setter.

Contoh:

```java
public String getNamaPelanggan() {
    return namaPelanggan;
}

public void setNamaPelanggan(String namaPelanggan) {
    this.namaPelanggan = namaPelanggan;
}
```

### Mengapa digunakan?

Encapsulation digunakan agar data dalam object tidak dapat diubah secara sembarangan dari luar class.

### Manfaatnya dalam sistem

Dengan encapsulation, setiap perubahan terhadap data dapat dikontrol melalui method yang disediakan oleh class.

Hal ini membuat object lebih aman dan struktur program menjadi lebih teratur.

---

## 6.2 Inheritance

Inheritance digunakan pada jenis pesanan.

Strukturnya:

```text
PesananJastip
├── JastipFashion
├── JastipSkincare
└── JastipElektronik
```

`PesananJastip` menjadi parent class yang menyimpan informasi dan perilaku umum sebuah pesanan.

Kemudian setiap subclass memiliki detail yang lebih spesifik.

Contohnya:

- Fashion memiliki ukuran dan warna.
- Skincare memiliki jenis kulit dan ukuran produk.
- Elektronik memiliki merek dan informasi garansi.

### Mengapa digunakan?

Ketiga jenis pesanan tersebut sama-sama merupakan pesanan jasa titip, tetapi memiliki karakteristik yang berbeda.

Inheritance membuat bagian yang sama cukup dibuat pada parent class dan dapat digunakan kembali oleh subclass.

### Manfaatnya dalam sistem

- Mengurangi pengulangan kode.
- Memudahkan pengembangan jenis pesanan baru.
- Membuat hubungan antar-object lebih jelas.
- Mendukung penerapan polymorphism.

---

# 🎭 7. Abstraction

Abstraction diterapkan melalui `PesananJastip` yang merupakan abstract class.

Salah satu method abstrak yang digunakan adalah:

```java
public abstract String getJenisPesanan();
```

Method tersebut tidak menentukan hasil secara langsung pada parent class.

Implementasinya ditentukan oleh subclass.

Dengan demikian, `PesananJastip` hanya menentukan bahwa setiap jenis pesanan harus memiliki informasi mengenai jenis pesanan tersebut, sedangkan detail implementasinya diserahkan kepada subclass.

### Insight dari penerapan abstraction

Dari konsep ini dapat dipahami bahwa tidak semua detail harus diketahui oleh bagian program yang menggunakan object.

Program cukup mengetahui bahwa object tersebut merupakan `PesananJastip`, sementara detail jenisnya ditentukan oleh subclass yang digunakan.

---

# 🔄 8. Polymorphism

Polymorphism diterapkan ketika object dari subclass dapat digunakan melalui referensi parent class.

Contohnya:

```java
PesananJastip pesanan;

pesanan = new JastipFashion();
```

Referensi tersebut tetap bertipe `PesananJastip`, tetapi object sebenarnya adalah `JastipFashion`.

Ketika method yang dioverride dipanggil, implementasi milik subclass yang digunakan.

Hal tersebut membuat program dapat menangani berbagai jenis pesanan melalui struktur yang sama.

### Manfaat

Polymorphism membuat Controller dan bagian lain dari sistem tidak harus membuat logika yang sepenuhnya berbeda untuk setiap jenis pesanan.

Program cukup bekerja berdasarkan perilaku umum `PesananJastip`, sedangkan detailnya disesuaikan oleh masing-masing subclass.

---

# 🔌 9. Interface `BisaDivalidasi`

Project juga menggunakan interface:

```java
public interface BisaDivalidasi {
    boolean validasiDetailPesanan();
}
```

Interface tersebut digunakan untuk mendefinisikan kemampuan validasi detail pesanan.

Setiap jenis pesanan dapat memiliki cara validasi yang berbeda.

Contohnya:

### Jastip Fashion

Memvalidasi:

- Ukuran.
- Warna.

### Jastip Skincare

Memvalidasi:

- Jenis kulit.
- Ukuran produk.

### Jastip Elektronik

Memvalidasi:

- Merek.
- Garansi.

Penggunaan interface menunjukkan bahwa class yang berbeda dapat memiliki kemampuan yang sama tanpa harus mempunyai implementasi yang sama.

---

# 📦 10. Pembagian Tanggung Jawab Class

## `PesananJastip`

Menjadi dasar dari seluruh jenis pesanan.

Class ini menangani hal-hal umum seperti:

- Identitas pesanan.
- Informasi pelanggan.
- Informasi barang.
- Jumlah barang.
- Status pesanan.
- Riwayat status.
- Perhitungan total.
- Request khusus.
- Informasi jenis pesanan.

---

## `JastipFashion`

Menangani detail khusus pesanan fashion seperti:

- Ukuran.
- Warna.

---

## `JastipSkincare`

Menangani detail khusus pesanan skincare seperti:

- Jenis kulit.
- Ukuran produk.

---

## `JastipElektronik`

Menangani detail khusus pesanan elektronik seperti:

- Merek.
- Garansi.

---

## `Barang`

Menyimpan informasi barang:

- ID barang.
- Nama barang.
- Negara asal.
- Harga.
- Berat.

---

## `Pelanggan`

Menyimpan informasi pelanggan:

- ID pelanggan.
- Nama pelanggan.
- Nomor telepon.

---

## `Pembayaran`

Menyimpan informasi metode pembayaran.

---

## `BatchJastip`

Menyimpan informasi batch jasa titip seperti:

- Negara tujuan.
- Tanggal buka.
- Batas order.
- Tanggal berangkat.
- Status batch.

---

# 🗄️ 11. Perancangan Database

Database yang digunakan adalah:

```text
sistem_jastip
```

Database terdiri dari:

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

Struktur database dibuat untuk memisahkan data berdasarkan tanggung jawabnya.

Contohnya, data pelanggan tidak disimpan langsung sebagai kumpulan informasi di tabel `pesanan`. Tabel `pesanan` cukup menyimpan hubungan dengan pelanggan melalui `id_pelanggan`.

Pendekatan tersebut membuat data lebih terstruktur dan mengurangi pengulangan data.

---

# 🔗 12. Relasi Antar Data

Tabel `pesanan` menjadi salah satu tabel utama karena berhubungan dengan beberapa data lainnya.

Pesanan memiliki hubungan dengan:

- `pelanggan`
- `barang`
- `pembayaran`
- `batch_jastip`

Sedangkan detail pesanan dipisahkan ke dalam:

- `detail_fashion`
- `detail_skincare`
- `detail_elektronik`

Riwayat perubahan status disimpan pada:

- `riwayat_status`

Pemisahan ini menyesuaikan struktur object pada program sehingga data umum dan data khusus dapat dikelola dengan lebih jelas.

---

# 📝 13. File SQL dan Dummy Data

File database berada pada:

```text
database/sistem_jastip.sql
```

File tersebut digunakan untuk:

- Membuat database.
- Membuat tabel.
- Membuat primary key.
- Membuat foreign key.
- Memasukkan dummy data.

Dummy data dimasukkan langsung melalui SQL, bukan melalui kode Java.

Contoh data awal:

```text
P001 - Alya Putri
P002 - Raka Pratama

Dress Korea
Skincare Serum

PJ001
PJ002
```

### Mengapa dummy data diperlukan?

Ketentuan Mini Project 4 mengharuskan data awal tersedia agar fitur Read dapat langsung menampilkan data ketika program dijalankan.

Hal tersebut juga mempermudah proses pengujian karena tidak perlu memasukkan data secara manual terlebih dahulu.

---

# 🔌 14. Integrasi JDBC

JDBC menjadi bagian utama integrasi database pada project.

JDBC digunakan untuk:

- Membuka koneksi.
- Menjalankan query.
- Mengambil data.
- Menambahkan data.
- Mengubah data.
- Menghapus data.

Dependency MySQL Connector yang digunakan:

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>9.4.0</version>
</dependency>
```

---

# 🔐 15. PreparedStatement

Project menggunakan `PreparedStatement` ketika menjalankan query database.

Contohnya:

```java
String sql = "DELETE FROM pesanan WHERE id_pesanan = ?";

PreparedStatement ps = connection.prepareStatement(sql);

ps.setString(1, idPesanan);

ps.executeUpdate();
```

PreparedStatement digunakan karena query dan data yang dimasukkan sebagai parameter dapat dipisahkan.

### Apa yang dipahami dari penerapannya?

Sebelumnya query SQL dapat terlihat sebagai sekadar perintah untuk mengambil atau mengubah data.

Setelah menerapkan PreparedStatement, dapat dipahami bahwa cara query dijalankan juga penting, terutama ketika query menerima input dari pengguna.

---

# 🧱 16. DAO — Data Access Object

DAO digunakan sebagai lapisan yang bertanggung jawab terhadap akses database.

Project memiliki:

```text
PesananDAO.java
PesananDAOImpl.java
```

`PesananDAO` mendefinisikan operasi yang dapat dilakukan.

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

Sedangkan `PesananDAOImpl` berisi implementasi sebenarnya menggunakan JDBC.

---

# 🔄 17. CRUD

CRUD yang diterapkan:

| Operasi | Implementasi |
|---|---|
| **Create** | Menambahkan pesanan |
| **Read** | Menampilkan pesanan |
| **Update** | Mengubah data/status |
| **Delete** | Menghapus pesanan |

CRUD membuat sistem tidak hanya dapat menampilkan data, tetapi juga dapat mengelola perubahan data secara langsung pada database.

---

# 🎮 18. Peran Controller

`PesananController` menjadi penghubung antara tampilan, object, dan DAO.

Controller tidak menangani query SQL secara langsung.

Sebagai contoh, ketika pengguna meminta data pesanan:

```text
User
↓
View
↓
Controller
↓
DAO
↓
Database
```

Controller cukup meminta DAO mengambil data.

Dengan pemisahan tersebut, kode menjadi lebih mudah dipahami karena setiap class mempunyai tanggung jawab yang berbeda.

---

# 🚀 19. Hibernate ORM — Nilai Tambah

Selain JDBC, project menerapkan **Hibernate ORM** sebagai nilai tambah.

ORM atau **Object Relational Mapping** merupakan pendekatan yang menghubungkan object pada program dengan tabel dalam database.

Pada project ini beberapa class Model diberikan annotation Hibernate seperti:

```java
@Entity
@Table(name = "pelanggan")
```

Dengan annotation tersebut, Hibernate dapat mengetahui bahwa class `Pelanggan` berhubungan dengan tabel `pelanggan`.

---

# ⚙️ 20. Dependency Hibernate

Hibernate ditambahkan melalui Maven:

```xml
<dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>6.6.26.Final</version>
</dependency>
```

Hibernate digunakan sebagai **nilai tambah**, sehingga JDBC tetap digunakan sebagai pendekatan utama sesuai ketentuan Mini Project 4.

---

# 🛠️ 21. HibernateUtil

`HibernateUtil` digunakan untuk membangun `SessionFactory`.

Entity yang didaftarkan:

```java
configuration.addAnnotatedClass(Pelanggan.class);
configuration.addAnnotatedClass(Barang.class);
configuration.addAnnotatedClass(Pembayaran.class);
configuration.addAnnotatedClass(BatchJastip.class);
```

Hibernate dikonfigurasi agar terhubung dengan database:

```text
sistem_jastip
```

dan menggunakan:

```text
com.mysql.cj.jdbc.Driver
```

Konfigurasi:

```text
hibernate.hbm2ddl.auto = none
```

digunakan agar Hibernate tidak membuat atau mengubah struktur tabel yang sudah dibuat melalui file SQL.

---

# 🏷️ 22. Entity Mapping

Entity yang digunakan:

```text
Pelanggan
Barang
Pembayaran
BatchJastip
```

Contoh:

```java
@Entity
@Table(name = "pelanggan")
public class Pelanggan {
    ...
}
```

Primary key ditandai dengan:

```java
@Id
```

Sedangkan mapping nama kolom menggunakan:

```java
@Column(name = "nama_pelanggan")
```

Dengan mapping tersebut, Hibernate dapat mengetahui hubungan antara property object Java dengan kolom tabel database.

---

# 🔎 23. Hibernate DAO

Project memiliki:

```text
DAO/PelangganHibernateDAO.java
```

DAO tersebut digunakan untuk mengambil data pelanggan melalui Hibernate.

Contoh query:

```java
session.createQuery(
    "FROM Pelanggan",
    Pelanggan.class
).getResultList();
```

Query tersebut menggunakan nama entity `Pelanggan`.

Hal ini menunjukkan perbedaan antara JDBC dan Hibernate.

Pada JDBC, query SQL ditulis berdasarkan tabel database.

Pada Hibernate, query dapat ditulis berdasarkan entity yang digunakan oleh program.

---

# ⚖️ 24. JDBC vs Hibernate

| JDBC | Hibernate |
|---|---|
| Menggunakan SQL secara langsung | Menggunakan object/entity |
| Menggunakan `PreparedStatement` | Menggunakan `Session` dan Query |
| Kontrol query lebih langsung | Mapping object lebih terstruktur |
| Harus mengatur hasil query secara manual | Hibernate membantu proses mapping |
| Menjadi ketentuan utama | Menjadi nilai tambah |

Penggunaan keduanya memberikan pengalaman yang berbeda.

JDBC membantu memahami bagaimana aplikasi berkomunikasi langsung dengan database, sedangkan Hibernate memperkenalkan cara menghubungkan object Java dengan database menggunakan ORM.

---

# 📸 25. Dokumentasi Program

Bagian dokumentasi digunakan untuk menunjukkan hasil implementasi program secara langsung.

> **Catatan:** Simpan seluruh screenshot pada folder `docs/` atau `screenshots/`, kemudian sesuaikan nama file pada bagian berikut dengan screenshot yang sudah diambil.

---

## 📌 25.1 Struktur Project

Menampilkan struktur package dan class pada project Mini Project 4.

```markdown
![Struktur Project](docs/01-struktur-project.png)
```

**Keterangan:**  
Screenshot ini menunjukkan pembagian package `Model`, `View`, `Controller`, `DAO`, `Config`, dan `Main` yang digunakan dalam project.

---

## 📌 25.2 Menu Utama

```markdown
![Menu Utama](docs/02-menu-utama.png)
```

**Keterangan:**  
Menampilkan menu utama yang digunakan sebagai pusat navigasi pengguna dalam sistem.

---

## 📌 25.3 Data Dummy Saat Read

```markdown
![Data Dummy](docs/03-read-data.png)
```

**Keterangan:**  
Menampilkan data awal yang berasal dari database. Data dapat langsung ditampilkan ketika program dijalankan karena dummy data telah dimasukkan melalui file SQL.

---

## 📌 25.4 Tambah Pesanan

```markdown
![Tambah Pesanan](docs/04-tambah-pesanan.png)
```

**Keterangan:**  
Menampilkan proses penambahan pesanan baru melalui program. Data yang dimasukkan kemudian diproses oleh Controller dan DAO sebelum disimpan ke database.

---

## 📌 25.5 Ubah Pesanan

```markdown
![Ubah Pesanan](docs/05-ubah-pesanan.png)
```

**Keterangan:**  
Menampilkan proses perubahan data pesanan yang sudah tersimpan.

---

## 📌 25.6 Hapus Pesanan

```markdown
![Hapus Pesanan](docs/06-hapus-pesanan.png)
```

**Keterangan:**  
Menampilkan proses penghapusan data pesanan dari sistem dan database.

---

## 📌 25.7 Perubahan Status

```markdown
![Ubah Status](docs/07-ubah-status.png)
```

**Keterangan:**  
Menampilkan proses perubahan status pesanan yang digunakan untuk menunjukkan perkembangan pesanan.

---

## 📌 25.8 Struk atau Ringkasan Pesanan

```markdown
![Struk Pesanan](docs/08-struk-pesanan.png)
```

**Keterangan:**  
Menampilkan hasil informasi pesanan setelah data berhasil diproses oleh sistem.

---

## 📌 25.9 Database MySQL

```markdown
![Database MySQL](docs/09-database.png)
```

**Keterangan:**  
Menampilkan database `sistem_jastip` beserta tabel yang digunakan dalam sistem.

---

## 📌 25.10 Dummy Data pada Database

```markdown
![Dummy Data](docs/10-dummy-data.png)
```

**Keterangan:**  
Menampilkan data awal yang dimasukkan melalui file `sistem_jastip.sql`.

---

## 📌 25.11 Implementasi Hibernate

```markdown
![Hibernate ORM](docs/11-hibernate.png)
```

**Keterangan:**  
Menampilkan bagian project yang menerapkan Hibernate ORM, seperti entity, konfigurasi Hibernate, atau proses pengambilan data menggunakan Hibernate.

---

# 🧪 26. Hasil Implementasi

Setelah seluruh bagian dikembangkan, program telah berhasil:

- Terhubung dengan database MySQL.
- Membaca dummy data dari database.
- Menambahkan data pesanan.
- Mengubah data pesanan.
- Menghapus data pesanan.
- Mengubah status pesanan.
- Menyimpan perubahan data ke database.
- Menggunakan PreparedStatement.
- Menggunakan DAO.
- Mempertahankan konsep PBO dari Mini Project 3.
- Menerapkan Hibernate ORM sebagai nilai tambah.

Hal yang penting dari hasil tersebut adalah data tidak lagi hanya bergantung pada object yang berada di memory selama program berjalan.

Ketika program dihentikan, data yang sudah tersimpan di database tetap dapat digunakan kembali pada saat program dijalankan berikutnya.

---

# 💡 27. Insight dan Pembelajaran

## 27.1 Dari Program Berbasis Object ke Program Terintegrasi Database

Salah satu perubahan terbesar pada Mini Project 4 adalah cara melihat data.

Pada program sebelumnya, object merupakan pusat pengelolaan data selama program berjalan.

Setelah database diterapkan, data memiliki tempat penyimpanan permanen.

Dari sini dipahami bahwa sebuah aplikasi tidak cukup hanya memiliki object dan method. Aplikasi juga membutuhkan mekanisme untuk menjaga data agar tetap tersedia ketika program ditutup.

---

## 27.2 Memahami Mengapa DAO Dibutuhkan

Sebelum menggunakan DAO, proses akses database dapat dengan mudah tercampur dengan logika program.

Setelah menggunakan DAO, tanggung jawab tersebut dapat dipisahkan.

Controller tidak perlu mengetahui detail:

- bagaimana koneksi dibuat;
- bagaimana query ditulis;
- bagaimana PreparedStatement digunakan;
- bagaimana hasil query diproses.

Controller cukup meminta DAO melakukan operasi yang dibutuhkan.

Hal ini memberikan pemahaman bahwa **pemisahan tanggung jawab bukan hanya untuk membuat kode terlihat rapi, tetapi juga untuk membuat program lebih mudah dikembangkan dan diperbaiki.**

---

## 27.3 Memahami Peran PreparedStatement

Penerapan PreparedStatement memberikan pemahaman bahwa keamanan dan struktur query juga menjadi bagian penting dalam pengembangan aplikasi.

Input pengguna tidak langsung ditempelkan ke query SQL.

Parameter diberikan melalui method seperti:

```java
ps.setString(...)
ps.setInt(...)
```

Dari sini dapat dipahami bahwa akses database perlu dirancang dengan memperhatikan bagaimana data pengguna diproses sebelum dikirim ke database.

---

## 27.4 Memahami Hubungan PBO dengan Database

Pada awalnya konsep PBO seperti inheritance, abstraction, dan polymorphism dapat terlihat hanya sebagai konsep untuk membuat class.

Setelah project diintegrasikan dengan database, konsep tersebut menjadi lebih terasa manfaatnya.

Object pada Java dapat merepresentasikan data dalam sistem, sedangkan database menyimpan data tersebut secara permanen.

Dengan demikian, Model pada program tidak berdiri sendiri, tetapi menjadi bagian dari sistem yang lebih besar.

---

## 27.5 Memahami Perbedaan JDBC dan ORM

Penerapan JDBC dan Hibernate memberikan pengalaman bahwa satu kebutuhan dapat memiliki pendekatan teknis yang berbeda.

JDBC memberikan kontrol yang lebih langsung terhadap SQL.

Hibernate memberikan pendekatan melalui object dan entity.

Dari sini dapat dipahami bahwa penggunaan teknologi tidak hanya tentang memilih mana yang lebih mudah, tetapi juga memahami **kapan dan mengapa suatu pendekatan digunakan**.

Dalam project ini JDBC tetap dipertahankan karena merupakan ketentuan utama, sedangkan Hibernate digunakan sebagai nilai tambah untuk memperluas pemahaman mengenai ORM.

---

## 27.6 Memahami Pentingnya Mapping

Ketika menggunakan Hibernate, class Java harus diberi informasi mengenai tabel dan kolom yang sesuai.

Contohnya:

```java
@Entity
@Table(name = "pelanggan")
```

dan:

```java
@Column(name = "nama_pelanggan")
```

Dari proses tersebut dapat dipahami bahwa object Java dan tabel database sebenarnya memiliki struktur yang berbeda.

ORM membantu menjembatani dua struktur tersebut agar dapat bekerja bersama.

---

## 27.7 Memahami Pentingnya Struktur Program

Dengan semakin banyaknya fitur, program akan menjadi sulit dikelola jika seluruh proses ditulis dalam satu class.

Pembagian:

```text
Model
View
Controller
DAO
Config
```

membantu membuat tanggung jawab setiap bagian menjadi lebih jelas.

Insight yang diperoleh adalah bahwa **struktur program menjadi semakin penting ketika ukuran dan kompleksitas sistem bertambah.**

---

## 27.8 Memahami Database sebagai Bagian dari Sistem

Database bukan hanya tempat untuk menyimpan data.

Database juga menjadi bagian dari alur kerja aplikasi.

Program harus memahami:

- bagaimana data dibuat;
- bagaimana data diambil;
- bagaimana data diubah;
- bagaimana data dihapus;
- bagaimana hubungan antar data dijaga;
- bagaimana object Java berhubungan dengan data tersebut.

Hal tersebut membuat pengembangan Mini Project 4 memberikan pemahaman yang lebih luas dibandingkan hanya membuat program Java tanpa database.

---

# 🌱 28. Pengembangan yang Dapat Dilanjutkan

Project masih dapat dikembangkan lebih lanjut, misalnya:

- Menambahkan autentikasi pengguna.
- Menambahkan role admin dan pelanggan.
- Menambahkan pencarian pesanan.
- Menambahkan filter berdasarkan status.
- Mengembangkan pengelolaan batch secara lebih lengkap.
- Menggunakan relasi entity Hibernate secara lebih mendalam.
- Mengembangkan fitur laporan.
- Menambahkan GUI.
- Menambahkan validasi database yang lebih lengkap.

Pengembangan tersebut dapat dilakukan tanpa harus mengubah keseluruhan sistem karena struktur program sudah dipisahkan berdasarkan tanggung jawabnya.

---

# 🏁 29. Kesimpulan

Mini Project 4 berhasil mengembangkan **Sistem Jasa Titip Luar Negeri** dari program berbasis object menjadi program yang telah terintegrasi dengan database MySQL.

Pengembangan dilakukan menggunakan **JDBC, PreparedStatement, DAO, dan CRUD**, sementara dummy data disediakan melalui file SQL sesuai dengan ketentuan project.

Konsep PBO dari Mini Project 3 tetap dipertahankan, yaitu:

- Encapsulation.
- Inheritance.
- Abstraction.
- Polymorphism.
- Interface.

Sebagai nilai tambah, project juga menerapkan **Hibernate ORM** melalui entity, `HibernateUtil`, dan DAO berbasis Hibernate.

Hal utama yang diperoleh dari project ini bukan hanya kemampuan menghubungkan Java dengan database, tetapi juga pemahaman mengenai bagaimana **struktur program, konsep PBO, database, dan pola akses data dapat bekerja sebagai satu kesatuan dalam sebuah aplikasi**.

Dengan adanya pemisahan antara Model, View, Controller, DAO, dan Config, sistem menjadi lebih terstruktur dan memiliki dasar yang lebih baik untuk dikembangkan pada tahap berikutnya.
```
