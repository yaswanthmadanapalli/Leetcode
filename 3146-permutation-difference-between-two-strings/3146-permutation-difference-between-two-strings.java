class Solution {
    public int findPermutationDifference(String s, String t) {
        int result=0;
        // for(int i=0;i<s.length();i++){
        //     for(int j=0;j<t.length();j++){
        //         if(s.charAt(i)==t.charAt(j)){
        //             result+=Math.abs(i-j);   
        //         }
        //     }
        // }
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            hm.put(temp, i);
        }
        for(int j=0;j<t.length();j++){
            char ch=t.charAt(j);
            int indexAtS=hm.get(ch);
            result+=Math.abs(indexAtS-j);
        }
        return result;
    }
}