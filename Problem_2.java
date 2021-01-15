// Time Complexity :O(nlogn)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :NO(TLE)
// Any problem you faced while coding this :


// Below is the brute force solution for the merging the two sorted array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length==0) return;
        if(nums1.length==1 && nums2.length==1){
            nums1[0]=nums2[0];
            return;
        }
        int start=0;
        for(int i=nums1.length-1;i>=0;i--){
            if(nums1[i]==0){
                start=i;
                //break;
            }else{
                break;
            }
        }
        //start=start+1;
        if(start>nums1.length){
            nums1[0]=nums2[0];
            return;
        }
        
        for(int i=0;i<nums2.length;i++){
            nums1[start]=nums2[i];
            start=start+1;
        }
        //System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1);
    }
}

// Time Complexity :O(nlogn)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// In this we use the three pointer approach.


