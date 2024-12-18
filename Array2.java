import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double[][] nilaiMahasiswa = new double[3][5];
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan nilai untuk Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Nilai " + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextDouble();
            }
        }
        
        
        for (int i = 0; i < 3; i++) {
            double total = 0;
            for (int j = 0; j < 5; j++) {
                total += nilaiMahasiswa[i][j];
            }
            double rataRata = total / 5;
            System.out.println("Rata-rata nilai Mahasiswa " + (i + 1) + ": " + rataRata);
        }
        
        scanner.close();
    }
}