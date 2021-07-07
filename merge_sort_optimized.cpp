
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


//1.Edge case
// return if n size 0
//2. logic
//A. start merging from the last in nums1 array by two pointer method  
//B. first pointing to nums1
//C. second to nums2

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
       // 1.A
        if(n==0){
            return;
        }
        
        int nums1_pointer = m-1, nums2_pointer=n-1;
        int count=m+n-1;
       
        while(nums1_pointer>=0 && nums2_pointer>=0){
           if(nums1[nums1_pointer] > nums2[nums2_pointer]){
               nums1[count] = nums1[nums1_pointer] ;
               nums1_pointer--;
            } 
            else{ 
                nums1[count] = nums2[nums2_pointer] ;
                nums2_pointer--;
            }
             count--;
        }
        
       while(nums2_pointer>=0){
                nums1[count] = nums2[nums2_pointer];
                nums2_pointer--;
                count--;
            }

    
        
    }
};
