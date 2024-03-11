public class OOPS1{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("BLUE");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount BankAcc = new BankAccount();
        BankAcc.username = " Bhupendra";
        BankAcc.password = " bvcbbc";//not allowed bcz password is in private form


        BankAcc.setPassword("bvcbcvc");



    }

}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage=(phy+chem+math)/3;
    }
}