import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFS {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void creatingGraph(ArrayList<Edge>[] graph){
        // 0's vertex
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        // 1's vertex
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        // 2's vertex
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        // 3's vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,5,1));
        graph[3].add(new Edge(3,4,1));

        // 4's vertex
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        // 5's vertex
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        // 6's vertex
        graph[6].add(new Edge(5,6,1));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]){ // O(V+E)
        System.out.print(curr +" ");
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }


    public static void main(String[] args) {

        //         (1)--------(3)
        /*        /            |  \
         *       /             |   \
         *    (0)              |   (5)-------(6)
         *       \             |  /
         *        \            | /
         *         (2)--------(4) 
         */

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }
        creatingGraph(graph);
        dfs(graph, 0, new boolean[V]);
    }
}
