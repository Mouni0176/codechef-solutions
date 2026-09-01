public static void setZeroes(int[][] mat) {
    int matt = mat[0][0];
    int row=1 ;
    int col=1;
    for(int i =0;i<mat.length;i++){
        if(mat[i][0] ==0){
             row =0;
        }
    }
    
    for(int j=0;j<mat[0].length;j++){
        if(mat[0][j] == 0){
             col =0;
        }
    }
    
    for(int i=1;i<mat.length;i++){
        for(int j=1;j<mat[0].length;j++){
            if(mat[i][j] ==0){
                mat[i][0] = 0;
                mat[0][j] = 0;
            }
        }
    }
    
    for(int i=mat.length-1;i>0;i--){
        for(int j=mat[0].length-1;j>0;j--){
            if((mat[i][0] ==0)||(mat[0][j]==0)){
                mat[i][j] =0;
            }
        }
    }
    if(row ==0){
        for(int i=0;i<mat.length;i++){
            mat[i][0]=0;
        }
    }
    
    if(col ==0){
        for(int j=0;j<mat[0].length;j++){
            mat[0][j]=0;
        }
    }
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(matt ==0){
                mat[0][j] =0;
                mat[i][0]=0;
            }
        }
    }
    
}