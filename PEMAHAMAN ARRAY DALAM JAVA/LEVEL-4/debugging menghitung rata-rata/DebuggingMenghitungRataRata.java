public class DebuggingMenghitungRataRata {
    public static void main(String[] args) {
        int[] scores = {80, 70, 90, 60};

        System.out.println("KODE ASLI (BERMASALAH)");
        try {
            int total = 0;
            for (int i = 0; i <= scores.length; i++) {
                total += scores[i];
            }
            double average = total / scores.length;
            System.out.println(average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("KODE SETELAH DIPERBAIKI");
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        double average = (double) total / scores.length;
        System.out.println(average);
        
        
        
    }
}