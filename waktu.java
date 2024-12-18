import java.util.Scanner;
     public class waktu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan waktu dalam detik: ");
            int totaldetik = scanner.nextInt();

            // konversi ke jam,menit,detik
            int jam = totaldetik / 3600;
            int menit = totaldetik / 60;
            int  detik = totaldetik % 3600;


         // output konversi
         System.out.printf("Waktu: %02d:%02d:%02d\n", jam, menit, detik);
       }
     }