/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LENOVO
 */
public class Mainclass {
    public static void main(String[] args) {
        HarleyDavidson harley = new HarleyDavidson("Harley Davidson");
        System.out.println("INFO KENDARAAN");
        harley.bergerak();
        harley.JenisBahanBakar();
        harley.JenisMesin();
        
        System.out.println("FUNGSI DAN PERAWATAN");
        harley.Menservice("Permesinan");
        harley.Fungsi("Touring atau Sunmori");
        harley.GantiOli("8000 Km");
        
        System.out.println("PERMODIFIKASIAN");
        harley.Memodifikasi("Chopper atau Scrambler ");
        harley.Mengganti("Knalpot");
       harley.Komunitas("Satu Darah");
    }
}
