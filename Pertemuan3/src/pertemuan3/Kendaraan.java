/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LENOVO
 */
abstract class Kendaraan  {
    String Nama;

    public Kendaraan(String Nama) {
        this.Nama = Nama;
    }
    abstract void bergerak();
    void info() {
        System.out.println("Nama kendaraan: " + Nama);
    }
}





    
