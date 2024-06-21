class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // HashMap<Character, Integer> hm=new HashMap<>();
        // int total=0;
        // for(int i=0;i<jewels.length();i++){
        //     char ch=jewels.charAt(i);
        //     if(hm.containsKey(ch)){
        //         hm.put(ch,hm.get(ch)+1);
        //     }
        //     else{
        //         hm.put(ch,1);
        //     }
        // }
        // for(int j=0;j<stones.length();j++){
        //     char ch=stones.charAt(j);
        //     if(hm.containsKey(ch)){
        //         total+=1;
        //     }
        // }
        // return total;
        Map<Character, Integer> hash = new HashMap();
        // declare variable to store jewels count
        int jewelCount = 0;
        // iterate over stones:
        for(int i = 0; i < stones.length(); i++) {
            // get the stone
            char stone = stones.charAt(i);
            // count stone in HashMap
            hash.put(stone, hash.getOrDefault(stone, 0) + 1);
        }
        // iterate over jewels:
        for(int i = 0; i < jewels.length(); i++) {
            // get the jewel
            char jewel = jewels.charAt(i);
            // check if our hash have stones that are jewels, if true add value of it to our jewelCount
            if(hash.containsKey(jewel)) jewelCount += hash.get(jewel);
        }
        // return calculated sum of jewels
        return jewelCount;
        
    }
}