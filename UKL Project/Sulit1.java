import java.util.Scanner;
public class Sulit1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Masukkan jumlah siswa");
        int jumlahsiswa = input.nextInt();
 
        double [] nilai = new double[jumlahsiswa];
        double totalnilai = 0;
 
        for (int i = 0; i <nilai.length; i++) {
         System.out.println("Masukkan nilai siswa ke "+(i+1));
         nilai[i] = input.nextDouble();
         totalnilai += nilai[i];
        }   
        double ratarata = totalnilai / jumlahsiswa;
        System.out.println("Jumlah siswa adalah "+jumlahsiswa);
        System.out.println("Rata-rata nilai siswa adalah "+ratarata);
    }
}
