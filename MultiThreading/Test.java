public class Test extends Thread{
    

    // Creating Thread in Java

    
    // by extending thread class
    // public void run(){
    //     System.out.println("thread running");
    // }
    // public static void main(String[] args) {
    //     Test t = new Test();
    //     t.start();
    // }

    // by implementing runnable interface
    // public void run(){
    //     System.out.println("thread running");
    // }
    // public static void main(String[] args) {
    //     Test t = new Test();
    //     Thread th = new Thread(t);
    //     th.start();
    // }

    // by thread class: Thread(String name)
    // public static void main(String[] args) {
    //     Thread th = new Thread("Thread name is bhupendra");

    //     th.start();
    //     System.out.println(th.getName());
    // }



    // using the thread class: Thread(runnable r,String name)

    public void run(){
        System.out.println("Thread running");
    }
    public static void main(String[] args) {
        Runnable r = new Test();

        Thread th = new Thread(r,"thread name is bhupendra");

        th.start();
        System.out.println(th.getName());
    }
}