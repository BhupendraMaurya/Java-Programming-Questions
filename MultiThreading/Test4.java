//Can we start a thread twice: NOOOOOOOOOOOOOOOO
public class Test4 extends Thread {
    public void run(){
        System.out.println("Thread runing");
    }
    public static void main(String[] args) {
        Test4 t = new Test4();
        t.start();
        t.start();
    }
}
