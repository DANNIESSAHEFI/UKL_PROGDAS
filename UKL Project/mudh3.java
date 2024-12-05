import java.util.Scanner;

public class mudh3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Masukkan angka awal");

        for (int i = input.nextInt(); i >= 2; i--) {
            if (i % 4 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 4 == 1) {
                System.out.println(i + ". saya anak moklet");
            } else if (i % 4 == 2)  {
                System.out.println(i + ". saya anak wikusama");
            } else {
                System.out.println(i + ". saya senang");
            }
        }
        
        
    }
}

