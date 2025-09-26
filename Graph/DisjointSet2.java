import java.util.*;
class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public DisjointSet(int n){
        for(int i = 0; i <= n; i++){
            rank.add(0);
            parent.add(i);
            size.add(0);
        }
    }
    int findUpar(int node){
        
        if(node == parent.get(node)){
            return node;
        }

        int ulp = findUpar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }
    void unionByRank(int u, int v){
        int ulp_u = findUpar(u);
        int ulp_v = findUpar(v);

        if(ulp_u == ulp_v){
            return;
        }

        if(rank.get(ulp_u) < rank.get(ulp_v)){
            parent.set(ulp_v, ulp_u);
        }

        else if(rank.get(ulp_v) < rank.get(ulp_u)){
            parent.set(ulp_u, ulp_v);
        }

        else{
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU+1);
        }
    }

    void unionBySize(int u, int v){
        int ulp_u = findUpar(u);
        int ulp_v = findUpar(v);

        if(ulp_u == ulp_v){
            return;
        }

        if(size.get(ulp_u) < size.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        }

        else{
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }
}

public class DisjointSet2{
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(7);
        // ds.unionByRank(1,2);
        // ds.unionByRank(2,3);
        // ds.unionByRank(4,5);
        // ds.unionByRank(6,7);
        // ds.unionByRank(5,6);

        ds.unionBySize(1,2);
        ds.unionBySize(2,3);
        ds.unionBySize(4,5);
        ds.unionBySize(6,7);
        ds.unionBySize(5,6);
        
        // checking that 3 and 7 are in same component or not.
        if(ds.findUpar(3) == ds.findUpar(7)){
            System.out.println("Same component.");
        }

        else{
            System.out.println("Different component.");
        }

        // ds.unionByRank(3,7);
        ds.unionBySize(3,7);
        if(ds.findUpar(3) == ds.findUpar(1)){
            System.out.println("Same component.");
        }

        else{
            System.out.println("Different component.");
        }

        ds.unionBySize(3,3);
        if(ds.findUpar(3) == ds.findUpar(3)){
            System.out.println("Same component.");
        }

        else{
            System.out.println("Different component.");
        }
        
    }
}
