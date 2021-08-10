// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Yes, with optimal approach


// Your code here along with comments explaining your approach
/*Approach
1) set a count =1, pointer j=1
2) now iterate over the array and keep track of elements i and i-1
i.e. nums[i]==nums[i-1]
if they are equal and thus we increase the count++ originally it starts from 1
3) if not we reset the count to 1, indicating that we have just encountered the first occurrence of the element
4) now according to the problem condition upto K length array and occurences should be limited to 2 only. 
5) After performing the loop if we encounter count <=2, thus count is sufficient and thus we need to replace the extra elements with the next element
[2,2,2,3]
thus we need to replace 3rd 2 with 3 as it is extra. Once done we return the length of j as j performs the replacing and subsequently determining the length of array


*/



class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        int count=1;
        int j=1;
        for(int i=1;i<nums.length;i++)
        {
            //int j=i;
            
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            
            if(count<=2)
            {
                nums[j]=nums[i];
                j++;
            }
            
        }
        
        
        return j;
        
    }
}