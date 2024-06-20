class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm=new HashMap<>();
        HashMap<Character, Integer> hm1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(hm1.containsKey(ch)){
                hm1.put(ch,hm1.get(ch)+1);
            }
            else{
                hm1.put(ch,1);
            }
        }
        if(s.length()!=t.length()){
            return false;
        }
        // for(int i=0;i<hm.size();i++){
        //     char ch=hm.get();
        // }
        // for(Character key:hm.keySet()){
        //     if(hm1.containsKey(key)){
        //         if(hm.get(key).equals(hm1.get(key))){
        //             return 
        //         }
        //     }
        // }
        for(Character key:hm.keySet()){
            if(!hm1.containsKey(key)){
                return false;
            }
            if(!hm.get(key).equals(hm1.get(key))){
                return false;
            }
            
        }
        return true;
        
    }
}