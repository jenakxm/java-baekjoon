package jenakxm;

import java.util.Scanner;

public class Zoac_23971 {
    public void zoac() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(); // 행 수
        int W = sc.nextInt(); // 행 당 책상 수
        int N = sc.nextInt(); // 세로 공백
        int M = sc.nextInt(); // 가로 공백

        int count = 0;

        for (int i = 0; i < H; i+=(N+1)) {
            for (int j = 0; j < W; j+=(M+1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
