/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphisme;

/**
 *
 * @author LENOVO
 */
public class Surabaya extends kota{

   @Override
   public void city(String nama){
    System.out.println("Kota : " + nama);
}
   @Override
   public void city(String nama, double Luas){
    System.out.println(nama + " Memiliki Luas  : " + Luas);
}
   @Override
   public void city(String nama,int Populasi  ){
    System.out.println(nama +" Memiliki Jumlah Populasi Penduduk : " + Populasi );
}
    
}

