class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hm=new HashMap<>();
        int total=0;
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for(int j=0;j<stones.length();j++){
            char ch=stones.charAt(j);
            if(hm.containsKey(ch)){
                total+=1;
            }
        }
        return total;
        
    }
}