class MyComp implements Comparator<Integer>{
    public int compare(Integer o1, Integer o2){
        if(o1<o2){
            return 1;
        }
        if(o1>o2){
            return -1;
        }
        return 0;
    }
}
class Solution {
    
    public int maxProduct(int[] nums) {
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
        int[] temp=new int[2];
        int i=0;
        int result1=1;
        for(int j=0;j<nums.length;j++){
            result.add(nums[j]);
        }
        while(i<temp.length){
            temp[i]=result.poll();
            result1=result1*(temp[i]-1);
            i++;
        }
        return result1;
    }
}