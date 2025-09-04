/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LENOVO
 */
abstract class KendaraanDarat extends Kendaraan{

    public KendaraanDarat(String Nama) {
        super(Nama);
    }
    
    abstract void JenisBahanBakar();
    
    void bahanbakar(){
        System.out.println(Nama +" Menngunakanan Bahan Bakar Bensin.");  
    }
    
    
}
