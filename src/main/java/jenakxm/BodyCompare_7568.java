package jenakxm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BodyCompare_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[][] ppl = new int[N+1][2];
        int[] answer = new int[N];

        Arrays.fill(answer, 1);

        for (int i = 1; i < N+1; i++) {
            st = new StringTokenizer(bf.readLine());
            ppl[i][0] = Integer.parseInt(st.nextToken());
            ppl[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                if (ppl[i][0] < ppl[j][0] && ppl[i][1] < ppl[j][1]) {
                    answer[i-1]++;
                }
            }
        }

        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}
