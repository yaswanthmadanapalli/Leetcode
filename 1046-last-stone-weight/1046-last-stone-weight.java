class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> result=new PriorityQueue<>(new Comparator<Integer>(){
           public int compare(Integer o1, Integer o2){
               if(o1<o2){
                   return 1;
               }
               if(o1>o2){
                   return -1;
               }
               return 0;
           } 
        });
        for(int i=0;i<stones.length;i++){
            result.add(stones[i]);
        }
        int[] temp=new int[2];
        int j=0;
        while(result.size()>1){
            int temp1=result.poll();
            int temp2=result.poll();
            if(temp1>=temp2){
                if(temp1!=temp2){
                    result.add(temp1-temp2);
                }
            }
        }
        if(result.size()!=0){
            return result.poll();
        }
        else{
            return 0;
        }
    }
}