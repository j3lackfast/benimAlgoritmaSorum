/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benimalgoritmasorum;

import java.util.Scanner;

/**
 *
 * @author YusufEren
 */
class araba{
    String renk,motor,vites,direksiyon;
    
    public araba(String renk){
        this.renk=renk;
    }
    
    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public String getDireksiyon() {
        return direksiyon;
    }

    public void setDireksiyon(String direksiyon) {
        this.direksiyon = direksiyon;
    }
    
    public String durum(){
        return "araba çalışıyor";
    }
    
}


public class IkinciElAraba extends araba{
    int Yakittuketimi;
    int Model;
    private String KM;

    public int getYakittuketimi() {
        return Yakittuketimi;
    }

    public void setYakittuketimi(int Yakittuketimi) {
        this.Yakittuketimi = Yakittuketimi;
    }

    public int getModel() {
        return Model;
    }

    public void setModel(int Model) {
        this.Model = Model;
    }

    public String getKM() {
        return KM;
    }

    public void setKM(String KM) {
        this.KM = KM;
    }

   

    public IkinciElAraba(int Yakittuketimi, int Model, String KM, String renk) {
        super(renk);
        this.Yakittuketimi = Yakittuketimi;
        this.Model = Model;
        this.KM = KM;
    }
    
    private int YasHesapla(int yil){
        int yas=yil-Model;
        return yas;
    }
    
    public int YakitHesapla(int yakitfiyati,int gidilenkm){
        int sonuc1=(gidilenkm*Yakittuketimi)/100;
        int topharcanan=sonuc1*gidilenkm;
        
        return topharcanan;
    }

    @Override
    public String durum() {
        return this.getKM()+"'de sorunsuz çalışıyor."; 
    }  
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Yakıt Tüketimi Giriniz");
        int yktmt=input.nextInt();
        System.out.println("Model Giriniz");
        String mdl=input.next();
        System.out.println("KM Giriniz");
        int km=input.nextInt();
        IkinciElAraba ikinciel=new IkinciElAraba(yktmt, km, mdl, "kırmızı");
        SifirAraba sifir=new SifirAraba("Fiat Egea","kırmızı");
        ikinciel.durum();
        sifir.durum();
    }
}

class SifirAraba extends araba{
    String arabamodeli;

    public String getArabamodeli() {
        return arabamodeli;
    }

    public void setArabamodeli(String arabamodeli) {
        this.arabamodeli = arabamodeli;
    }

    public SifirAraba(String arabamodeli, String renk) {
        super(renk);
        this.arabamodeli = arabamodeli;
    }

    @Override
    public String durum() {
        return this.getArabamodeli()+"Bu araba hiç çalışmadı";
    }
    
    
}