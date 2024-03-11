// implementation of functional interface without lambda function
// functional interface is a interface which has only a abstract method;
// interface Drawable{
//     public void draw();
// }
// public class One{
//     public static void main(String[] args) {
//         int width = 10;

//         Drawable d = new Drawable() {
//             public void draw(){
//                 System.out.println("Drwaing "+width);
//             }  
//         };
//         d.draw();
//     }
// }

// Now implementation of functional interface with lambda function

interface Drawable{
    public void draw();
}
public class One{
    public static void main(String[] args) {
        int width = 19;

        Drawable d = () -> { // with lambda 
            System.out.println("drawing "+width);
        };
        d.draw();
    }
}