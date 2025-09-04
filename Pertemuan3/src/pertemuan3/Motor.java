/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LENOVO
 */
abstract class Motor extends KendaraanDarat{

    public Motor(String Nama) {
        super(Nama);
    }
    
    abstract void JenisMesin();
    void mesin (){
        System.out.println(Nama +" Menggunakan Mesin V-Twin.");
    }

}
