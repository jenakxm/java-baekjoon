package jenakxm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Set_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int queryNum = Integer.parseInt(st.nextToken());
        int s = 0;

        while(queryNum-- > 0) {
            st = new StringTokenizer(bf.readLine());

            String query = st.nextToken();

            if (query.equals("all")) {
                s = (1 << 21) - 1;
            } else if (query.equals("empty")) {
                s = 0;
            } else {
                int x = Integer.parseInt(st.nextToken());
                if (query.equals("add")) {
                    s |= (1 << x);
                } else if (query.equals("remove")) {
                    s &= ~(1 << x);
                } else if (query.equals("toggle")) {
                    s ^= (1 << x);
                } else if (query.equals("check")) {
                    if ((s & (1 << x)) != 0) {
                        sb.append(1+"\n");
                    } else {
                        sb.append(0+"\n");
                    }
                }
            }
        }
        System.out.println(sb);
    }
}