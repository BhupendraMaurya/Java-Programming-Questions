// single and multiple task using single and multiple thread

// performing single task using single thread


// public class Test6 extends Thread{
//     public void run(){
//         System.out.println("Running");
//     }

//     public static void main(String[] args) {
//         Test6 t = new Test6();
//         t.start();
//     }
// }


// performing single task using multiple thread
public class Test6 extends Thread{
    public void run(){
        System.out.println("Running one");
    }
    public static void main(String[] args) {
        Test6 t1 = new Test6();
        Test6 t2 = new Test6();
        Test6 t3 = new Test6();
        t1.start();
        t2.start();
        t3.start();
    }
}


// multiple task using single threadclass Test6 extends Thread=> Does not exist this type of situation
