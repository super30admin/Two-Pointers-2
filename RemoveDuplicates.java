public class RemoveDuplicates {

  public int removeDuplicates(int[] nums) {
    int count = 1;
    int appear = 1;
    for(int i = 1; i < nums.length; i++){
      if(nums[i] == nums[i - 1]){
        if(appear == 1){
          nums[count] = nums[i];
          count++;
          appear++;
        }else if(appear == 2)   continue;
      }else{
        nums[count] = nums[i];
        count++;
        appear = 1;
      }
    }
    return count;
  }
}
