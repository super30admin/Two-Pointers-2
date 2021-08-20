
// Time Complexity :O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

// Three line explanation of solution in plain english
// iterate backwards using three pointers,one pointer at the end of nums 1 
// two ppointers at m and n positions
// compare nums1 at m and nums 2 at n,update the value of i based on which value is greater



// Your code here along with comments explaining your approach
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int ptr1=m-1; int ptr2=n-1;
        int i= m+n-1;
        while(ptr1>=0 && ptr2>=0 ){
            if(nums1[ptr1]> nums2[ptr2]){
                nums1[i]= nums1[ptr1];
                ptr1--;
            }
            else{
                nums1[i]= nums2[ptr2];
                ptr2--;
            }
            i--;
        }
        while(ptr2 >=0 && i>=0){
            nums1[i]= nums2[ptr2];
            i--;
            ptr2--;
        }
        
    }
};