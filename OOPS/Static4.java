public class Static4 {
    static int cube(int n){
        return n*n*n;
    }
    public static void main(String[] args) {
        int result = Static4.cube(4);
        System.out.println(result);
    }
}
