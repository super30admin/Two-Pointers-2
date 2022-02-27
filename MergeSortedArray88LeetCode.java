//Time Complexity: O(m+n)
//Space Complexity: O(1)
//didn't face any problems
//runs successfully


public class MergeSortedArray88LeetCode {



        public void merge(int[] nums1, int m, int[] nums2, int n) {


            int i = m-1;                                //size of nums1
            int j = n-1;                                //size of num2

//         for(int k=m+n-1; k>=0 && j>=0; --k){


//             if(i>=0 && nums1[i]>nums2[j]){

//                 nums1[k] = nums1[i];
//                 i--;
//             }
//             else{
//                 nums1[k] = nums2[j];
//                 j--;
//             }
//         }

            int k = m+n-1;                              //maintaing a index

            while(i>=0 && j>=0){                        //check if nums1 and nums2 pointer is greater to zero

                if(nums1[i]>nums2[j]){                  //check which element is greater
                    nums1[k] = nums1[i];                //whichever is greater add element to nums1 array and decrement that array index
                    i--;
                }
                else{
                    nums1[k] = nums2[j];
                    j--;
                }
                k--;                                    //decrement the inserting pointer
            }

            while(j>=0){                                //check if remaining element is present in num2
                nums1[k] = nums2[j];                    //if so then simply paste into num1
                k--;                                    //decrement the pointers
                j--;
            }

//         while(i>=0){
//             nums1[k] = nums1[i];
//             k--;
//             i--;
//         }


        }


}
