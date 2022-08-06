 // Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //solving arrays in place always start from last
        //set 3 pointers at m-1 (p1), n-1(p2) and m+n-1(to insert new element)
        // which ever is greater populate that element in p and decreement the res pointer
        //p2>p1 then p=p2 and p2-- and p-- ||  p1>p2 then p=p1 and p-- and p1--
        //when p2>=0 then nums1[p] = nums2[p2] and p-- and p2--; to populate the remaining elements from nums2 to nums1
        
        int p1= m-1;
        int p2= n-1;
        int p = (m+n)-1;
        
        while(p1>=0 && p2>=0){
            if(nums2[p2]>nums1[p1]){
                nums1[p]=nums2[p2];
                p2--;
                p--;
            }
            else{
                nums1[p] = nums1[p1];
                p1--;
                p--;
            }
            
        }
        
        while(p1<0 && p2>=0){
            nums1[p]=nums2[p2];
            p--;
            p2--;
            
        }
        
        
        
        
        
        
        
    }
}