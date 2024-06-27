class Solution {
    public boolean isPalindrome(String s) {
        String result=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int leftIndex=0;
        int rightIndex=result.length()-1;
        while(leftIndex<rightIndex){
            if(result.charAt(leftIndex)!=result.charAt(rightIndex)){
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}