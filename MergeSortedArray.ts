/**
 Do not return anything, modify nums1 in-place instead.
 */
 function merge(nums1: number[], m: number, nums2: number[], n: number): void {

    let p1 = m-1;
    let p2 = n-1;
    let index = (m+n) -1 ; // make index to place of zero

    // compare two elements p1 and p2 
    // if p1 > p2, then index == p1, and index--, p1--
    // else index === p2 and index --, p2--
    while(p1>=0 && p2>=0){
    if (nums1[p1] > nums2[p2]) {
        nums1[index] = nums1[p1];
        p1--;
    } else {
        nums1[index] = nums2[p2];
        p2--;
    } 
    index--;
    }

    while(p2>=0) {
        nums1[index] = nums2[p2];
        p2--;
        index--;
    }
};