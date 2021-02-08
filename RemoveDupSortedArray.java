// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
//We are keeping two pointers i and j, i will be for traversing the element like in normal for loop
//j will only increment if count is less than or equal to 2 since we can only have atmost 2 dup elements,
//now j will point to the dup 3rd dup element which we will be replace with the ith index element and so on

// Your code here along with comments explaining your approach

public class RemoveDupSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums == null){
            return -1;
        }
        
        int j=0;
        int count=1;
        for(int i=0;i<nums.length;i++){
            
            if(i!=0&&nums[i]==nums[i-1]){
                count++; 
            }else {
                count=1;
            }
            
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
