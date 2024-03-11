public class Arrays2{
    public static void Update(int marks[], int nonChangeable){
        nonChangeable=20;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[] = {80,90,50};
        int nonChangeable = 10;
        Update(marks,nonChangeable);
        System.out.println(nonChangeable);
        //print marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }

}
