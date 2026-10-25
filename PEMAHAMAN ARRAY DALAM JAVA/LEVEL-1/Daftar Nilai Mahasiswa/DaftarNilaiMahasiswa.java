public class DaftarNilaiMahasiswa {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 65, 85};

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " (indeks " + i + "): " + nilai[i]);
        }
        System.out.println("Nilai pada indeks ke-2: " + nilai[2]);
    }
}