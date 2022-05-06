/*Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
*/
https://leetcode.com/problems/set-matrix-zeroes/
class settozero {
    public void setZeroes(int[][] matrix) {
        int colzero = 1;
        int r=matrix.length, c=matrix[0].length;
        for(int i=0;i<r;i++){
            if(matrix[i][0]==0) colzero =0;
            for(int j=1;j<c;j++)
                //make dummy array zero first when you find zero while traversing thorugh matrix
                if(matrix[i][j]==0)
                    matrix[i][0]=matrix[0][j]=0 ;//left and topmost 
             }
        //now traverse backward and find zero in dummy array if found make row and col as zero
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=1;j--)
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0 ;
                        if(colzero==0) matrix[i][0]=0;
        }
}
}

