/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PCs Laptop New
 */
public class PersegiPanjang {
    private int panjang;
    private int lebar;
    public void setPanjang(int p){
    panjang =p;
    }
    public void setLebar(int l){
    lebar =l;
    }
    
    public int getPanjang(){
    return panjang;
    }
    public int getLebar(){
    return lebar;
    }
    public int luas(){
    int luas = panjang*lebar;
    return luas;
    }
    
    
}
