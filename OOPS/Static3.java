public class Static3 {
    static int count=0;
    Static3(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Static3 s = new Static3();
        Static3 s2 = new Static3();
    }
}
