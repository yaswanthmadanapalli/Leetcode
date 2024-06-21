class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        int total=0;
        for(int i=0;i<nums2.length;i++){
            int num=nums2[i]*k;
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        List<Integer> keyList=new ArrayList<>(hm.keySet());
        for(int j=0;j<nums1.length;j++){
            for(Integer key : hm.keySet()){
                if(nums1[j]%key==0){
                    total+=hm.get(key);
                }
            }
        }
        return total;
    }
}