package TP3;

public class EX8{
    public static void main(String[] args) {
        int[] array = {2, 5, 10, 17, 23};
        int maxGap = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int gap = Math.abs(array[i] - array[j]);
                if (gap > maxGap) {
                    maxGap = gap;
                }
            }
        }
        System.out.println("Le plus grand écart dans le tableau est : " + maxGap);
    }
}
