class RemoveDuplicates {
    //time:O(n)
    //space:O(1)
    //did it run successfully on leetcode: yes
    public int removeDuplicates(int[] nums) {
        
        //initializing prev, slow, fast and flag
        int prev=0;

       int slow=1;

       int fast=1;

       int flag=0;
    //until fast reaches end of input
       while(fast<nums.length)

       {    
            //if element at fast is equal to element at previous
           if(nums[fast]==nums[prev])

           {
             //if not flag
               if(flag==0)

               {
                //set element at slow equal to element at fast
                   nums[slow]=nums[fast];
                //increement slow, fast and mark flag
                   slow++;

                   fast++;

                   flag=1;

               }//if flag

               else

               {
                //increase fast
                   fast++;

               }

           }
        //if element at fast is not equal to element at previous
           else

           {
            //update prev
               prev=fast;
            //update elemnt at slow
               nums[slow]=nums[fast];
            //increement slow and fast pointer
               slow++;

               fast++;
            //unmark flag
               flag=0;

           }

       }

       return slow;
    }
}