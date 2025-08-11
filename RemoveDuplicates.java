class Solution {
    public int removeDuplicates(int[] nums) {
        // take read write pointer , read always move , write only when writes
        // if (read -1 == read) counter++
        // if( counter <= 2){
        //     write = read
        //     r++ w++
        // }
        // if(counter > 2 ){
        //     it means duplicate ,if( read-1 != read ) reset coumter = 1
        // }


        int r = 0; int w=0;
        int counter = 1;
        while( r<nums.length ){
            if( r != 0 && nums[r-1] == nums[r] ){
                counter++;
            }
            if( counter <= 2 ){
                nums[w] = nums[r];
                w++;
                r++;
            }
            if( counter > 2 ){ //duplicate found , no need to write those
                r++;
            }
            if( r < nums.length && nums[r-1] != nums[r] ){
                counter = 1; //reset counter so that writing can be done now;
            }
        }
        return w;
    }
}