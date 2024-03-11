import java.util.*;
class Selection2{
    public static void selection(){
        
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        
        int maxAct = 0;
        ArrayList<Integer> ans  = new ArrayList<>();

        maxAct = 1;
        ans.add(0);

        int lastEnd = end[0];

        for(int i=1;i<end.length;i++){
            if(start[i] >= lastEnd){
                
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Maximum Activity: " +maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A" +ans.get(i)+ " ");
        }
        System.out.println();

    }
}
public class ActivitySelection{

    public static void main(String args[]){
        Selection2 s = new Selection2();
        s.selection();
        
    }
}