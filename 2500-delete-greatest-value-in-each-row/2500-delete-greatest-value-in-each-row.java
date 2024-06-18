class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m=grid.length;
        //int n=grid[0].length; I feel this code won't work for input: [[10],[10,20]]
        //PriorityQueue<Integer> result=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer>[] result=new PriorityQueue[grid.length]; //Array of PriorityQueue syntax.
        int total=0;
        for(int i=0;i<grid.length;i++){
            result[i]=new PriorityQueue<>(Comparator.reverseOrder());
            for(int j=0;j<grid[i].length;j++){
                result[i].add(grid[i][j]);
            }
        }
        for(int column=0;column<grid[0].length;column++){
            int maximumElement=Integer.MIN_VALUE;
            for(int row=0;row<grid.length;row++){
                if(!result[row].isEmpty()){
                    int removedElement=result[row].poll();
                    maximumElement=Math.max(removedElement,maximumElement);
                }
            }
            total+=maximumElement;
        }
        return total;
        
        
    }
}