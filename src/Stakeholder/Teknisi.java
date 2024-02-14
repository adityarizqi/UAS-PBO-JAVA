package Stakeholder;

import Company.Employee;
public class Teknisi extends Employee {
    Teknisi(int totalLembur, boolean isMarried, int child){
        super(3000000, 500000, totalLembur*5000, isMarried ? 200000 : 0, child > 1 ? 75000 : 150000);
    }

    public static void main(String[] args) {
        Teknisi Zidan = new Teknisi(35,true, 2);
        Zidan.presensiMasuk(7);
        Zidan.presensiKeluar(16);
        Zidan.showGaji();
        Zidan.showPenalty();
    }
}
