public static void rotateClockwise(int[][] matrix) {
    // write your code here 
    int k=matrix.length;
    int [][] arr = new int[k][k];
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix.length;j++){
            arr[i][j] = matrix[k-j-1][i];
                
        }
    }
    for(int i =0;i<matrix.length;i++){
        for(int j=0;j<matrix.length;j++){
            matrix[i][j] = arr[i][j];
        }
    }
}