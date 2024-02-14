package Stakeholder;

import Company.Employee;
public class Hrd extends Employee {
    Hrd(int totalLembur,boolean sudahNikah, int jumlahAnak){
        super(5000000, 750000, totalLembur*7500, sudahNikah ? 250000 : 0, jumlahAnak > 1 ? 190000 : 90000);
    }

    public static void main(String[] args) {
        Hrd Aditya = new Hrd(0,false, 2);
        Aditya.presensiMasuk(8);
        Aditya.presensiKeluar(15);
        Aditya.showGaji();
        Aditya.showPenalty();
    }
}
