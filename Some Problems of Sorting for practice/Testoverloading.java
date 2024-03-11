public class Testoverloading{
    class Addition{
        static int add(int a, int b){
            return a+b;
        }
        // static int add(int a, int b, int c){
        //     return a+b+c;
        // }
          static double add(double a, double b, double c){
            return a+b+c;
        }
    }
    public static void main(String args[]){
        System.out.println(Addition.add(2,3));
        System.out.println(Addition.add(2.1,3.1,4.1));
    }
}