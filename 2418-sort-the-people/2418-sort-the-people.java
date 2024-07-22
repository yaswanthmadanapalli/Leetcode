import java.util.Collections;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        Map<Integer, String> result=new HashMap<>();
        String[] result2=new String[n];
        for(int i=0;i<n;i++){
            result.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=n-1;i>=0;i--){
            result2[n-i-1]=result.get(heights[i]);
        }
        return result2;
    }
}