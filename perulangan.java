import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("=== Menentukan Bilangan Prima ===");
        System.out.print("Masukkan bilangan untuk diperiksa: ");
        int bilangan = input.nextInt();

        if (isPrima(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

        System.out.println();

        
        System.out.println("=== Menentukan KPK (Kelipatan Persekutuan Terkecil) ===");
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();

        int kpk = hitungKPK(bil1, bil2);
        System.out.println("KPK dari " + bil1 + " dan " + bil2 + " adalah: " + kpk);

        input.close();
    }

    
    public static boolean isPrima(int n) {
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }

    
    public static int hitungKPK(int a, int b) {
        int kpk = (a > b) ? a : b; 

        
        while (true) {
            if (kpk % a == 0 && kpk % b == 0) {
                break; 
            }
            kpk++;
        }
        return kpk;
    }
}
