// Time Complexity :O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach


public int removeDuplicates(int[] nums) {
    if(nums == null || nums.length==0) return 0;
    
    //using 2 pointers
    int i=1;
    int j=1;
    //for keeping of count of elements
    int count=1;
    
    while(i<nums.length){
        //using i to iterate and check next element
        // if the current element is same as previous then increament the count
        if(nums[i]==nums[i-1]){
            count++;
        }else{ // if the current element is not as previous that means new element and set the count as 1 for new element
            count=1;
        }
        //if count is less than 2, it means we need to swap elements and increase the j counter
        if(count<=2){
            nums[j]=nums[i];
            j++;
        }
        //always icnrease the i pointer
        i++;
    }
    return j;
}