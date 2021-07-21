class Merge {
     //time:O(m+n)
    //space:O(1)
    //did it run successfully on leetcode: yes
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      //initializing pointer1, pointer2 and index
      int pt1 = m-1; 

      int pt2 = n-1;

      int index = m+n-1;
    //until both pointer one and two is greater equal to zero
      while(pt2 >= 0 && pt1 >= 0){
        //element at pointer 2 greater than element at pointer 1
         if(nums2[pt2] > nums1[pt1]){
            //update element at index
              nums1[index] = nums2[pt2];
            //update pointer 2
              pt2--;
    //element at pointer 2 smaller or equal to element at pointer 1
          } else{
             //update element at index
              nums1[index] = nums1[pt1];
            //update pointer 1
              pt1--;

          }
        //decreemnt index
          index--;

      }
    //until pointer2 greater equal to zero
      while(pt2>=0){
        //update element at index
          nums1[index] = nums2[pt2];
          //decrease pointer2 and index  
          pt2--;

          index--;

      }
    }
}