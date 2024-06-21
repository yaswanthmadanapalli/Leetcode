class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
//         HashMap<Integer, Integer> hm=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             int key=nums[i];
//             hm.put(key,hm.getOrDefault(key,0)+1);
//         }
//         int[] result=new int[nums.length];
//         int total;
//         List<Integer> key=new ArrayList<>(hm.keySet());
//         for(int j=0;j<nums.length;j++){
//             total=0;
//             for(int k=0;k<key.size();k++){
//                 if(nums[j]>key.get(k)){
//                     total+=hm.get(key.get(k));
                    
//                 }
//             }
//             result[j]=total;
//         }
//         return result;
        int n=nums.length;
        int[] result=new int[n];
        int count;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            result[i]=count;
        }
        return result;
    }
}