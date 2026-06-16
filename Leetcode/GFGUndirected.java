import java.util.*;
class GFGUndirected {
	
	public boolean isCycle(int V, int[][] edges) {
		
		ArrayList<Integer>[] adj = new ArrayList[V];
		
		for (int i = 0; i < V; i++) {
			adj[i] = new ArrayList<>();
		}
		
		for (int[] e : edges) {
			int u = e[0];
			int v = e[1];
			
			adj[u].add(v);
			adj[v].add(u);
		}
		
		boolean[] vis = new boolean[V];
		
		for (int i = 0; i < V; i++) {
			if (!vis[i]) {
				if (dfs(i, -1, vis, adj)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	private boolean dfs(int node,int parent,boolean[] vis,ArrayList<Integer>[] adj) {
		
		vis[node] = true;
		
		for (int num : adj[node]) {
			
			if (!vis[num]) {
				
				if (dfs(num, node, vis, adj)) {
					return true;
				}
				
			} else if (num != parent) {
				return true;
			}
		}
		
		return false;
	}
}

