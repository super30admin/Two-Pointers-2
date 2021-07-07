
// Time Complexity : O(m+n)
// Space Complexity : O(m+n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//1.Edge case
// return if n size 0
//2. logic
//A. merge in a nums1 array by two pointer method 
//B. first pointing to nums1
//C. second to nums2

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
       // 1.A
        if(n==0){
            return;
        }
        
        int nums1_pointer = 0, nums2_pointer=0;
        int count=0;
        vector<int> result(m+n,0);
        while(nums1_pointer<m && nums2_pointer<n){
           if(nums1[nums1_pointer] < nums2[nums2_pointer]){
               result[count] = nums1[nums1_pointer] ;
               nums1_pointer++;
            } 
            else{ //if(nums2[nums1_pointer] < nums1[nums2_pointer]){
                result[count] = nums2[nums2_pointer] ;
                nums2_pointer++;
            }
             count++;
        }
        
        if(nums2_pointer<n){
            while(nums2_pointer<n){
                result[count] = nums2[nums2_pointer];
                nums2_pointer++;
                count++;
            }
        }
        else if(nums1_pointer<m){
            while(nums1_pointer<m){
                result[count] = nums1[nums1_pointer];
                nums1_pointer++;
                count++;
            }
        }
        count=0;
        while(count<m+n){
            nums1[count] = result[count];
            count++;
        }
        
    }
};
