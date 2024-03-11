public class Test2 extends Thread {
    public void run(){
        for(int i = 0;i<5 ; i++){
            try
            {
                Thread.sleep(500);
                //System.out.println(i);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Test2 t1 = new Test2();
        Test2 t2 = new Test2();
        t1.start();
        t2.start();
    }
}
