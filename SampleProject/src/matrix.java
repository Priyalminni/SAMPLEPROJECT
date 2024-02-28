public class matrix {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}};
    int sum=0;
    for(int i=0;i<matrix.length;i++){
        sum=sum+matrix[i][matrix.length-i-1];
    }
    System.out.println(sum);
        }

}

//The code calculates the sum of elements in 
//the secondary diagonal of a square 2D array matrix. 
//The variable sum is initialized to 0. 
//The loop iterates through each row of the array, and at each row, 
//it adds the element at the position (row, matrix.length - row - 1) to the sum variable. 
//After the loop,
// the sum contains the sum of elements in the secondary diagonal (3 + 5 + 7), which is 15.
