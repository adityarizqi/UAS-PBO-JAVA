package Stakeholder;

import Company.Employee;
public class Supervisor extends Employee {
    Supervisor(int totalLembur, boolean isMarried, int child){
        super(10000000, 1000000, totalLembur * 10000, isMarried ? 300000 : 0, child > 1 ? 200000 : 100000);
    }

    public static void main(String[] args) {
        Supervisor Daffa = new Supervisor(0,false, 2);
        Daffa.presensiMasuk(9);
        Daffa.showGaji();
        Daffa.showPenalty();
    }
}
