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
        int start=m;

        
        for(int i=0;i<nums2.length;i++){
            nums1[start]=nums2[i];
            start=start+1;
        }
        //System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1);
    }
}

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// In this we use the three pointer approach.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums1.length==0) return;
        int pointer1=m-1;
        int pointer2=n-1;
        int index=m+n-1;
        while(pointer1>=0 && pointer2 >=0){
            if(nums1[pointer1]>nums2[pointer2]){
                nums1[index]=nums1[pointer1];
                pointer1=pointer1-1;
            }else{
                nums1[index]=nums2[pointer2];
                pointer2=pointer2-1;
            }
            index=index-1;
        }
        while(pointer2>=0){
            nums1[index]=nums2[pointer2];
            pointer2=pointer2-1;
            index=index-1;
        }
    }
}


