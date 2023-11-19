package jenakxm;

import java.util.Scanner;

public class FindPrime_1929 {
    public void prime() {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] a = new int[n+1];
        for (int i = 2; i <= n; i++) {
            a[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (a[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= n; j = j + i) {
                a[j] = 0;
            }
        }

        for (int i = m; i <= n; i++) {
            if (a[i] != 0) {
                System.out.println(a[i]);
            }
        }
    }
}
