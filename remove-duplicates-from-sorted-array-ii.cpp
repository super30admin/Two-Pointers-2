/*
Use two pointers, i and j, to iterate through the array. j is the slow pointer that represents the modified array with at most two duplicates.
Maintain a count variable to keep track of the occurrence of each element. Reset count to 1 when a new element is encountered.
If the count is less than or equal to 2, update the modified array at index j with the current element, and increment j. Finally, return the length of the modified array.
Time Complexity: O(n) - Single pass through the array.
Space Complexity: O(1) - Constant extra space used, as the modification is done in-place*/
#include<bits/stdc++.h>
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int j=1,count=1;
        for(int i=1;i<nums.size();i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
             if(count<=2){
            nums[j++]=nums[i];
        }
        }
       
        return j;
    }
};