package homework_shuttle;

import java.util.Arrays;

public class Main {

    public static int[] getLuckyShuttle(int y) {
        int[] shipNumbers = new int[y];
        int counter = 0;
        int x = 1;
        while (counter < y) {
            if (x % 10 != 4 && (x % 100) / 10 != 4 && x % 10 != 9 && (x % 100) / 10 != 9) {
                shipNumbers[counter] = x;
                counter++;
            }
            x++;
        }
        return shipNumbers;
    }

    public static void main(String[] args) {
        int[] result = getLuckyShuttle(100);
        System.out.println(Arrays.toString(result));

    }
}
