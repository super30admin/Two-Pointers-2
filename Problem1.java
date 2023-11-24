
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english


class Problem1 {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;
        int k = 2;
        int count = 1;
        
        while(fast < nums.length){
            if(nums[slow] == nums[fast]){
                count++;
            }else{
                count = 1;
               
            }
            
            if(count <= k){
                slow++;
                nums[slow] = nums[fast];       
            }
            fast++;
        }
        
        return slow +1;
    }

    public static void main(String[] arg) {
        int[] nums = new int[]{0,0,1,1,1,1,2,3,3};
        int result = removeDuplicates(nums);
        System.out.println(result);

        // for (int num : nums) {
        //     System.out.print(num + " ");
        // }
    }
    
}