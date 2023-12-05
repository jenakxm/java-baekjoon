package jenakxm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Shortcut_1283 {
    public static void main(String [] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb;

        Set<String> shortcuts = new HashSet<>();

        int repeat = Integer.parseInt(st.nextToken());

        sb = new StringBuilder();
        for (int k = 0; k < repeat; k++) {

            st = new StringTokenizer(bf.readLine());

            String[] first = st.nextToken().strip().split("(?!^)");

            String[] second;
            if (st.hasMoreTokens()) {
                second = st.nextToken().strip().split("(?!^)");
            } else {
                second = null;
            }

            int idx1 = 11;
            int idx2 = 11;
            boolean flag = false;

            for (int i = 0; i < first.length; i++) {
                if (!shortcuts.contains(first[i].toLowerCase()) && !shortcuts.contains(first[i].toUpperCase())) {
                    shortcuts.add(first[i]);
                    idx1 = i;
                    break;
                }
            }

            if (second != null && idx1 != 0) {
                for (int i = 0; i < second.length; i++) {
                    if (idx1 != 11) {
                        if (!shortcuts.contains(second[i]) || first[idx1].equals(second[i])) {
                            shortcuts.add(second[i]);
                            idx2 = i;
                            break;
                        }
                    }
                }
            }

            if (idx1 == 11 || (idx1 != 0 && idx2 == 0)) {
                flag = true;
            }

            if (flag && second != null) {
                for (String t : first) {
                    sb.append(t);
                }
                sb.append(" ");
                for (int i = 0; i < second.length; i++) {
                    if (i == idx2) {
                        sb.append("[").append(second[idx2]).append("]");
                    } else {
                        sb.append(second[i]);
                    }
                }
            } else {
                for (int i = 0; i < first.length; i++) {
                    if (i == idx1) {
                        sb.append("[").append(first[idx1]).append("]");
                    } else {
                        sb.append(first[i]);
                    }
                }
                sb.append(" ");
                if (second != null) {
                    for (String t : second) {
                        sb.append(t);
                    }
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
