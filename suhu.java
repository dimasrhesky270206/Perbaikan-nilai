import java.util.Scanner;

public class suhu { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Konversi suhu dalam Celcius
        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = scanner.nextDouble();

        // Konversi Celcius ke Fahrenheit
        double fahrenheit = (celcius * 9 / 5) + 32;

        // Menampilkan hasil konversi
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
    }
}
