/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Fatiha
 */
public class Tabungpoly extends BangunTabungpoly {
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
    public void polyoutput(){
        System.out.println("Ini adalah contoh output polymorphism");
    }
}
