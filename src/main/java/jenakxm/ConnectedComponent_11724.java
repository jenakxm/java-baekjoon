package jenakxm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ConnectedComponent_11724 {
    static ArrayList<Integer>[] A;
    static Boolean[] visited;
    public void CC11724() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A = new ArrayList[n + 1];
        visited = new Boolean[n + 1];

        for (int i = 1; i < n + 1; i++) {   // 인접리스트 초기화
            A[i] = new ArrayList<Integer>();
            visited[i] = false;
        }

        for (int i = 0; i < m; i++) {       // 에지 저장
            st = new StringTokenizer(bf.readLine());
            int s = Integer.parseInt(st.nextToken());   // edge start
            int e = Integer.parseInt(st.nextToken());   // edge end
            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (visited[i] == false) {
                DFS(i);
            }
        }
    }
}
