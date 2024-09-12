class CircularArray {
  public static int getIndex(int [] nums, int i){
        int index = 0;
        int n = nums.length;
       
        if(nums[i] + i >= 0){
            index =(nums[i] + i)%n;
        } else {
            index = n + ((nums[i] + i)%n);
        }       
        return result;
    }
    public boolean circularArrayLoop(int[] nums) {

        if(nums.length < 2) return false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) continue;
            int slow = i;
            int fast = getIndex(nums,i);
       // Making sure direction doesnt change
            while(nums[i] * nums[fast] > 0 && nums[i] * nums[getIndex(nums,fast)] > 0){
                if(slow == fast){
                    //Check loop length>1
                    if (slow == getIndex(nums, slow)) {
                        break;
                    }
                    return true;
                }
                slow = getIndex(nums,slow); 
                fast = getIndex(nums, getIndex(nums, fast));
            }
            
            // Optimization 
            slow = i; 
            int val = nums[i];
            while (nums[slow] * val > 0) {
                 int next = getIndex(nums,slow);
                 nums[slow] = 0;
                 slow = next;
            }
        }
        return false;
        
    }
}