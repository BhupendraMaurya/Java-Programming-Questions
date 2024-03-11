public class Call_By_Value {
    int data = 60;

    int change(int data){ //changes will be in the local variable only  
        data = data+100;
        return data;
    }

    public static void main(String[] args) {
        Call_By_Value call = new Call_By_Value();
        System.out.println("before change"+call.data);
        call.change(500);
        System.out.println("after change"+call.data);
        System.out.println(call.change(50));
        System.out.println(call.data);
    }
}
