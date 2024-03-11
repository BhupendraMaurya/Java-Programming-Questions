public class Encapsulation{
    
     static class Account{
        private long acc_no;
        private String name, email;
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
            this.name = name;
        }

        public String getEmail(){
            return email;
        }

        public void setEmail(String email){
            this.email = email;
        }

        public float getAmount(){
            return amount;
        }

        public void setAmount(float amount){
            this.amount = amount;
        }
    }
    public static void main(String args[]){

        Account acc = new Account();
        acc.setAcc_no(123456789);
        acc.setName("Bhupendra");
        acc.setEmail("iambhupendra@123");
        acc.setAmount(50000);

        System.out.println("Account Number: "+ acc.getAcc_no());
        System.out.println("Name: "+ acc.getName());
        System.out.println("EMail: "+ acc.getEmail());
        System.out.println("amount: "+ acc.getAmount());
    }
}