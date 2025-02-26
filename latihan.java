public class latihan {
    public static void main(String[] args) {
        // deklrasi dan inisialisasi
        int[] number = new int[5];
        // inisialisasi
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        number[4]=5;

        System.out.println(); //untuk memberi jarak output
         for (int i = 0; i < number.length; i++) { //Perulangan untuk mengakses setiap elemen dalam array number
             System.out.print(number[i]+" ");   //Mencetak elemen array number[i] satu per satu, dipisahkan dengan spasi, pada baris yang sama  
         }


        System.out.println(); //untuk memberi jarak output
         for (int i = 0; i < number.length; i++) { //Perulangan for: Menelusuri setiap elemen dalam array number
                System.out.print(number[i]);  //Mencetak elemen array number[i]
                if (i<4) { //Jika i kurang dari 4 (untuk elemen ke-1 hingga ke-4), cetak koma setelah elemen 
                         System.out.print(","); //Tidak ada koma setelah elemen terakhir
             }     
         }

        System.out.println(); //untuk memberi jarak output
         for (int i = 0; i < number.length; i++) { // Menelusuri elemen dalam array number
             if (i%2==0) { //Hanya mencetak elemen dengan indeks genap (0, 2, 4, dst.).
                 System.out.print(number[i]);  
                 if (i<4) { //Menambahkan koma setelah elemen, kecuali setelah elemen terakhir yang dicetak.
                         System.out.print(",");
                     } 
             }     
         }

        System.out.println(); //untuk memberi jarak output
         for (int i = 4; i > -1; i--) { //Perulangan dimulai dari i = 4 dan akan terus berkurang (i--) sampai mencapai nilai lebih besar dari -1, yaitu sampai i = 0. Artinya, perulangan ini akan berjalan dari indeks 4, 3, 2, 1, dan 0.
             if (i%2==0) { //Memeriksa apakah i adalah angka genap. Jika ya, maka elemen array pada indeks i akan dicetak. Misalnya, jika i = 4 atau i = 2, maka elemen pada indeks tersebut akan dicetak.
                 System.out.print(+number[i]); //Mencetak elemen array number[i] pada posisi indeks i, tetapi hanya jika i genap (0, 2, 4, dll.).
                 if (i>1) { //Menambahkan koma setelah elemen, tetapi hanya jika i lebih besar dari 1. Dengan kata lain, koma tidak akan dicetak setelah elemen terakhir yang dicetak (indeks 0).
                     System.out.print(",");
                 }
             } 
         }

        System.out.println(); //untuk memberi jarak output
        for (int i = 0; i < number.length; i++) { 
             if (i%2==1) {  // Cek apakah indeksnya ganjil
                 System.out.print(+number[i]);  
                 if (i<2) { // Jika indeks lebih kecil dari 2
                     System.out.print(","); //// Cetak koma setelah elemen
                 } 
             }     
         }
         System.out.println(); //untuk memberi jarak output
         for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.print(number[0] + ","); // Cetak number[0] dan koma
                    break; 
                case 1:
                    System.out.print(number[0] + ","); // Cetak number[0] dan koma

                    break;
                case 2:
                    System.out.print(number[2] + ",");  // Cetak number[2] dan koma
                    break;
                case 3:
                    System.out.print(number[1] + ","); // Cetak number[1] dan koma
                    break;
                case 4:
                    System.out.print(number[4]); // Cetak number[4] tanpa koma
                    break;
            }
       }
    }   
}

