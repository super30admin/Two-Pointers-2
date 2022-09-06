//Approach-1: Use LinkedHashMap to store the occurances of the element in Java and then write back
//Approach-2: Remove element and reorder based on the condition of atmost 2 elements
//Approach-3: Using two pointers - fast and slow pointers
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int slow = 1;
        int count = 1; //As we are already considering the first element
        
        //Starting from the firt index as we always check the previous element
        for(int fast = 1; fast < nums.length; fast++){
            if(nums[fast] == nums[fast - 1]){
                count++;
            }else{
                count = 1;
            }
            
            if(count <= 2){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        
        return slow;
    }
}