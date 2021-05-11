/*J is collecting all the legitimate values. i is just for looping through the array
j stops at the point where the number is to be replaced. for example, 3rd occurance of 1 in [1,1,1,2]
and i will keep going forward, traversing through the array. 

Example: [1,1,1,1,2,3,3,3,3]
          0 1 2 3 4 5 6 7 8
Explanation: at index 2, i and j are both on the same element: 1. But the count is 3. So we keep incrementing i till we come to a new element.
i reaches index 4. Count is now 1, so it is replaced with element: 2.
[1,1,2,1,1,3,3,3,3]
 0 1 2 3 4 5 6 7 8
 i is now on index 5, j on 3. Count again is reset to 1. 
[1,1,2,3,3,1,1,3,3]

Time complexity: O(N)
Space complexity: O(1)
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        //i is for looping through all the elements and j is collecting legitimate values
        int count = 0; int tempNum = nums[0]; int j=0;
        for(int i=0; i<=nums.length-1;i++)
        {
            if(nums[i]==tempNum)
                count++;
            else
            {
                count = 1;
                tempNum = nums[i];
            }
            if(count<=2)
            {
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return j;
    }
}