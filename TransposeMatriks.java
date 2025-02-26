import java.util.Scanner;

public class TransposeMatriks {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Input ukuran matriks
        System.out.print("Masukkan jumlah baris matriks: ");
        int rows = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int cols = scanner.nextInt();
        
        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];
        
        // Input elemen matriks
        System.out.println("Masukkan elemen matriks: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Transpose matriks
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        // Cetak matriks transpose
        System.out.println("Matriks transpose: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close(); 
    }
}

