import java.util.Scanner;

public class DiagonalMatriks {

    public static void main(String[] args) {
        
    // Membuat objek scanner untuk membaca input dari pengguna
    Scanner sc = new Scanner(System.in);
    // Meminta pengguna memasukkan ukuran matriks
    System.out.print("Masukkan ukuran matriks (n * n) :");
    int n = sc.nextInt();
    // Membuat array 2D dengan ukuran n x n
    int[][] matriks = new int[n][n];
    // Meminta pengguna memasukkan elemen matriks
    System.out.print("Masukkan elemen matriks :");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matriks[i][j] = sc.nextInt();
        }
    }
    // Menampilkan diagonal utama matriks
    System.out.print("Diagonal utama : ");
    for (int i = 0; i < n; i++) {
        System.out.print(matriks[i][i] + " ");
    }
    System.out.println();
    // Menampilkan diagonal sekunder matriks
    System.out.print("Diagonal sekunder : ");
    for (int i = 0; i < n; i++) {
        System.out.print(matriks[i][n - i - 1] + " ");
    }
    System.out.println();

    sc.close();
}
}