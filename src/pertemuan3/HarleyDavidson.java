/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LENOVO
 */
public class HarleyDavidson extends KendaraanDarat implements Kegunaan, Modifikasi, Perawatan{
 
    public HarleyDavidson(String Nama) {
        super(Nama);
        info();
    }

    
    void JenisMesin() {
       System.out.println(Nama + " Menggunakan Mesin V-Twin.");
    }

    
    void JenisBahanBakar() {
        System.out.println(Nama + " Menngunakanan Bahan Bakar Bensin.");
    }

   
    void bergerak() {
        System.out.println(Nama + " melaju di jalan raya dengan gaya cruiser.");

    }

    
    public void Fungsi(String fungsi) {
        System.out.println(Nama +" Biasanya digunakan Untuk  " + fungsi);
    }

    public void Komunitas(String Komunitas) {
        System.out.println(Nama + " Memiliki banyak Komunitas Seperti " + Komunitas);
    }

 
    public void Memodifikasi(String Modif) {
        System.out.println(Nama +" Dimodifikasi berbagai bentuk seprti " + Modif);
    }

    @Override
    public void Mengganti(String Ganti) {
        System.out.println(Nama + " Part yang sering di ganti adalah " + Ganti  );
    }

    @Override
    public void Menservice(String service) {
        System.out.println(Nama + "Harus rajin service untuk " + service);
    }

    @Override
    public void GantiOli(String Oli) {
        System.out.println(Nama + " Harus Diganti oli Setiap " + Oli);
    }
    
}
