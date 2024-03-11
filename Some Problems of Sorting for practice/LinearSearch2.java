public class LinearSearch2 {
    
        public static int search(int num[],int key){
            for(int i=0; i<num.length; i++){
                if(num[i] == key){
                    return i;
                }
            }
            return -1;
        }

        public static void main(String args[]){
            int num[] = {1,2,3,4,56,8};

            int key = 8;
            System.out.println(search(num,key));
        }
}
