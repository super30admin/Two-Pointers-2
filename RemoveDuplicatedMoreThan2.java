//Time Complexity: O(n)
//Space Complexity: O(1)

public class RemoveDuplicatedMoreThan2 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null)
            return 0;
        int diff = 0;
        int j = 0; //keep track of the place where elements has to be inserted
        for(int i=1; i<nums.length; i++){
            //if alternate elements are not equal proceed 
            if(nums[i] != nums[j]) {
                diff = 0;
                if(j > 0 && nums[j-1] == nums[i]) {
                    nums[j] = nums[i];
                    diff++;
                } else {
                    j++;
                    nums[j] = nums[i];   
                }
            } else {
                if(i == nums.length - 1) {
                    nums[j+1] = nums[i];
                }
                diff++;
                //check one and three elements
                if(diff == 1) {
                    j++;
                    if(i + 1 < nums.length && nums[i+1] != nums[j]) {
                        nums[j] = nums[i];
                    }
                }    
            }
        }
        return j+1;        
    }

    public static void main (String[] args) { 
        int[] arr = {1,1,1,1,2,3,4,5,5,6,7,7,7,7};
        System.out.println(removeduplicatesfromarray.removeDuplicates(arr));
    }
}