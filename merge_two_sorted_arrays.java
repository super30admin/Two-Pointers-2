class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        int last  = n-1;
        if(m==0){
            for(int i=last; i>=0; i--){
                nums1[i]= nums2[last];
                last--;
            }
        return;
        }
        int first = m-1;
        
        int flag=0;
        for(int i=nums1.length-1;i>=0;i--){
            if(nums2[last] > nums1[first]){
                nums1[i]=nums2[last];
                last--;
            }else if(nums2[last] < nums1[first]){
                nums1[i]=nums1[first];
                first--;
            }
            else{
                nums1[i]=nums1[first];
                first--;
            }
            if(last <0) break;
            if(first <0 ) {flag=1; break;}
            
           
        }
        
         if(flag==1 ){
                for(int i=last; i>=0; i--){
                    nums1[i]=nums2[last];
                    last--;
                }
         }
        
    }
}
