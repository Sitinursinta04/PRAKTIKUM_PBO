# 🌌 Sistem Jasa Titip Luar Negeri — Mini Project 4

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

Project ini merupakan **lanjutan dari Mini Project 3**. Pada Mini Project 4, sistem yang sebelumnya berjalan dengan pengelolaan data di dalam program dikembangkan agar dapat terhubung dengan database MySQL menggunakan **JDBC, PreparedStatement, dan DAO**.

Selain itu, project ini juga menerapkan **Hibernate ORM sebagai nilai tambah**. JDBC tetap digunakan sebagai mekanisme utama pengelolaan data, sedangkan Hibernate digunakan sebagai implementasi tambahan untuk menunjukkan penggunaan framework ORM pada project.

Dengan adanya database, data pesanan tidak hanya tersimpan selama program berjalan, tetapi dapat disimpan secara permanen dan digunakan kembali ketika aplikasi dijalankan.

---

## 🎯 Tujuan Pengembangan

Pengembangan Mini Project 4 dilakukan untuk:

- Menghubungkan aplikasi Java dengan database MySQL.
- Menerapkan koneksi database menggunakan JDBC.
- Menerapkan `PreparedStatement` dalam proses query.
- Menerapkan pola **DAO (Data Access Object)** untuk memisahkan akses database dari logika program.
- Mengimplementasikan operasi **CRUD** pada data pesanan.
- Menyediakan dummy data awal melalui file `.sql`.
- Mempertahankan konsep OOP yang telah diterapkan pada Mini Project 3.
- Mengenal dan menerapkan **Hibernate ORM** sebagai nilai tambah.
- Memahami perbedaan pendekatan akses database menggunakan JDBC dan ORM.

---

# 🧩 Struktur Package

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
├── database
│   └── sistem_jastip.sql
│
└── pom.xml
```

Struktur package dipisahkan berdasarkan tanggung jawabnya agar kode lebih terorganisir. `Model` menangani representasi data dan konsep OOP, `View` menangani interaksi dengan pengguna, `Controller` mengatur proses sistem, sedangkan `DAO` bertanggung jawab terhadap akses data.

Pemisahan tersebut digunakan agar perubahan pada database tidak harus langsung memengaruhi bagian tampilan atau logika utama program. Dari struktur ini, terlihat bahwa sistem mulai menerapkan pemisahan tanggung jawab yang lebih jelas dibandingkan program yang seluruh prosesnya diletakkan dalam satu class.

---

# 🔄 Alur Program

Alur utama sistem dimulai ketika program dijalankan dan koneksi database dipersiapkan. Setelah itu, `PesananController` mengambil data pesanan dari database melalui `PesananDAOImpl`.

Data yang diperoleh kemudian ditampilkan melalui bagian `View`. Pengguna dapat memilih menu yang tersedia, seperti menampilkan, menambahkan, mengubah, menghapus pesanan, atau mengubah status pesanan.

Secara umum, prosesnya adalah:

- Program dijalankan melalui class `SistemJastip_Minpro4`.
- Sistem mempersiapkan koneksi database.
- `PesananController` meminta data kepada `PesananDAOImpl`.
- `PesananDAOImpl` menjalankan query menggunakan JDBC dan `PreparedStatement`.
- Data database diubah menjadi object `PesananJastip`.
- Data ditampilkan melalui `PesananView`.
- Pengguna memilih operasi yang ingin dilakukan.
- Controller meneruskan proses ke DAO.
- DAO menjalankan query ke database.
- Setelah proses berhasil, data dimuat kembali agar tampilan program sesuai dengan kondisi database terbaru.

Alur tersebut membuat program tidak hanya berfungsi sebagai aplikasi input data, tetapi sudah memiliki hubungan langsung antara **interface program, logika aplikasi, DAO, dan database**.

---

# 🔐 Penerapan Encapsulation

**Encapsulation** merupakan konsep OOP yang digunakan untuk membatasi akses langsung terhadap data yang dimiliki oleh sebuah object.

Pada project ini, encapsulation diterapkan pada class seperti `Pelanggan`, `Barang`, `Pembayaran`, `BatchJastip`, dan class pesanan dengan menggunakan atribut `private`.

Contoh pada class `Pelanggan`:

```java
private String idPelanggan;
private String namaPelanggan;
private String nomorTelepon;
```

Data tersebut tidak dapat diakses secara langsung dari luar class. Untuk membaca atau mengubah data, digunakan method seperti:

```java
public String getNamaPelanggan() {
    return namaPelanggan;
}

public void setNamaPelanggan(String namaPelanggan) {
    this.namaPelanggan = namaPelanggan;
}
```

Encapsulation digunakan agar data setiap object lebih terkontrol dan tidak dapat diubah sembarangan dari luar class.

Dalam pengembangan sistem, konsep ini juga membuat setiap class memiliki tanggung jawab yang lebih jelas. Misalnya, data pelanggan dikelola oleh object `Pelanggan`, sedangkan data barang dikelola oleh object `Barang`.

---

# 🧬 Penerapan Inheritance

**Inheritance** merupakan konsep OOP yang memungkinkan sebuah class mewarisi atribut dan method dari class lain.

Pada sistem ini, inheritance diterapkan pada jenis pesanan jasa titip.

Class induknya adalah:

```java
public abstract class PesananJastip {
    ...
}
```

Kemudian terdapat beberapa class turunan:

```text
PesananJastip
├── JastipFashion
├── JastipSkincare
└── JastipElektronik
```

Ketiga class tersebut memiliki karakteristik umum sebagai pesanan jasa titip, tetapi masing-masing memiliki detail yang berbeda.

Contohnya:

- `JastipFashion` memiliki ukuran dan warna.
- `JastipSkincare` memiliki jenis kulit dan ukuran produk.
- `JastipElektronik` memiliki merek dan informasi garansi.

Inheritance digunakan agar bagian data dan perilaku yang sama tidak perlu ditulis berulang kali pada setiap jenis pesanan. Class turunan cukup menambahkan karakteristik yang memang khusus untuk jenis pesanan tersebut.

Dengan demikian, struktur program menjadi lebih terorganisir dan mudah dikembangkan jika nantinya terdapat jenis jasa titip baru.

---

# 🎭 Penerapan Polymorphism

**Polymorphism** memungkinkan object dari class yang berbeda diperlakukan melalui tipe induk yang sama.

Pada project ini, polymorphism terlihat dari penggunaan `PesananJastip` sebagai class induk bagi:

```java
JastipFashion
JastipSkincare
JastipElektronik
```

Salah satu penerapannya adalah overriding method:

```java
@Override
public String getJenisPesanan() {
    return "Jastip Fashion";
}
```

Class lainnya dapat memberikan implementasi masing-masing terhadap method yang sama.

Dengan pendekatan tersebut, controller atau bagian program lainnya tidak harus membuat struktur berbeda untuk setiap jenis pesanan. Object tetap dapat diperlakukan sebagai `PesananJastip`, tetapi ketika method dijalankan, implementasi sesuai class sebenarnya akan digunakan.

Polymorphism membuat sistem lebih fleksibel karena penambahan jenis pesanan baru dapat dilakukan dengan membuat class turunan tanpa harus mengubah seluruh struktur program.

---

# 🧱 Penerapan Abstraction

**Abstraction** digunakan untuk menyembunyikan detail implementasi dan hanya menampilkan bagian yang memang dibutuhkan oleh bagian lain dari program.

Pada project ini, abstraction diterapkan melalui abstract class:

```java
public abstract class PesananJastip
```

Class tersebut menjadi dasar bagi berbagai jenis pesanan. Method tertentu dapat dibuat abstract sehingga setiap class turunan wajib menyediakan implementasinya sendiri.

Contohnya:

```java
public abstract String getJenisPesanan();
```

Dengan demikian, `PesananJastip` mendefinisikan konsep umum sebuah pesanan, sedangkan detail jenis pesanan diserahkan kepada class turunannya.

Penggunaan abstraction membuat struktur program lebih mudah dipahami karena class induk hanya berfokus pada karakteristik umum, sementara detail khusus ditangani oleh subclass masing-masing.

---

# 🔗 Penerapan Interface

Selain abstract class, Mini Project 3 yang dilanjutkan pada Mini Project 4 juga memiliki interface:

```java
public interface BisaDivalidasi {
    boolean validasiDetailPesanan();
}
```

Interface tersebut digunakan untuk memberikan kemampuan validasi kepada jenis pesanan.

Setiap jenis pesanan dapat memiliki aturan validasi yang berbeda. Misalnya:

- Fashion melakukan validasi ukuran dan warna.
- Skincare melakukan validasi jenis kulit dan ukuran produk.
- Elektronik melakukan validasi merek dan garansi.

Interface digunakan karena kebutuhan validasi tersebut memiliki tujuan yang sama, tetapi cara penerapannya dapat berbeda pada setiap jenis pesanan.

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

Relasi antar tabel digunakan agar data tidak semuanya disimpan dalam satu tabel. Contohnya, data pelanggan disimpan pada tabel `pelanggan`, sedangkan pesanan menyimpan `id_pelanggan` sebagai foreign key.

Pendekatan ini membuat data lebih terstruktur dan mengurangi pengulangan data yang tidak diperlukan.

---

# 🧪 Dummy Data

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

Data awal tersebut **tidak dimasukkan melalui kode Java**, tetapi melalui file SQL sesuai ketentuan tugas.

Penggunaan dummy data membuat proses pengujian menjadi lebih mudah karena ketika fitur Read dijalankan, sistem sudah memiliki data yang dapat langsung ditampilkan.

---

# 🔌 Penerapan JDBC

**JDBC (Java Database Connectivity)** digunakan sebagai penghubung antara aplikasi Java dengan database MySQL.

Koneksi database dibuat pada:

```text
Config/DatabaseConnection.java
```

Contoh konfigurasi koneksi:

```java
private static final String URL =
        "jdbc:mysql://localhost:3306/sistem_jastip";

private static final String USER = "root";

private static final String PASSWORD = "";
```

Koneksi dibuat menggunakan:

```java
DriverManager.getConnection(URL, USER, PASSWORD);
```

JDBC digunakan sebagai mekanisme utama akses database karena sesuai dengan ketentuan Mini Project 4 dan memberikan pemahaman langsung mengenai bagaimana aplikasi Java berkomunikasi dengan database.

Melalui penerapan ini, sistem tidak lagi hanya mengelola object di dalam memory, tetapi dapat menyimpan dan mengambil data secara langsung dari database MySQL.

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

Penggunaan `?` memungkinkan nilai diberikan melalui parameter tanpa harus menggabungkannya langsung ke dalam string SQL.

PreparedStatement dipilih agar query lebih terstruktur dan parameter data dipisahkan dari perintah SQL. Selain itu, pendekatan ini merupakan cara yang lebih aman dibandingkan menyusun query dengan penggabungan string secara langsung.

---

# 🗂️ Penerapan DAO

Pola **DAO (Data Access Object)** digunakan untuk memisahkan proses akses database dari bagian controller dan tampilan.

Interface DAO terdapat pada:

```text
DAO/PesananDAO.java
```

dengan operasi utama:

```java
List<PesananJastip> getAllPesanan()
boolean tambahPesanan(PesananJastip pesanan)
boolean ubahPesanan(PesananJastip pesanan)
boolean hapusPesanan(String idPesanan)
boolean ubahStatusPesanan(String idPesanan, String statusBaru)
```

Implementasinya terdapat pada:

```text
DAO/PesananDAOImpl.java
```

Dengan adanya DAO, `PesananController` tidak perlu berisi query SQL secara langsung. Controller cukup meminta DAO untuk melakukan operasi database.

Pemisahan ini membuat kode lebih rapi dan memudahkan pemeliharaan. Jika query database perlu diperbaiki, perubahan dapat difokuskan pada bagian DAO tanpa harus mengubah keseluruhan controller.

---

# 🔄 Penerapan CRUD

JDBC dan DAO digunakan untuk mendukung operasi CRUD pada data pesanan.

### ➕ Create

Digunakan untuk menambahkan data pesanan baru ke database.

```sql
INSERT INTO pesanan ...
```

### 📖 Read

Digunakan untuk mengambil data pesanan dari database.

Pada proses Read, beberapa tabel digabungkan menggunakan `JOIN` sehingga informasi seperti pelanggan, barang, pembayaran, batch, dan detail jenis pesanan dapat ditampilkan secara bersamaan.

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

CRUD diterapkan agar sistem dapat mengelola data secara lengkap, bukan hanya membaca data dari database.

---

# 🧭 Peran Controller

`PesananController` menjadi penghubung antara bagian `View`, `Model`, dan `DAO`.

Controller menerima tindakan dari pengguna melalui View, kemudian menentukan proses yang perlu dilakukan.

Contohnya ketika pengguna ingin melihat data pesanan:

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

Controller tidak menjalankan query SQL secara langsung. Proses database diserahkan kepada DAO.

Pembagian ini membuat setiap bagian program memiliki tugas yang lebih jelas dan membantu menjaga struktur aplikasi tetap teratur.

---

# 🧩 Penerapan Nilai Tambah — Hibernate ORM

Sebagai nilai tambah, project ini mengimplementasikan **Hibernate ORM**.

Hibernate digunakan untuk menunjukkan pendekatan ORM, yaitu memetakan object Java ke tabel database sehingga aplikasi dapat berinteraksi dengan database melalui object.

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

Hibernate digunakan sebagai **nilai tambah**, sehingga tidak menggantikan JDBC yang memang menjadi ketentuan utama Mini Project 4.

Dengan demikian, project ini memiliki dua pendekatan akses database:

- **JDBC** → digunakan sebagai mekanisme utama CRUD.
- **Hibernate ORM** → digunakan sebagai implementasi tambahan untuk menunjukkan penggunaan framework ORM.

Hal ini memberikan pemahaman bahwa pengelolaan database dapat dilakukan dengan pendekatan low-level seperti JDBC maupun dengan framework ORM seperti Hibernate.

---

# ⚙️ Konfigurasi Hibernate

Konfigurasi Hibernate terdapat pada:

```text
Config/HibernateUtil.java
```

Class tersebut bertanggung jawab untuk membuat `SessionFactory` dan mengatur koneksi Hibernate ke database.

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

Pengaturan tersebut digunakan karena struktur tabel sudah dibuat melalui file SQL. Dengan begitu, Hibernate hanya digunakan untuk berinteraksi dengan struktur database yang sudah tersedia.

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

Entity ditandai menggunakan annotation seperti:

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

Entity mapping digunakan agar Hibernate mengetahui hubungan antara object Java dengan tabel dan kolom yang terdapat di database.

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

Pada bagian ini, Hibernate digunakan untuk mengambil data `Pelanggan` menggunakan object dan entity mapping tanpa menulis query SQL `SELECT` secara langsung.

Penerapan ini menjadi contoh sederhana bagaimana ORM dapat mengurangi kebutuhan penulisan SQL manual untuk operasi tertentu.

Dari implementasi tersebut dapat dipahami bahwa ORM bekerja dengan menjembatani object Java dan tabel database, sehingga developer dapat bekerja lebih dekat dengan struktur object dalam program.

---

# 🧪 Pengujian Sistem

Pengujian dilakukan dengan menjalankan aplikasi dan memastikan proses database dapat berjalan sesuai fungsinya.

Beberapa bagian yang diperiksa:

- Koneksi aplikasi dengan database berhasil.
- Data dummy dari file SQL dapat ditampilkan.
- Fitur Read dapat mengambil data dari database.
- Data baru dapat ditambahkan melalui sistem.
- Data yang sudah ada dapat diubah.
- Data dapat dihapus.
- Status pesanan dapat diperbarui.
- Query dijalankan melalui `PreparedStatement`.
- DAO dapat menjalankan operasi database.
- Hibernate dapat membangun `SessionFactory`.
- Entity Hibernate dapat terhubung dengan tabel database.
- `PelangganHibernateDAO` dapat mengambil data menggunakan Hibernate.

### 📸 Dokumentasi Pengujian

Screenshot dapat ditambahkan pada bagian berikut:

```text
[SCREENSHOT 1]
Tampilan database sistem_jastip
```

```text
[SCREENSHOT 2]
Dummy data pada tabel pelanggan/pesanan
```

```text
[SCREENSHOT 3]
Program menampilkan data pesanan dari database
```

```text
[SCREENSHOT 4]
Proses CRUD
```

```text
[SCREENSHOT 5]
Implementasi Hibernate ORM
```

---

# 📁 Lokasi Penerapan Konsep

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

# 🛠️ Teknologi yang Digunakan

| Teknologi | Penggunaan |
|---|---|
| Java | Bahasa pemrograman utama |
| Maven | Pengelolaan project dan dependency |
| MySQL | Database |
| JDBC | Koneksi dan akses database utama |
| PreparedStatement | Eksekusi query dengan parameter |
| DAO | Pemisahan akses database |
| Hibernate ORM | Nilai tambah ORM |
| NetBeans | IDE pengembangan |
| Laragon / MySQL | Menjalankan database secara lokal |

---

# 📌 File Database

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

File SQL disertakan agar database dapat dibuat kembali dengan struktur yang sama ketika project dijalankan pada lingkungan lain.

---

# 📦 Dependency Utama

Project menggunakan Maven untuk mengelola dependency.

### MySQL Connector

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>9.4.0</version>
</dependency>
```

Digunakan agar aplikasi Java dapat berkomunikasi dengan MySQL melalui JDBC.

### Hibernate ORM

```xml
<dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>6.6.26.Final</version>
</dependency>
```

Digunakan untuk menerapkan Hibernate sebagai nilai tambah ORM pada project.

---

# 📚 Dokumentasi Project

Dokumentasi project mencakup:

- Struktur package.
- Penerapan konsep OOP.
- Koneksi JDBC.
- PreparedStatement.
- DAO.
- CRUD.
- Database dan dummy data.
- Implementasi Hibernate ORM.
- Entity mapping.
- Pengujian sistem.

Dokumentasi tersebut dibuat agar proses pengembangan Mini Project 4 dapat dipahami tidak hanya dari hasil program, tetapi juga dari konsep yang diterapkan di dalam kode.

---

# ✅ Kesimpulan

Mini Project 4 mengembangkan **Sistem Jasa Titip Luar Negeri** dari aplikasi berbasis object menjadi aplikasi yang telah terintegrasi dengan database MySQL.

Penggunaan **JDBC, PreparedStatement, dan DAO** memungkinkan aplikasi melakukan proses penyimpanan, pembacaan, perubahan, dan penghapusan data secara langsung pada database.

Konsep OOP dari Mini Project sebelumnya tetap dipertahankan melalui penerapan **encapsulation, inheritance, polymorphism, abstraction, dan interface**. Konsep tersebut tidak hanya digunakan sebagai teori, tetapi diterapkan langsung pada struktur class yang membangun sistem jasa titip.

Sebagai nilai tambah, project juga mengimplementasikan **Hibernate ORM** melalui `HibernateUtil`, entity mapping, dan `PelangganHibernateDAO`. Implementasi ini memberikan pengalaman menggunakan pendekatan ORM tanpa menghilangkan JDBC sebagai mekanisme utama yang diwajibkan pada Mini Project 4.

Secara keseluruhan, pengembangan ini memberikan pemahaman mengenai bagaimana sebuah aplikasi Java dapat menghubungkan konsep OOP dengan pengelolaan database secara terstruktur, mulai dari **Model → Controller → DAO → Database**, sekaligus mengenalkan alternatif pengelolaan database menggunakan ORM.

---

<p align="center">
  <b>🌌 Mini Project 4 — Sistem Jasa Titip Luar Negeri</b><br>
  <i>Java • JDBC • DAO • MySQL • Hibernate ORM</i>
</p>
