import java.util.Scanner;

public class PerkalianMatriks {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Input ukuran matriks
        System.out.print("Masukkan jumlah baris matriks pertama: ");
        int rows1 = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks pertama (dan baris matriks kedua): ");
        int cols1 = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks kedua: ");
        int cols2 = scanner.nextInt();
        
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[cols1][cols2];
        int[][] result = new int[rows1][cols2];
        
        // Input elemen matriks pertama
        System.out.println("Masukkan elemen matriks pertama: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        // Input elemen matriks kedua
        System.out.println("Masukkan elemen matriks kedua: ");
        for (int i = 0; i < cols1; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        // Perkalian matriks
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        // Cetak hasil perkalian matriks
        System.out.println("Hasil perkalian matriks: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
        
    }
}
    

