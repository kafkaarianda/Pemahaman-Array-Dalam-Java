public class AnalisisNilaiUjian {
    public static void main(String[] args) {
        int[] nilai = {75, 80, 65, 90, 55, 85, 70, 95};

        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        double rata = (double) total / nilai.length;
        System.out.println("Rata-rata: " + rata);

        System.out.print("Nilai di atas rata-rata:");
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > rata) {
                System.out.print(" " + nilai[i]);
            }
        }
        System.out.println();

        int lulus = 0;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= 70) {
                lulus++;
            }
        }
        double persen = (double) lulus / nilai.length * 100;
        System.out.println("Jumlah lulus (>= 70): " + lulus);
        System.out.printf("Persentase lulus: %.1f%%%n", persen);
    }
}