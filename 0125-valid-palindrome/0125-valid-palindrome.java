class Solution {
    public boolean isPalindrome(String s) {
        //String result=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        // if(s.toLowerCase.charAt(leftIndex)!=s.toLowerCase.charAt(rightIndex)){
            //     return false;
            // }
        int leftIndex=0;
        int rightIndex=s.length()-1;
        while(leftIndex<rightIndex){
            while (leftIndex<rightIndex && !Character.isLetterOrDigit(s.charAt(leftIndex))) {
                leftIndex++;
            }
            // Find the next alphanumeric character from the right
            while (leftIndex<rightIndex && !Character.isLetterOrDigit(s.charAt(rightIndex))) {
                rightIndex--;
            }
            
            if(leftIndex<rightIndex && Character.toLowerCase(s.charAt(leftIndex))!=Character.toLowerCase(s.charAt(rightIndex)))        {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}