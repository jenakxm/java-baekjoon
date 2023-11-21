package jenakxm;

import java.util.Scanner;

public class HoneyComb_2292 {
    public void hc() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int range = 1;
        int count = 1;
        for (int i = 1; i < 1000000000; i++) {
            if (num > range) {
                range += i * 6;
                count += 1;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
