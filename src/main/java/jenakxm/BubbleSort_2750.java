package jenakxm;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort_2750 {

    public void bubble() {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            int temp = scanner.nextInt();
            a[i] = temp;
        }
        int temp =0;
        for (int m = 0; m < num; m++) {
            for (int n = 0; n < m; n++) {
                if (a[m] < a[n]) {
                    temp = a[m];
                    a[m] = a[n];
                    a[n] = temp;
                }
            }
        }
        for (int an : a) {
            System.out.println(an);
        }
    }

}
