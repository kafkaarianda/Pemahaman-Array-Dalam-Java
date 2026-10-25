public class MencariNilaiTertinggiDanTerendah {
    public static void main(String[] args) {
        int[] suhu = {29, 32, 27, 35, 31, 26, 34};

        int idxMax = 0;
        int idxMin = 0;
        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > suhu[idxMax]) {
                idxMax = i;
            }
            if (suhu[i] < suhu[idxMin]) {
                idxMin = i;
            }
        }

        System.out.println("Suhu tertinggi: " + suhu[idxMax] + " (indeks " + idxMax + ")");
        System.out.println("Suhu terendah : " + suhu[idxMin] + " (indeks " + idxMin + ")");
        System.out.println("Selisih       : " + (suhu[idxMax] - suhu[idxMin]));
    }
}