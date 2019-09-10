//Time Complexity: O(N)
//Space Complexity:O(1)
//In this problem, I'll be having two pointers, one to track index in my first array and the other in my second array. If the element in the index pointed by my first pointer is greater than my second,I'll move the element pointed by my first pointer to the index position and decrement the first pointer. Else, I'll move the element pointed by my second pointer to the index position and decrement the second pointer. If there are elements left in the second array, I'll move them to the empty indices in my first array.
//This code was executed successfully and got accepted in leetcode.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1=m-1;
        int ptr2=n-1;
        int index=m+n-1;
        while(ptr1>=0&&ptr2>=0){
            if(nums1[ptr1]>nums2[ptr2]){
                nums1[index]=nums1[ptr1];
                ptr1--;
            }
            else{
                nums1[index]=nums2[ptr2];
                ptr2--;
            }
            index--;
        }
        while(ptr2>=0){
            nums1[index]=nums2[ptr2];
            ptr2--;
            index--;
        }
    }
}