class Solution {
    public int compress(char[] chars) {
        // int i=0;
        // int j=0;
        // int n=chars.length;
        // char[] res=new char[chars.length];
        // if(chars.length==1){
        //     return 1;
        // }
        // while(i<n){
        //     int count=1;
        //     char ch=chars[i];
        //     while(i+1<n && ch==chars[i+1]){
        //         count++;
        //         i++;
        //     }
        //     if(count==1){
        //         chars[j++]=ch;
        //         System.out.println(chars[0]);
        //     }

        //     i++;
        // }
        // return 1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            int count=1;
            while(i+1<chars.length && ch==chars[i+1]){
                count++;
                i++;
            }
            sb.append(ch);
            if(count>1){
                sb.append(count);
            }

        }
        char[] res=sb.toString().toCharArray();
        for(int i=0;i<res.length;i++){
            chars[i]=res[i];
        }
        return res.length;
    }
}