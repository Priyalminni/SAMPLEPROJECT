public class min_arr {

        public static void main(String[] args) {
            int[] nums={1,2,3,4,5,6};
            int min=Integer.MAX_VALUE;
            for(int num:nums){
                if(min>num){
    
                    min=num;
                }
            }
            System.out.println("min is "+min);
        }
    }
