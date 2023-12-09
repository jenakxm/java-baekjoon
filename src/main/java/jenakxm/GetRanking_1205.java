package jenakxm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class GetRanking_1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int newScore = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        if (N == 0) {
            System.out.println(1);
        } else {
            st = new StringTokenizer(bf.readLine());
            List<Integer> scoreList = new ArrayList<>();
            while (st.hasMoreTokens()) {
                scoreList.add(Integer.parseInt(st.nextToken()));
            }

            int rank = 1;
            int dup = 0;

            for (Integer s : scoreList) {
                if (s > newScore) {
                    rank++;
                } else if (s == newScore) {
                    dup++;
                }
            }

            if (rank + dup <= P) {
                System.out.println(rank);
            } else {
                System.out.println(-1);
            }
        }
    }
}
