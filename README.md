# Sistem Jasa Titip Belanja Luar Negeri

## Deskripsi Singkat Program
Sistem Jasa Titip Belanja Luar Negeri merupakan program sederhana berbasis Java yang dibuat untuk membantu mengelola data pesanan jasa titip barang dari luar negeri. Program ini dibuat sebagai penerapan dari konsep Pemrograman Berorientasi Objek (PBO) yang telah dipelajari. Pengguna dapat memasukkan data pesanan berupa ID pesanan, nama pelanggan, nama barang, negara asal, harga, dan jumlah barang.
Program ini memiliki fitur CRUD (Create, Read, Update, Delete) yang memungkinkan pengguna untuk menambahkan, melihat, mengubah, dan menghapus data pesanan. Data pesanan disimpan menggunakan ArrayList sehingga dapat menampung beberapa data pesanan selama program sedang dijalankan. Program juga menggunakan beberapa class yang memiliki fungsi berbeda agar program lebih terstruktur.

## Alur Program
Ketika program dijalankan, sistem akan menampilkan menu utama yang terdiri dari Tambah Pesanan, Lihat Pesanan, Ubah Pesanan, Hapus Pesanan, dan Keluar. Pengguna dapat memilih menu dengan memasukkan angka sesuai pilihan yang tersedia. Setelah pengguna melakukan suatu proses, sistem akan kembali menampilkan menu utama sehingga pengguna dapat melakukan proses lainnya.
- Pada menu **Tambah Pesanan**, pengguna diminta memasukkan data pesanan seperti ID pesanan, nama pelanggan, nama barang, negara asal, harga, dan jumlah barang. Data yang telah dimasukkan kemudian digunakan untuk membuat object dari class `PesananJastip` dan disimpan ke dalam ArrayList melalui class `KelolaPesanan`.
- Pada menu **Lihat Pesanan**, sistem akan memeriksa apakah terdapat data pesanan yang tersimpan. Jika terdapat data, sistem akan menampilkan seluruh pesanan menggunakan perulangan. Sistem juga menampilkan total harga yang diperoleh dari perkalian harga barang dengan jumlah barang.
- Pada menu **Ubah Pesanan**, pengguna memasukkan ID pesanan yang ingin diubah. Sistem akan mencari data berdasarkan ID tersebut. Jika pesanan ditemukan, pengguna dapat memasukkan data baru dan sistem akan memperbarui data menggunakan setter. Jika ID tidak ditemukan, sistem akan menampilkan pesan bahwa pesanan tidak ditemukan.
- Pada menu **Hapus Pesanan**, pengguna memasukkan ID pesanan yang ingin dihapus. Sistem akan mencari pesanan tersebut terlebih dahulu. Jika ditemukan, data akan dihapus dari ArrayList. Jika tidak ditemukan, sistem akan memberikan informasi bahwa pesanan tidak ditemukan.
Menu akan terus berjalan menggunakan perulangan `do-while`. Program hanya akan berhenti ketika pengguna memilih menu **Keluar**.

## Struktur Program
Program ini terdiri dari empat class yang memiliki fungsi berbeda: 
- Class `PesananJastip` berada pada package `Model` dan digunakan untuk menyimpan data pesanan. Class ini memiliki beberapa atribut seperti ID pesanan, nama pelanggan, nama barang, negara asal, harga, dan jumlah. Class ini juga memiliki constructor, getter, setter, serta method untuk menghitung total harga dan menampilkan data pesanan.
- Class `KelolaPesanan` berada pada package `Logic` dan digunakan untuk mengelola data pesanan. Class ini menggunakan `ArrayList<PesananJastip>` sebagai tempat penyimpanan data. Di dalam class ini terdapat method untuk menambah, menampilkan, mencari, mengubah, dan menghapus data pesanan sehingga proses CRUD dapat dilakukan.
- Class `ValidasiInput` berada pada package `Helper` dan digunakan untuk membantu proses input dari pengguna. Class ini menggunakan `Scanner` dan memiliki method untuk menerima input berupa String, Integer, dan Double. Validasi sederhana juga diterapkan untuk memastikan input teks tidak kosong dan input angka memiliki nilai lebih dari 0.
- Class `SistemJastip_Minpro1` merupakan class utama atau entry point program. Class ini berisi method `main()` yang menjadi awal program dijalankan. Di dalamnya terdapat menu utama, input pilihan pengguna, percabangan `switch`, serta perulangan `do-while` untuk menjalankan program sampai pengguna memilih menu Keluar.

## Penerapan Nilai Tambah
- Nilai tambah yang diterapkan pada program ini berupa penggunaan **access modifier**, **encapsulation**, dan **input validation**. Access modifier diterapkan dengan menggunakan `private` pada atribut di class `PesananJastip`. Dengan demikian, atribut tidak dapat diakses secara langsung dari class lain.
- Encapsulation diterapkan dengan menyediakan getter dan setter untuk mengakses serta mengubah data yang terdapat pada object `PesananJastip`. Contohnya adalah method `getIdPesanan()` untuk mengambil ID pesanan dan `setNamaBarang()` untuk mengubah nama barang. Penerapan ini membuat pengelolaan data menjadi lebih terstruktur.
- Input validation diterapkan melalui class `ValidasiInput`. Validasi digunakan untuk memastikan input String tidak kosong dan input berupa angka harus memiliki nilai lebih dari 0. Dengan adanya validasi tersebut, pengguna tidak dapat memasukkan data kosong atau angka yang tidak sesuai dengan kebutuhan program.

### Dokumentasi
#### 1. Access Modifier
Access modifier diterapkan dengan menggunakan `private` pada atribut di class `PesananJastip`. Penggunaan `private` membuat atribut tidak dapat diakses secara langsung dari class lain.
![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20150038.png?raw=true)

Berikut merupakan implementasi percobaan ketika class lain mencoba mengakses atribut yang memiliki access modifier `private` pada class `PesananJastip`:

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20152852.png?raw=true)

#### 2. Encapsulation
Encapsulation diterapkan dengan menggunakan getter dan setter pada class `PesananJastip`. Getter digunakan untuk mengambil data, sedangkan setter digunakan untuk mengubah data pesanan.
![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20150302.png?raw=true)
![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20150312.png?raw=true)

Berikut merupakan implementasi ketika class lain mencoba mengakses atribut yang memiliki access modifier `private` pada class `PesananJastip`. Atribut tersebut tidak dapat diakses secara langsung, sehingga digunakan method getter `getNamaPelanggan()` untuk mengakses data tersebut.

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20154354.png?raw=true) 

Saat program dijalankan, method getter berhasil mengambil nilai `namaPelanggan` dan menampilkan data `Sinta`.

#### 3. Input Validation
Input validation diterapkan pada class `ValidasiInput`. Validasi digunakan untuk memastikan input String tidak kosong dan input angka harus memiliki nilai lebih dari 0.

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20150451.png?raw=true)
![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20150514.png?raw=true)

Berikut merupakan implementasi validasi input saat program dijalankan. Sistem akan memeriksa input yang diberikan pengguna dan menampilkan pesan jika input tidak sesuai dengan ketentuan.

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20154544.png?raw=true)
![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20154730.png?raw=true)

Saat pengguna memasukkan input yang kosong atau nilai angka kurang dari atau sama dengan 0, sistem akan menampilkan pesan `Input tidak boleh kosong` atau `Input harus lebih dari 0`.



## Dokumentasi Program
### 1. Tampilan Menu Utama

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20133612.png?raw=true)

**Penjelasan:**  
- Tampilan menu utama merupakan tampilan awal ketika program dijalankan. Pada menu ini terdapat beberapa pilihan yang dapat digunakan untuk mengelola data pesanan, yaitu Tambah Pesanan, Lihat Pesanan, Ubah Pesanan, Hapus Pesanan, dan Keluar. Pengguna dapat memilih menu dengan memasukkan nomor sesuai pilihan yang tersedia.

### 2. Proses Tambah Pesanan

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20133752.png?raw=true)

**Penjelasan:**  
- Pada menu Tambah Pesanan, pengguna diminta memasukkan data pesanan yang terdiri dari ID pesanan, nama pelanggan, nama barang, negara asal, harga, dan jumlah barang. Data yang telah dimasukkan kemudian dibuat menjadi object `PesananJastip` dan disimpan ke dalam `ArrayList`.

### 3. Tampilan Data Pesanan

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20133806.png?raw=true)

**Penjelasan:**  
- Menu Lihat Pesanan digunakan untuk menampilkan seluruh data pesanan yang telah tersimpan. Data ditampilkan menggunakan perulangan sehingga semua pesanan yang ada di dalam ArrayList dapat ditampilkan. Sistem juga menampilkan total harga dari setiap pesanan berdasarkan harga barang dikalikan dengan jumlah barang.

### 4. Proses Ubah Pesanan

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20133956.png?raw=true)
![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20134008.png?raw=true)

**Penjelasan:**  
- Pada menu Ubah Pesanan, pengguna memasukkan ID pesanan yang ingin diubah. Sistem akan mencari pesanan berdasarkan ID tersebut. Jika pesanan ditemukan, pengguna dapat memasukkan data baru dan sistem akan memperbarui data pesanan menggunakan setter.

### 5. Proses Hapus Pesanan

![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20134030.png?raw=true)
![alt text](https://github.com/Sitinursinta04/PRAKTIKUM_PBO/blob/main/Dokumentasi/Screenshot%202026-09-06%20134040.png?raw=true)

**Penjelasan:**  
- Menu Hapus Pesanan digunakan untuk menghapus data pesanan yang sudah tersimpan. Pengguna memasukkan ID pesanan yang ingin dihapus, kemudian sistem akan mencari ID tersebut. Jika pesanan ditemukan, data akan dihapus dari ArrayList dan sistem menampilkan pesan bahwa pesanan berhasil dihapus.
