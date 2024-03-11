public class Test3 {
    public static void main(String[] args) {
        
        try
        {
            for(int i=0;i<5;i++){
                System.out.println(i);

                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
