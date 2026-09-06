# Sistem Jasa Titip Belanja Luar Negeri

## Deskripsi Singkat Program
Sistem Jasa Titip Belanja Luar Negeri merupakan program sederhana berbasis Java yang dibuat untuk membantu mengelola data pesanan jasa titip barang dari luar negeri. Program ini dibuat sebagai penerapan dari konsep Pemrograman Berorientasi Objek (PBO) yang telah dipelajari. Pengguna dapat memasukkan data pesanan berupa ID pesanan, nama pelanggan, nama barang, negara asal, harga, dan jumlah barang.
Program ini memiliki fitur CRUD (Create, Read, Update, Delete) yang memungkinkan pengguna untuk menambahkan, melihat, mengubah, dan menghapus data pesanan. Data pesanan disimpan menggunakan ArrayList sehingga dapat menampung beberapa data pesanan selama program sedang dijalankan. Program juga menggunakan beberapa class yang memiliki fungsi berbeda agar program lebih terstruktur.

## Alur Program
Ketika program dijalankan, sistem akan menampilkan menu utama yang terdiri dari Tambah Pesanan, Lihat Pesanan, Ubah Pesanan, Hapus Pesanan, dan Keluar. Pengguna dapat memilih menu dengan memasukkan angka sesuai pilihan yang tersedia. Setelah pengguna melakukan suatu proses, sistem akan kembali menampilkan menu utama sehingga pengguna dapat melakukan proses lainnya.
Pada menu **Tambah Pesanan**, pengguna diminta memasukkan data pesanan seperti ID pesanan, nama pelanggan, nama barang, negara asal, harga, dan jumlah barang. Data yang telah dimasukkan kemudian digunakan untuk membuat object dari class `PesananJastip` dan disimpan ke dalam ArrayList melalui class `KelolaPesanan`.
Pada menu **Lihat Pesanan**, sistem akan memeriksa apakah terdapat data pesanan yang tersimpan. Jika terdapat data, sistem akan menampilkan seluruh pesanan menggunakan perulangan. Sistem juga menampilkan total harga yang diperoleh dari perkalian harga barang dengan jumlah barang.
Pada menu **Ubah Pesanan**, pengguna memasukkan ID pesanan yang ingin diubah. Sistem akan mencari data berdasarkan ID tersebut. Jika pesanan ditemukan, pengguna dapat memasukkan data baru dan sistem akan memperbarui data menggunakan setter. Jika ID tidak ditemukan, sistem akan menampilkan pesan bahwa pesanan tidak ditemukan.
Pada menu **Hapus Pesanan**, pengguna memasukkan ID pesanan yang ingin dihapus. Sistem akan mencari pesanan tersebut terlebih dahulu. Jika ditemukan, data akan dihapus dari ArrayList. Jika tidak ditemukan, sistem akan memberikan informasi bahwa pesanan tidak ditemukan.
Menu akan terus berjalan menggunakan perulangan `do-while`. Program hanya akan berhenti ketika pengguna memilih menu **Keluar**.

## Struktur Program
Program ini terdiri dari empat class yang memiliki fungsi berbeda. Class `PesananJastip` berada pada package `Model` dan digunakan untuk menyimpan data pesanan. Class ini memiliki beberapa atribut seperti ID pesanan, nama pelanggan, nama barang, negara asal, harga, dan jumlah. Class ini juga memiliki constructor, getter, setter, serta method untuk menghitung total harga dan menampilkan data pesanan.
Class `KelolaPesanan` berada pada package `Logic` dan digunakan untuk mengelola data pesanan. Class ini menggunakan `ArrayList<PesananJastip>` sebagai tempat penyimpanan data. Di dalam class ini terdapat method untuk menambah, menampilkan, mencari, mengubah, dan menghapus data pesanan sehingga proses CRUD dapat dilakukan.
Class `ValidasiInput` berada pada package `Helper` dan digunakan untuk membantu proses input dari pengguna. Class ini menggunakan `Scanner` dan memiliki method untuk menerima input berupa String, Integer, dan Double. Validasi sederhana juga diterapkan untuk memastikan input teks tidak kosong dan input angka memiliki nilai lebih dari 0.
Class `SistemJastip_Minpro1` merupakan class utama atau entry point program. Class ini berisi method `main()` yang menjadi awal program dijalankan. Di dalamnya terdapat menu utama, input pilihan pengguna, percabangan `switch`, serta perulangan `do-while` untuk menjalankan program sampai pengguna memilih menu Keluar.

## Penerapan Nilai Tambah
Nilai tambah yang diterapkan pada program ini berupa penggunaan **access modifier**, **encapsulation**, dan **input validation**. Access modifier diterapkan dengan menggunakan `private` pada atribut di class `PesananJastip`. Dengan demikian, atribut tidak dapat diakses secara langsung dari class lain.
Encapsulation diterapkan dengan menyediakan getter dan setter untuk mengakses serta mengubah data yang terdapat pada object `PesananJastip`. Contohnya adalah method `getIdPesanan()` untuk mengambil ID pesanan dan `setNamaBarang()` untuk mengubah nama barang. Penerapan ini membuat pengelolaan data menjadi lebih terstruktur.
Input validation diterapkan melalui class `ValidasiInput`. Validasi digunakan untuk memastikan input String tidak kosong dan input berupa angka harus memiliki nilai lebih dari 0. Dengan adanya validasi tersebut, pengguna tidak dapat memasukkan data kosong atau angka yang tidak sesuai dengan kebutuhan program.

## Konsep yang Digunakan
Program ini menerapkan beberapa konsep dasar Java dan PBO, yaitu class, object, attribute, constructor, method, access modifier, encapsulation, getter, setter, ArrayList, Scanner, percabangan `if-else`, `switch`, serta perulangan `for` dan `do-while`.

## Dokumentasi Program
### 1. Tampilan Menu Utama

![alt text](<img width="656" height="203" alt="Screenshot 2026-09-06 133612" src="https://github.com/user-attachments/assets/8957d9ae-4dfa-4f2c-8af6-1da2d5004b2a" />
?raw=true)

**Penjelasan:**  
- Tampilan menu utama merupakan tampilan awal ketika program dijalankan. Pada menu ini terdapat beberapa pilihan yang dapat digunakan untuk mengelola data pesanan, yaitu Tambah Pesanan, Lihat Pesanan, Ubah Pesanan, Hapus Pesanan, dan Keluar. Pengguna dapat memilih menu dengan memasukkan nomor sesuai pilihan yang tersedia.

### 2. Proses Tambah Pesanan

![alt text](<img width="758" height="215" alt="Screenshot 2026-09-06 133752" src="https://github.com/user-attachments/assets/81c4e1b5-9839-4afe-b1b7-86d14ddd11b1" />
?raw=true)

**Penjelasan:**  
- Pada menu Tambah Pesanan, pengguna diminta memasukkan data pesanan yang terdiri dari ID pesanan, nama pelanggan, nama barang, negara asal, harga, dan jumlah barang. Data yang telah dimasukkan kemudian dibuat menjadi object `PesananJastip` dan disimpan ke dalam `ArrayList`.

### 3. Tampilan Data Pesanan

![alt text](<img width="811" height="255" alt="Screenshot 2026-09-06 133806" src="https://github.com/user-attachments/assets/b6694db7-cd5a-475b-bf26-159a0eb21b3b" />
?raw=true)

**Penjelasan:**  
- Menu Lihat Pesanan digunakan untuk menampilkan seluruh data pesanan yang telah tersimpan. Data ditampilkan menggunakan perulangan sehingga semua pesanan yang ada di dalam ArrayList dapat ditampilkan. Sistem juga menampilkan total harga dari setiap pesanan berdasarkan harga barang dikalikan dengan jumlah barang.

### 4. Proses Ubah Pesanan

![alt text](<img width="750" height="232" alt="Screenshot 2026-09-06 133956" src="https://github.com/user-attachments/assets/67e034b6-0dc8-40b4-865a-fb2ea1cc8c56" />
?raw=true)
![alt text](<img width="652" height="270" alt="Screenshot 2026-09-06 134008" src="https://github.com/user-attachments/assets/036b4777-8af2-4754-9697-4b1d63461171" />
?raw=true)

**Penjelasan:**  
- Pada menu Ubah Pesanan, pengguna memasukkan ID pesanan yang ingin diubah. Sistem akan mencari pesanan berdasarkan ID tersebut. Jika pesanan ditemukan, pengguna dapat memasukkan data baru dan sistem akan memperbarui data pesanan menggunakan setter.

### 5. Proses Hapus Pesanan

![alt text](<img width="601" height="268" alt="Screenshot 2026-09-06 134030" src="https://github.com/user-attachments/assets/160a28c6-973a-4c36-92dc-970a794af2bf" />
?raw=true)
![alt text](<img width="777" height="217" alt="Screenshot 2026-09-06 134040" src="https://github.com/user-attachments/assets/96063a9e-00c8-494e-a1b8-32afae604267" />
?raw=true)

**Penjelasan:**  
- Menu Hapus Pesanan digunakan untuk menghapus data pesanan yang sudah tersimpan. Pengguna memasukkan ID pesanan yang ingin dihapus, kemudian sistem akan mencari ID tersebut. Jika pesanan ditemukan, data akan dihapus dari ArrayList dan sistem menampilkan pesan bahwa pesanan berhasil dihapus.
