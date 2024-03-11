import java.util.*;
public class Heap_Insert{
    static class Heap{
        static ArrayList<Integer> al = new ArrayList<>();

        public static void add(int data){

        al.add(data); // add at last index

        int x = al.size()-1; // x is child index
        int par = (x-1)/2; // par index

        while(al.get(x) < al.get(par)){
            int temp = al.get(x);
            al.set(x, al.get(par));
            al.set(par, temp);
            x = par;
            par = (x-1)/2;
        }
        }
        public static int peek(){
            return al.get(0);
        }


    }
}