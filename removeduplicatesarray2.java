//Time complexity O(N)
//Space complexity O(1)
//Ran on leetcode and accepted
class Solution {
    public int removeDuplicates(int[] nums) {
        //Initialize 4 pointers
        //Previous
        int prev = 0;
        //Slow pointer
        int slow = 1;
        //Fast pointer
        int fast = 1;
        //flag
        int flag = 0;
        //As long as fast is lesser than the length of the array be in while loop
        while (fast<nums.length)
        {
            //If the value at fast pointer is equal to value at previous pointer 
            if(nums[fast] == nums[prev])
            {
                //Check if flag is 0
                if(flag == 0)
                {
                    //Store the value at fast pointer to the position of slow pointer
                    nums[slow] = nums[fast];
                    //Increment fast , slow and set flag to 1
                    fast++;
                    slow++;
                    flag=1;
                }
                else 
                {
                    //Else only increment fast pointer
                   fast++;
                }
            }
            //else if value at previous pointer and fast pointer is not same
            else 
            {
                //make the index of fast pointer as prev pointer
                prev = fast;
                //set flag to 0
                flag = 0;
                //store value at fast pointer to the position of slow pointer
                nums[slow] = nums[fast];
                //Increment fast annd slow pointers
                fast++;
                slow++;     
            }
        }
        //Return slow pointer as 
        return slow;
    }
}