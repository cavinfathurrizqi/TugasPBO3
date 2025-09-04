# TugasPBO3
 Penerapan Abstrak Class, Overload  serta Override dan Implementasi pada Pemrograman Berorientasi  Obyek
# Abstrak Class
 Abstract class adalah jenis kelas dalam Java yang tidak bisa dibuat objeknya 
secara langsung. Di dalamnya biasanya terdapat satu atau lebih abstract method 
yaitu method yang hanya ditulis deklarasinya tanpa isi. Meski begitu, abstract class 
juga bisa memiliki atribut dan method yang sudah lengkap implementasinya.
# Perbedaan Abstrak Class dan Interface 
 Interface digunakan untuk menetapkan aturan atau perilaku yang harus dimiliki 
oleh kelas yang mengikutinya.Satu kelas bisa mengikuti banyak interface sekaligus, 
karena interface hanya berisi implementasi method tanpa isi. Ini berbeda dengan 
abstract class, di mana satu kelas hanya bisa mewarisi satu abstract class saja.
# Langkah-langkah Pembuatan Project dengan Abstrack Class dan Interface
 1. Buat Package bernama AbstrakdanInterface
 2. Buat Abstrak Class Kendaraan dengan atribut nama , konstruktor, method abstrak bergerak(), dan method info()
 3. Buat Buat class Kendaraan Darat yang extends Kendaraan dengan method abstrak JenisBahanBakar() dan method bahanbakar().
 4. Buat class motor yang extends Kendaraan Darat dengan method abstrak JenisMesin() dan method mesin()
 5. Buat Tiga Interface bernama Kegunaan, Perawatan dan Memodifikasi dengan Dua Method di dalam masing-masing interface
 6. Buat Concrete Class Harley Davidson yang extends Kendaraan Darat dan implementsi Kegunaan, Perawatan, Memodifikasi.
 7. Buat Main Class serta buat objek dan panggil semua method yang sudah dibuat
# Overload 
 Overload terjadi saat sebuah kelas punya beberapa metode dengan nama yang 
sama, tapi parameter yang berbeda baik dari segi jumlah maupun jenis tipe 
datanya. 
# Override 
 Override terjadi saat sebuah kelas turunan (subclass) menulis ulang metode 
yang sudah ada di kelas induknya (superclass). 
# Langkah-langkah Pembuatan Project dengan Overload dan Override
 1. Buat Package bernama OverloadOverride
 2. Buat Class Overload bernama Kota dengan beberapa method sama, tapi parameter berbeda
 3. Buat Class Override bernama Surabaya yang extends dengan Class Kota ambahkan method dengan nama dan parameter sama seperti di Kota, lalu gunakan @Override dan ubah isi method agar output berbeda
 4. Buat class MainClass, buat objek Kota dan Surabaya didalamnya dan panggil semua method untuk melihat perbedaan output antara overload dan override.
