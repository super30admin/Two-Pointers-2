public class RemoveDuplicatesFromSortedArray {
  /*
  Time Complexity: O(n)
  Space Complexity: O(1)

  Were you able to solve this on leetcode? Yes
  */
  public int removeDuplicates(int[] nums) {
        
    if(nums.length <= 2) { return nums.length; }
    
    int current_num = nums[0];
    int count = 1;
    int i = 1,  j = 1;
    
    //  [1,1,1,2,2,3]
    
    while(j < nums.length){
        if(nums[j] == current_num && count < 2){
            nums[i] = nums[j];
            count++;
            i++;
        } else {
            while(j < nums.length && nums[j] == current_num){  
                j++;
                
            }
            
            if(j == nums.length) { break; }
            nums[i] = nums[j];
            current_num = nums[j];
            count = 1;
            i++;
        }
        
        j++;
    }
    
    return i;
}
}
