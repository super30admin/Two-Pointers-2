class RemoveDuplicates {
    /* Approach:  Given--> Array is sorted. We can use 2 pointer solution.
    1 pointer to keep track of index where we can store the element and other pointer to go over all the numbers.
        Time complexity : o(n) where n is array length
        space complexity :(1)
        */
    public int removeDuplicates(int[] nums) {
        int slow=0;
        int fast=0;
        //we can have at most 2 same elements
        int k=2;
        //
        int count=0;

        while(fast< nums.length){
            if( slow==0 || nums[fast]==nums[fast-1]){
                count++;

                if(count<=2){
                    nums[slow]=nums[fast];
                    slow++;
                }
                fast++;
                
            }else{
                count=1;
                nums[slow]=nums[fast];
                slow++;
                fast++;
                
            }

        }
        return slow;
        
    }
}
