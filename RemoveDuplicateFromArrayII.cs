
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
//Strat two pointer at first index, slwo and fast, compare fast with previos, move it and update count
//if not equal reset count = 1, then overide slow with fast at same time.
 public int RemoveDuplicates(int[] nums) {
    if(nums == null || nums.Length == 0)
        return 0;
    
    int slow = 1;
    int count = 1;
    
    for(int fast = 1; fast < nums.Length; fast++)
    {
        //fast is equal to preious element, increase the count
        //if its not equal, means we got new eleemnt, reset the count  to 1
        if(nums[fast] == nums[fast-1])
            count++;
        else
            count = 1;
        
        //here we got two same element, now override fast with slow element
        if(count <= 2)
        {
            nums[slow] = nums[fast];
            slow++;
        }
    }
    return slow;
}