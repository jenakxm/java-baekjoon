package jenakxm;

import java.util.*;

public class DfsBfs_1260 {
    static boolean[] visited;
    static ArrayList<Integer>[] A;

    public static void dfsbfs() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int start = scanner.nextInt();

        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        Arrays.fill(visited, false);

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            int s = scanner.nextInt();
            int e = scanner.nextInt();
            A[s].add(e);
            A[e].add(s);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }

        DFS(start);
        System.out.println();

        Arrays.fill(visited, false);
        BFS(start);
        System.out.println();
    }


    public static void DFS(int node) {
        System.out.print(node + " ");
        visited[node] = true;
        for (int i : A[node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    public static void BFS(int node) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(node);
        visited[node] = true;

        while (!q.isEmpty()) {
            int cur_node = q.poll();
            System.out.print(cur_node + " ");
            for (int i : A[cur_node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
