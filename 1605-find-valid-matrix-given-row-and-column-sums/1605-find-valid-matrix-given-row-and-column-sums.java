class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length;
        int m=colSum.length;
        int[][] result=new int[n][m];
        int i=0,j=0;
        while(i<n && j<m){
            result[i][j]=Math.min(rowSum[i],colSum[j]);
            rowSum[i]-=result[i][j];
            colSum[j]-=result[i][j];
            if(rowSum[i]==0){
                i++;
            }
            else{
                j++;
            }
        }
        return result;
        
    }
}