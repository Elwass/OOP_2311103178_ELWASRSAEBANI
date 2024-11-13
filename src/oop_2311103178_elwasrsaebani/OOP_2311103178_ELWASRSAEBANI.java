/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_2311103178_elwasrsaebani;

/**
 *
 * @author ASUS
 */
public class OOP_2311103178_ELWASRSAEBANI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Komputer komputer1 = new Komputer(20, "Warnet Gaming X", 5000.0f);
        komputer1.informasi();

        KomputerVIP komputerVIP1 = new KomputerVIP(15, "Warnet Gaming X", 7000.0f, true);
        komputerVIP1.informasi();
        komputerVIP1.login("Asep");
        komputerVIP1.bermain(2);
        komputerVIP1.bermain(2, 3);

        KomputerPremium komputerPremium1 = new KomputerPremium(5, "Warnet Gaming X", 10000.0f, true);
        komputerPremium1.informasi();
        komputerPremium1.pesan(5);
        komputerPremium1.tambahLayanan("Mie Goreng");
        komputerPremium1.tambahLayanan("Mie Goreng", "Es Teh");
    }
    
}
