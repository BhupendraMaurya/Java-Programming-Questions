import java.util.ArrayList;
public class Remove_In_Heap {
    static class Heap{
        static ArrayList<Integer> al = new ArrayList<>();

        public void add(int data){

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
        public int peek(){
            return al.get(0);
        }

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if(left < al.size() && al.get(minIdx) > al.get(left)){
                minIdx = left;
            }
            if(right < al.size() && al.get(minIdx) > al.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                int temp = al.get(i);
                al.set(i, al.get(minIdx));
                al.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            int data = al.get(0);

            // step 1 : swap first and last
            int temp = al.get(0);
            al.set(0, al.get(al.size()-1));
            al.set(al.size()-1, temp);

            // step 2: delete last
            al.remove(al.size()-1);

            // step 3: call heapify
            heapify(0);

            return data;
        }
        public boolean isEmpty(){
            return al.size() == 0;
        }

    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(2);

        while(!h.isEmpty()){
            System.out.print(h.peek() +" ");
            h.remove();
        }

    }


}
