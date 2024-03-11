public class swap_two_num{
    public static void main(String args[]){
        int x=50, y=100;
        System.out.println(" numbers before swap x=" +x+ " and y = "+y);
        //swap using XOR operatior
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(" numbers after swap x=" +x+ " and y = "+y);
    }
}