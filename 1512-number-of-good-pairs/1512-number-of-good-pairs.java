class Solution {
    public int numIdenticalPairs(int[] nums) {
        int totalGoodPairs=0;
        HashMap<Integer, Integer> counterMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            if(counterMap.containsKey(key)){
                totalGoodPairs+=counterMap.get(key);
                counterMap.put(key,counterMap.get(key)+1);
            }
            else{
                counterMap.put(key,1);
            }
        }
        return totalGoodPairs;
        
        
        
    }
}