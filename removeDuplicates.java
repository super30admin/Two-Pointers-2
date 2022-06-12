
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
    class Solution {
        public int removeDuplicates(int[] nums) {
            int p1 = 0,count=1;
            int index = 1;
            while(index<nums.length){
                if(nums[index]==nums[index-1]){   
                    count++;
                }
                else{
                    count = 1;    
                }          
                if(count<=2){
                    p1++;
                    nums[p1] = nums[index];
                }
            
                index++;
            }
            return p1+1;
        }
    }

