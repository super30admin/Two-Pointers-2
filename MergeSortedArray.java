class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int curr = nums1.length-1;
        int ind1=m-1, ind2=n-1;
        
        while(ind1>=0 && ind2>=0){
            if(nums1[ind1] < nums2[ind2]){
                nums1[curr] = nums2[ind2];
                ind2--;
            }
            else{
                nums1[curr] = nums1[ind1];
                ind1--;
            }
            curr--;
        }
        if(ind1==-1 && ind2!= -1){
            while(ind2>=0){
                nums1[curr] = nums2[ind2];
                ind2--;
                curr--;
            }
        }
    }
}

//Tme complexity : O(N) where N is number of integers m+n
//Space complexity : O(1) 
