import java.util.Arrays;
import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("=== Mengurutkan 3 Bilangan ===");
     System.out.print("Masukkan bilangan pertama: ");
        int Bil1 = input.nextInt();
     System.out.print("Masukkan bilangan kedua: ");
        int Bil2 = input.nextInt();
     System.out.print("Masukkan bilangan ketiga: ");
          int Bil3 = input.nextInt();

        
            int[] bilangan = {Bil1, Bil2, Bil3};
            Arrays.sort(bilangan);

        // Cetak hasil urutan bilangan
        System.out.println("Bilangan setelah diurutkan (ascending): ");
        for (int bil : bilangan) {
            System.out.print(bil + " ");
        }
        System.out.println("\n");

        // Bagian 2: Menghitung harga air PAM berdasarkan jumlah kubik
        System.out.println("=== Menghitung Harga Air PAM ===");
        System.out.print("Masukkan jumlah m kubik air yang digunakan: ");
        int m = input.nextInt();

        int totalBayar = hitungHargaAir(m);

        // Cetak total harga yang harus dibayar
        System.out.println("Harga yang harus dibayar: Rp. " + totalBayar + ",-");

        input.close();
    }

    // Fungsi untuk menghitung harga air PAM
    public static int hitungHargaAir(int m) {
        int totalHarga = 0;

        if (m <= 50) {
            totalHarga = m * 1000;
        } else if (m <= 100) {
            totalHarga = 50 * 1000 + (m - 50) * 1500;
        } else if (m <= 150) {
            totalHarga = 50 * 1000 + 50 * 1500 + (m - 100) * 2000;
        } else {
            totalHarga = 50 * 1000 + 50 * 1500 + 50 * 2000 + (m - 150) * 3000;
        }

        return totalHarga;
    }
}
