package jenakxm;

import java.util.Scanner;

public class TakePebble_9655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] result = new int[1001];

        result[1] = 1;
        result[2] = 0;
        result[3] = 1;

        for (int i = 4; i < 1001; i++) {
            if (result[i - 1] == 1 || result[i - 3] == 1) {
                result[i] = 0;
            } else {
                result[i] = 1;
            }
        }

        if (result[N] == 1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }

    }
}
