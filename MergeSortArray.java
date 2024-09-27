class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int[] result = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                result[k]= nums2[j];
                k++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                result[k]= nums1[i];
                k++;
                i++;
            }
            else {
                
                 result[k]= nums1[i];
                k++;
                result[k]= nums2[j];
                k++;
                j++;
                i++;
            }
        }
        if(j<n){
            while(j<n){
                result[k]= nums2[j];
                k++;
                j++;  
            }
        }
        if(i<m){
            while(i<m){
                result[k]= nums1[i];
                k++;
                i++;  
            }
        }
        for(i=0; i<result.length; i++){
            nums1[i] = result[i];
        }
    }
}

//Solution as discussed in class
 class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int p3=m+n-1;
        
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[p3] = nums1[p1];
                p1--;
                p3--;
            }else if(nums1[p1]<=nums2[p2]){
                nums1[p3] = nums2[p2];
                p2--;
                p3--;
                
            }
        }
        while(p2>=0){
            nums1[p3]=nums2[p2];
            p2--;
            p3--;
        }
    }
}