import java.util.*;
public class Create_A_Graph {

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

    public static void creatingGraph(ArrayList<Edge> [] graph){
    // 0-vertex
    graph[0].add(new Edge(0,1,5));

    // 1's-vertex

    graph[1].add(new Edge(1,0,5));
    graph[1].add(new Edge(1,2,1));
    graph[1].add(new Edge(1,3,3));

    // 2's vertex

    graph[2].add(new Edge(2,1,1));
    graph[2].add(new Edge(2,3,1));
    graph[2].add(new Edge(2,4,2));

    // 3's vertex
    graph[3].add(new Edge(3,1,3));
    graph[3].add(new Edge(3,2,1));

    // 4's vertex
    graph[4].add(new Edge(4,2,2));


    // 2's neighbour

    for(int i=0;i<graph[2].size();i++){
        Edge e = graph[2].get(i);
        System.out.println(e.dest);
    }
    }
    public static void main(String[] args) {

        /*        (0)---5---(1)
                           |  \
                           1|   \3
                           |    \
                           (2)--1-(3)
                            |
                            |2
                            |
                            (4)
         * 
         */

         int V = 5;
         ArrayList<Edge> [] graph = new ArrayList[V]; // it is undefined arraylist , so it is null list so
                                                          // we have to make it empty list;

         for(int i=0;i<V;i++){

            graph[i] = new ArrayList<>();
         }

         creatingGraph(graph);
        
    }
}
