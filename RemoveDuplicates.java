// TC - O(n)
// SC - O(1)

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }

        int j= 1;
        int count = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }

            if(count <= 2){
                
                nums[j] = nums[i];
                j++;
                System.out.println(nums[j-1]);
            }
        }
        return j;
    }
    public static void main(String[] args) {
        RemoveDuplicates remover = new RemoveDuplicates();
        
        int[] nums = {1, 1, 1, 2, 2, 3};
        
        int newSize = remover.removeDuplicates(nums);
        
        System.out.println("New Size of Array: " + newSize);
        System.out.print("Updated Array: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}