public class Test5 extends Thread{
    public void run(){
        System.out.println("Thread running");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        //System.out.println(Thread.currentThread().getName());
        Test5 t = new Test5();
        Thread.currentThread().setName("Bhupendra");
        System.out.println(Thread.currentThread().getName());
        t.start();
    }
}
