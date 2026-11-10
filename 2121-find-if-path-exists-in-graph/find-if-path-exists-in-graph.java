class Solution {
    public boolean validPath(int n, int[][] edges, int src, int dest) {
        if(src == dest) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<n; i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for(int i = 0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);

        }
        boolean[] visited = new boolean[n];
        visited[src] = true;
        bfs(src,dest,adj,visited);
        return visited[dest];
    }
    public void bfs(int src,int dest,List<List<Integer>> adj, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(q.size() >0){
            int front = q.remove();
            for(int ele : adj.get(front)){
                if(!visited[ele] ){
                    q.add(ele);
                    visited[ele] = true;
                    if(ele == dest) return;
                }
            }
        }

    }
}