import java.util.Scanner;

public class sdng1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan bil positif
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = scanner.nextInt();
        
        // Validasi input agar n adalah bil positif
        if (n < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            // Menghitung faktorial menggunakan loop
            long faktorial = 1;
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            
            // Menampilkan hasil faktorial
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }
        
       
    }
}
    
    

