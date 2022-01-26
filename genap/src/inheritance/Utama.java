/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
import java.util.Scanner;
/**
 *
 * @author Fatiha
 */
public class Utama {
    public static void main(String[] args){
        BangunTabung banguntabung = new BangunTabung();
        
        Scanner masukkan = new Scanner(System.in);
        
        Tabung tabung = new Tabung();
        System.out.println("Panjang : ");
        tabung.panjang=masukkan.nextInt();
        System.out.println("lebar : ");
        tabung.lebar=masukkan.nextInt();
        System.out.println("Jari-jari : ");
        tabung.jari=masukkan.nextInt();
        
        banguntabung.luas();
        banguntabung.volume();
        tabung.luas();
        tabung.volume();
        
        System.out.println("diketahui : ");
        System.out.println("Panjang : " + tabung.panjang);
        System.out.println("lebar : " + tabung.lebar);
        System.out.println("Jari-jari : " + tabung.jari);
        System.out.println("ditanyakan : ");
        System.out.println("luas selimut");
        System.out.println("volume tabung");
        System.out.println("Penyelesaian : ");
        System.out.println("luas selimut : panjang x lebar");
        System.out.println("= " + tabung.panjang + " x " + tabung.lebar);
        System.out.println("= " + tabung.luas());
        System.out.println("Volume Tabung : pi x jari x jari x lebar");
        System.out.println("= " + tabung.pi + " x "+ tabung.jari + " x " + tabung.jari + " x " + tabung.lebar);
        System.out.println("= " + tabung.volume());

    }
}
