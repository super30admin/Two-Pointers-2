//Time complexity: O(n)
//Space complexity: O(1)
//Executed on leetcode.
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1, count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[j-1])      //Defined a slow pointer to track each element and fast pointer for every new number. On every third repeated number, it is replaced next new element.
            {
                count++;
            }                   //When fast pointer reaches last index. return slow pointer which indicates the length of valid array.
            else{
                count=1;
                
            }
            if(count<=2)
            {
                nums[j] = nums[i];
                j++;
            }
           
        }
        
        
        /*for(int i=2;i<nums.length;)
        {
            if(i==nums.length-count)break;
            if(nums[i]==nums[i-2])
            {
                int temp = nums[i];
                while()
                    nums[j-1] = nums[j];
                }
                nums[nums.length-1] = temp;
                count++;
            }
            else
                i++;
        }
        return nums.length-count;*/
        return j;
    }
}