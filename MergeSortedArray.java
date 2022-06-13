//Time Complexity: O(m+n)
//Space Complexity: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //[1, 2, 3[p1], 0, 0, 0[i]]
        //[2, 5, 6[p2]]
    
        //p1 and p2 pointing to the ends of both the arrays
        int p1 = m - 1;
        int p2 = n - 1;
        
        for(int i = m + n - 1; i >= 0; i--)
        {
            //once we place all the elements from nums2 to their correct sorted places in nums1, then we can break the loop and end the program
            if(p2 < 0)
            {
                return;
            }
            
            //first we check to make sure that p1 has not went out of bounds
            //second we check if the element at p1 is larger than the one at p2 
            if(p1 >= 0 && nums1[p1] > nums2[p2])
            {
                //place the larger element at the location of i
                nums1[i] = nums1[p1];
                //we have already dealt with the element at p1 so we will move p1 to the left
                p1--;
                //Example:
                //[1, 2, 3[p1], 0[i], 5, 6]
                //[2[p2], 5, 6]
                //----->
                //[1, 2[p1], 3[i], 3, 5, 6]
                //[2[p2], 5, 6]
            }
            
            //if the element at p2 is larger than p1
            else
            {
                //place the larger element at the location of i
                nums1[i] = nums2[p2];
                //we have already dealt with the element at p1 so we will move p2 to the left
                p2--;
                //Example:
                //[1, 2, 3[p1], 0, 0, 0[i]]
                //[2, 5, 6[p2]]
                //--->
                //[1, 2, 3[p1], 0, 0[i], 6]
                //[2, 5[p2], 6]
            }
        }  
    }
}



//WHILE LOOP SOLUTION
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
        
//         int p1 = m - 1;
//         int p2 = n - 1;
        
//         int idx = m + n - 1;
        
//         //for(int i = idx; i >= 0; i--)
//         while(p1 >= 0 && p2 >= 0)
//         {
//             if(nums1[p1] > nums2[p2])
//             {
//                 nums1[idx] = nums1[p1];
//                 p1--; idx--;
//             }
//             else
//             { 
//                 nums1[idx] = nums2[p2];
//                 p2--; idx--;
//             }
//         }
        
//         while(p2 >= 0)
//         {
//             nums1[idx] = nums2[p2];
//             p2--; idx--;
//         }
        
        
//     }
// }