import java.util.Scanner;
public class umudh1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variabel harga dan jarak
        int jarak1 = 10;
        int jarak2 = 11;
        int jarak3 = 100;
        int harga1 = 4000;
        int harga2 = 5000;
        int hargalebih100 = 6000;
        int tambahanVolume = 50000;
        int volumemin = 100;

        // Input dari pengguna
        System.out.println("Masukkan nilai jarak tempuh:");
        int jaraktempuh = input.nextInt();
        System.out.println("Masukkan nilai panjang paket:");
        int p = input.nextInt();
        System.out.println("Masukkan nilai lebar paket:");
        int l = input.nextInt();
        System.out.println("Masukkan nilai berat paket:");
        int beratpaket = input.nextInt();
        System.out.println("Masukkan nilai tinggi paket:");
        int t = input.nextInt();

        // Hitung volume
        int volume = p * l * t;
        int hargatotal = 0;

        // Hitung biaya berdasarkan jarak tempuh
        if (jaraktempuh <= jarak1) {
            hargatotal = harga1 * beratpaket;
        } else if (jaraktempuh <= jarak3) {
            hargatotal = harga2 * beratpaket;
        } else {
            hargatotal = hargalebih100 * beratpaket;
        }

        // Tambahkan biaya tambahan jika volume lebih dari minimal
        if (volume > volumemin) {
            hargatotal += tambahanVolume;
        }

        // Output biaya
        System.out.println("Biaya yang harus dibayar adalah: " + hargatotal);
    }
}