package com.company;

import com.topcanyazilim.islemler.ATM;
import com.topcanyazilim.islemler.Hesap;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("alitopcan","12345",2000);

        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor..");
    }
}
