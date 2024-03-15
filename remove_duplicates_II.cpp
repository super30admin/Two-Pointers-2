// Approach 1
// Time Complexity : O(n)             
// Space Complexity : O(n) 
//
// Approach 2
// Time Complexity : O(n)             
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leet code : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

Given an integer array nums sorted in non-decreasing order, 
remove some duplicates in-place such that each unique element appears at most twice. 
The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, 
you must instead have the result be placed in the first part of the array nums. 
More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. 
It does not matter what you leave beyond the first k elements.
*/


/*
Approach 1 : Using extras space
New array is created of same size as original array.
Element are copied to new array only if it is not repeated more than twice (that means 
elements is not equal to element at arr[i-2] location.)
Whenever we copy element, ptr used for tracking second array is incremented.

As we are starting the comparison from 3rd position, handle scenario where size is less than 2.
*/

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int size = nums.size();
        if(size<=2) return size;
        vector<int>temp(size, 0);

        temp[0] = nums[0];
        temp[1] = nums[1];
        int ptr = 2;

        for(int i =2; i<size; i++){
            if(nums[i] != nums[i-2]){
                temp[ptr] = nums[i];
                ptr++;
            }
        }
        for(int i=0; i<nums.size(); i++){
            nums[i] = temp[i];
        }

       return ptr;
    }
};


/*
Approach 2 : Using extras space

*/

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int size = nums.size();
        if(size<=2) return size;

        int ptr = 1;
        int cnt = 1;

        for(int i=1; i<size; i++){
            if(nums[i] == nums[i-1]){
                cnt++;
            } else { cnt = 1;}
            if(cnt <= 2){
                nums[ptr] = nums[i];
                ptr++;
            }
        }
       return ptr;
    }
};