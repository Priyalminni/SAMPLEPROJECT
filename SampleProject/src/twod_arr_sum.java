public class twod_arr_sum {
    public static void main(String[] args) {
        int[][] matrix=new int[3][3];
        int value=1;

      for(int i =0;i<matrix.length;i++)
        {
          for(int j=0;j<matrix[i].length;j++){
            matrix[i][j]=value;
            value++;
          }
        }
      int sum =0;
      for (int[] row:matrix){
        for(int num:row){
          sum+=num;
        }
      }
      System.out.println(sum);
    }
}


//In this code, The matrix[][] is first initialized with incremental values starting from 1 up until 9 in a 3x3 matrix.
// And then the sum is calculated and printed