package Tree;

import java.util.*;

public class Creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = 7; // number of nodes
        int n = 6; // number of edges

        // Adjacency List
        ArrayList<Integer>[] Tre = new ArrayList[m + 1];

        for (int i = 0; i <= m; i++) {
            Tre[i] = new ArrayList<>();
        }

        // Input edges
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            Tre[u].add(v);
            Tre[v].add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[m + 1];

        int source = sc.nextInt();

        q.add(source);
        visited[source] = true; // IMPORTANT

        while (!q.isEmpty()) {
            int sz = q.size();

            for (int i = 0; i < sz; i++) {
                int node = q.poll();

                System.out.print(node + " ");

                for (int o : Tre[node]) {
                    if (!visited[o]) {
                        visited[o] = true;
                        q.add(o);
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}