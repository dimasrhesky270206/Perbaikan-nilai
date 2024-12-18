public class Array1 {
    public static void main(String[] args) {
        
        char[] arrayChar = new char[15];
        
        
        for (int i = 0; i < 15; i++) {
            arrayChar[i] = (char) ('A' + i);
        }
        
        System.out.println("=== Isi Array 1 Dimensi ===");
        int index = 0;

        // Menampilkan pola:
        // A
        // BC
        // DEF
        // GHIJ
        // KLMNO
        for (int baris = 1; index < arrayChar.length; baris++) { 
            for (int j = 0; j < baris; j++) {
                if (index < arrayChar.length) {
                    System.out.print(arrayChar[index] + " ");
                    index++;
                }
            }
            System.out.println(); 
        }
    }
}
