package Stakeholder;

import Company.Employee;
public class Karyawan extends Employee {
    Karyawan(int totalLembur, boolean isMarried, int child){
        super(1500000, 250000, totalLembur*5000, isMarried ? 200000 : 0, child > 1 ? 60000 : 130000);
    }

    public static void main(String[] args) {
        Karyawan Rizky = new Karyawan(20,true, 2);
        Rizky.presensiMasuk(7);
        Rizky.presensiKeluar(12);
        Rizky.showGaji();
        Rizky.showPenalty();
    }
}
