/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PCs Laptop New
 */
public class LatihanInheritance{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    PersegiPanjang a= new PersegiPanjang();    
    a.setLebar(4);
    a.setPanjang(3);
    System.out.println("");
    System.out.println("Contoh program pewarisan");
    System.out.println("");
    System.out.println("Super class persegiPanjang");
    System.out.println("panjang ; "+a.getPanjang());
    System.out.println("lebar : "+a.getLebar());
    System.out.println("Luas : "+a.luas());
    System.out.println("");
    Balok b= new Balok();
    
    b.setPanjang(5);
    b.setLebar(4);
    b.setTinggi(4);
    System.out.println("Subclass Balok");
    System.out.println("panjang : "+b.getPanjang());
    System.out.println("lebar : "+b.getLebar());
    System.out.println("Tinggi : "+b.getTinggi());
    System.out.println("Tinggi : "+b.Volume());
  
    }
}
    
    

