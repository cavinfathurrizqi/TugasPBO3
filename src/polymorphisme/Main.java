/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphisme;

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {
        kota batu = new kota();
        batu.city("Batu");
        batu.city("Kota Batu", 199.09);
        batu.city("Kota Batu", 225000);

        System.out.println("");

        Surabaya kota = new Surabaya();
        kota.city("Surabaya");
        kota.city("Kota Surabaya", 333.06);
        kota.city("Kota Surabaya", 3000000);
    }
}
