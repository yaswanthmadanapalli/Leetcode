class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length;
        int m=colSum.length;
        int[][] result=new int[n][m];
        int[] currentRowSum=new int[n];
        int[] currentColSum=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[i][j]=Math.min(rowSum[i]-currentRowSum[i],colSum[j]-currentColSum[j]);
                currentRowSum[i]+=result[i][j];
                currentColSum[j]+=result[i][j];
            }
        }
        return result;
        
    }
}