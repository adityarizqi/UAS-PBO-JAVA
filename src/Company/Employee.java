package Company;
import java.text.NumberFormat;
import java.util.Locale;

public class Employee implements Worker {
    Locale indonesiaLocale = new Locale("id", "ID");
    NumberFormat indonesiaFormat = NumberFormat.getCurrencyInstance(indonesiaLocale);

    int gajiPokok = 0;
    int transport = 0;
    int lembur = 0;
    int tunjanganIsti = 0;
    int tunjanganAnak = 0;
    int penalty = 0;

    public Employee(int gajiPokok, int transport, int lembur, int tunjanganIstri, int tunjanganAnak) {
        this.gajiPokok = gajiPokok;
        this.transport = transport;
        this.lembur = lembur;
        this.tunjanganIsti = tunjanganIstri;
        this.tunjanganAnak = tunjanganAnak;
    }

    @Override
    public void presensiMasuk(int clockIn) {
        if(clockIn > 7) this.penalty += (clockIn - 7) * 100000;
    }

    @Override
    public void presensiKeluar(int clockOut) {
        if(clockOut < 16) this.penalty += (16 - clockOut) * 100000;

    }

    public void showGaji(){
        System.out.println("Total gaji bulan ini    : " + indonesiaFormat.format((this.gajiPokok + this.transport + this.lembur + this.tunjanganAnak + this.tunjanganIsti) - this.penalty));
    }

    public void showPenalty(){
        if(this.penalty > 0){
            System.out.println("Potongan keterlambatan  : " + indonesiaFormat.format(this.penalty));
        }else{
            System.out.println("Anda menjadi karyawan teladan bulan ini !!");
        }

    }
}
