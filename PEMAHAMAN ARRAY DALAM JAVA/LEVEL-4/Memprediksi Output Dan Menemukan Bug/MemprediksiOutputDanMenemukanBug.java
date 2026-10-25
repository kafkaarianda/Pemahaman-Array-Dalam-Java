import java.util.Arrays;

public class MemprediksiOutputDanMenemukanBug {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] + data[data.length - 1 - i];
        }
        System.out.println("Kode asli : " + Arrays.toString(data));

        int[] asli = {1, 2, 3, 4, 5};
        int[] hasil = new int[asli.length];
        for (int i = 0; i < asli.length; i++) {
            hasil[i] = asli[i] + asli[asli.length - 1 - i];
        }
        System.out.println("Diperbaiki: " + Arrays.toString(hasil));
    }
}