import java.util.Scanner;

public class MenghapusDataDuplikat {
    static boolean muncul(int[] a, int batas, int nilai) {
        for (int i = 0; i < batas; i++) {
            if (a[i] == nilai) {
                return true;
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int[] peserta = {101, 102, 101, 102, 102, 104, 105, 103};

        System.out.print("Nomor duplikat:");
        for (int i = 0; i < peserta.length; i++) {
            boolean KemunculanPertama = !muncul(peserta, i, peserta[i]);
            int hitung = 0;
            for (int j = 0; j < peserta.length; j++) {
                if (peserta[j] == peserta[i]) {
                    hitung++;
            
                }
            }
            if (KemunculanPertama && hitung > 1) {
                System.out.print(" " + peserta[i]);
            }
        }
        System.out.println();

        int jumlahUnik = 0;
        for (int i = 0; i < peserta.length; i++) {
            if (!muncul(peserta, i, peserta [i])) {
                jumlahUnik++;
            }
        }
        int[] unik = new int[jumlahUnik];
        int k = 0;
        for (int i = 0; i < peserta.length; i++) {
            if (!muncul(peserta, i, peserta[i])) {
                unik[k++] = peserta[i];
            }
        }
        System.out.println("Array unik: " + java.util.Arrays.toString(unik));
        System.out.println("Jumlah peserta Unik: " + unik.length);
        
        
    }

}