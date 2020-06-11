// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes



class Solution {
    public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {return 0;}
    //Set j pointer to 0th element
    // count = 1 initially, as all elements are present atleast once
    int j = 0, count = 1;
    //start from i = 1
    for (int i = 1; i < nums.length; i++) {
        //if nums[i] = nums[i-1]
        //we know element is repeated, so we inc count value
        if (nums[i] == nums[i-1]) {
           count++;
        } //if nums[i] != nums[i-1] then we set count = 1
        else {
            count = 1;
        }
        //copy the elements to jth position till count <= 2 as max dup allowed is 2
        // for copying, inc j value and then copy
        if (count <= 2) {
            j++;
            nums[j] = nums[i];
        }
    }
    //return j+1 as length, as we have set j = 0 in the start
    //so we first inc value j and then copy
    //not to miss the last element we return j+1
    return j+1;
    }
}


//if j = 1 , then copy first and then inc j
//if (count <= 2) {
//nums[j] = nums[i];
//j++;
//}
// and return only j


//General case, to have only n duplicates, change <=2 to <=n 