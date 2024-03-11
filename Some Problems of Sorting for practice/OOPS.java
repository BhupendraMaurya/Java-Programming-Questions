class Account{
    private long acc_no;
    private String name;
    private String gmail;
    private float amount;

    public long getAcc_no(){
        return acc_no;
    }
    public void setAcc_no(long acc_no){
        this.acc_no = acc_no;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }

    public String getGmail(){
        return gmail;
    }
    public void setGmail(String gmail){
        this.gmail = gmail;
    }

    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount = amount;
    }
}

public class OOPS{
    public static void main(String args[]){
        Account acc = new Account();
        acc.setAcc_no(141414);
        acc.setName("bhupendra");
        acc.setGmail("raja!@123");
        acc.setAmount(50000);
        System.out.println("Welcome : Mr."+acc.getName());
        System.out.println("Your account number is: "+acc.getAcc_no());
        System.out.println("email is: "+acc.getGmail());
        System.out.println("Total balance is: "+acc.getAmount());
    }

    
}