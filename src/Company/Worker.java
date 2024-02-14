package Company;

public interface Worker {
    public int gajiPokok = 0;
    public int transport = 0;
    public int lembur = 0;
    public int tunjanganIsti = 0;
    public int tunjanganAnak = 0;

    void presensiMasuk(int clockInt);
    void presensiKeluar(int clockOut);
}
