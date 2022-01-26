/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Fatiha
 */
public class Tabung extends BangunTabung {
    int panjang,lebar,jari;
    double pi=3.14;
    int luas(){
        int luas = panjang * lebar;
        return luas;
    }
    double volume(){
        double volume = pi * jari * jari * lebar;
        return volume;
    }
}
