public class RemoveDuplicatesSortedArray {
    public int removeDupliates(int[] nums){
        if(nums == null || nums.length == 0)return 0;
        int slowPointer =1;
        int fastPointer =1;
        int count =1;
        while(fastPointer < nums.length){
            if(nums[fastPointer] == nums[fastPointer-1]){
                count++;
            }else{
                count =1;
            }

            if(count <=2){
                nums[slowPointer] = nums[fastPointer];
                slowPointer++;
            }
            fastPointer++;
        }
        return slowPointer;
    }
    
}

