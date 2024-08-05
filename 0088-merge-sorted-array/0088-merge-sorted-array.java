class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1copy = new int[m];
        
        for(int i=0;i<m;i++){
            nums1copy[i]=nums1[i];
        }
        int p1=0,p2=0,p=0;
        while(p1<m && p2<n){
            if(nums1copy[p1]<=nums2[p2]){
                nums1[p]=nums1copy[p1];
                p1+=1;
            }
            else{
                nums1[p]=nums2[p2];
                p2+=1;
            }
            p++;
        }
        while(p1<m){
            nums1[p]=nums1copy[p1];
            p1++;
            p++;
        }
        while(p2<n){
            nums1[p]=nums2[p2];
            p2++;
            p++;
        }
    }
}