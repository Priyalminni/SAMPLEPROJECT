public class max_arr {
    public static void main(String[] args) {
        int nums[]={98,76,43,3434,87};
        int max=Integer.MIN_VALUE;
        System.out.println(Integer.MIN_VALUE);
        for (int num : nums) {
            if(max<num){
                max=num;
            }

        }
        System.out.println(max);
    }   
}
