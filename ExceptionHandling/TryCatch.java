//import javax.sound.sampled.SourceDataLine;

public class TryCatch{
    public static void main(String args[]){
        try{
            int data = 100/0;
        }
        catch(Exception eeee){
            System.out.println("Can not divided by zero");
        }
        System.out.println("rest of the code");
    }
}