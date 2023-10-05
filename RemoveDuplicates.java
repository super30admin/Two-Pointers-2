//Time Complexity is O(n) and space Complexity is O(1)
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums == null && nums.length ==0) return 0;
        int slow = 0, count =1;
        for(int i=0; i< nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]){
                count++;
            }else{
                count =1;
            }
            if(count<=2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;

    }
}