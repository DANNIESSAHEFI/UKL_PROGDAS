public class sulit3 {
    public static void main(String[] args) {
          // Array input
          int[] array = {1, 2, 2, 3, 3, 3, 4,1,4};

          // Cari nilai maksimum dalam array
          int max = 0;
          for (int num : array) {
              if (num > max) {
                  max = num;
              }
          }
  
          // Buat array frekuensi dengan ukuran max + 1
          int[] frequency = new int[max + 1];
  
          // Hitung frekuensi setiap elemen
          for (int num : array) {
              frequency[num]++;
          }
  
          // Tampilkan hasil
          for (int i = 0; i < frequency.length; i++) {
              if (frequency[i] > 0) {
                  System.out.println(i + " muncul " + frequency[i] + " kali");
              }
          }
      
  
    }
}
    
            
            

