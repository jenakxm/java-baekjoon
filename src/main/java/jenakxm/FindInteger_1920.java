package jenakxm;

import java.util.Arrays;
import java.util.Scanner;

public class FindInteger_1920 {
    public void find1920() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 정렬 숫자 수
        int[] A = new int[N];   // 정렬 배열

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int M = sc.nextInt();   // 찾을 숫자 수
        for (int i = 0; i < M; i++) {
            boolean find = false;
            int target = sc.nextInt();

            int start = 0;
            int end = A.length - 1;

            while (start <= end) {
                int midi = (start + end) / 2;   // 중간값 인덱스
                int midV = A[midi];             // 중간값 밸류

                if (midV > target) {
                    end = midi - 1;
                } else if (midV < target) {
                    start = midi + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
