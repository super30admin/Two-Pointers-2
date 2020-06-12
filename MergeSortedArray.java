
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english :No
// Your code here along with comments explaining your approach



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        int i = m-1;
        int j = n-1;
        int k = i+j+1;
        while(i >=0 || j>=0){
            
            if(i == -1){
                while(j >=0)
              {
                    nums1[k] = nums2[j];
                j--;
                k--;
             }   
         }
            else if(j == -1){
                break;
            }
            else{
                if(nums1[i] < nums2[j])
                { 
                    nums1[k] = nums2[j];
                    j--;
                 }else{
                    nums1[k] = nums1[i];
                        i--;
                }
               k--;
                
            }
        }
    }
}