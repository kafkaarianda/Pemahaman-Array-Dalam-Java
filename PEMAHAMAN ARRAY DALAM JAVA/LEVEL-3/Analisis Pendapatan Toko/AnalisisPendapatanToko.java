public class AnalisisPendapatanToko {
    static boolean muncul(int[] a, int batas, int nilai) {
        for (int i = 0; i < batas; i++) {
            if (a[i] == nilai) {
                return true;
            }
        }
        return false;
    }

    static int frekuensi(int[] a, int nilai) {
        int f = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == nilai) {
                f++;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        int[] p = {250, 300, 180, 420, 350, 300, 500, 150, 420, 380};

        int total = 0;
        for (int i = 0; i < p.length; i++) {
            total += p[i];
        }
        double rata = (double) total / p.length;
        System.out.println("Total: " + total + " ribu, rata-rata: " + rata + " ribu");

        System.out.print("Hari di atas rata-rata:");
        for (int i = 0; i < p.length; i++) {
            if (p[i] > rata) {
                System.out.print(" hari-" + (i + 1) + "(" + p[i] + ")");
            }
        }
        System.out.println();

        int maksFrek = 0;
        for (int i = 0; i < p.length; i++) {
            int f = frekuensi(p, p[i]);
            if (f > maksFrek) {
                maksFrek = f;
            }
        }
        System.out.print("Modus (muncul " + maksFrek + "x):");
        for (int i = 0; i < p.length; i++) {
            if (frekuensi(p, p[i]) == maksFrek && !muncul(p, i, p[i])) {
                System.out.print(" " + p[i]);
            }
        }
        System.out.println();

        int pertama = 0;
        for (int i = 1; i < p.length; i++) {
            if (p[i] > p[pertama]) {
                pertama = i;
            }
        }
        int kedua = -1;
        for (int i = 0; i < p.length; i++) {
            if (i != pertama && (kedua == -1 || p[i] > p[kedua])) {
                kedua = i;
            }
        }
        System.out.println("Tertinggi 1: hari-" + (pertama + 1) + " (" + p[pertama] + ")");
        System.out.println("Tertinggi 2: hari-" + (kedua + 1) + " (" + p[kedua] + ")");

        int turun = 0;
        for (int i = 1; i < p.length; i++) {
            if (p[i] < p[i - 1]) {
                turun++;
            }
        }
        System.out.println("Jumlah hari turun dari hari sebelumnya: " + turun);
    }
}