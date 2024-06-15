class Solution {
    public String reverseWords(String s) {
        String[] res=s.trim().split("\\s+");
        //System.out.println(res[0]);
        StringBuilder sb=new StringBuilder();
        for(int i=res.length-1;i>0;i--){

            sb.append(res[i]);
            sb.append(" "); //To avoid the space after adding the 0th element we are adding the element after the for loop.
        }
        sb.append(res[0]);
        String result=sb.toString();
        return result;
    }
}