package if1.pkg10119032.latihan22.perhitunganlingkaran;
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;


/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * nilai jari-jari, luas, dan keliling lingkaran ke layar
 */

public class IF110119032Latihan22PerhitunganLingkaran {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PHI = 3.1416;
        int diameter;
        
        System.out.println("===== Perhitungan Lingkaran =====");
        System.out.print("Masukkan Nilai Diameter Lingkaran : ");
        while(!scan.hasNextInt()){
            if(!scan.hasNextInt()){
                System.out.println("Nilai diameter tidak sesuai\n");
            }
            System.out.print("Masukkan nilai diameter lingkaran : ");
            scan.next();
        }
        
        //mekanisme perhitungan lingkaran
        diameter = scan.nextInt();
        int jariJari = diameter/2;
        double luas = PHI*(jariJari*jariJari);
        double keliling = PHI*2*jariJari;
        
        //memformat penulisan luas dan keliling lingkaran
        DecimalFormat formatter = new DecimalFormat("####.00");
        
        //menampilkan jari-jari, luas, dan keliling lingkaran ke layar
        System.out.println("\n===== Hasil Perhitungan Lingkaran =====");
        System.out.print("Jari-jari Lingkaran = " + jariJari + " cm\n");
        System.out.printf("Luas Lingkaran = " + 
                formatter.format(luas) + " cm\n");
        System.out.printf("Keliling Lingkaran = " + 
                formatter.format(keliling) + " cm\n");
        
    } 
}