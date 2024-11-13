function merge(
  nums1: number[],
  m: number,
  nums2: number[],
  n: number
): number[] {
  let total_length = m + n;

  let num1_pointer = m - 1;
  let num2_pointer = n - 1;
  let position = total_length - 1;
  while (num1_pointer >= 0 && num2_pointer >= 0) {
    if (nums1[num1_pointer] > nums2[num2_pointer]) {
      nums1[position] = nums1[num1_pointer];
      num1_pointer--;
    } else {
      nums1[position] = nums2[num2_pointer];
      num2_pointer--;
    }
    position--;
  }

  while (num1_pointer >= 0) {
    nums1[position] = nums1[num1_pointer];
    num1_pointer--;
    position--;
  }

  while (num2_pointer >= 0) {
    nums1[position] = nums2[num2_pointer];
    num2_pointer--;
    position--;
  }

  return nums1;
}

describe("Merge Sorted Arrays", () => {
  it("Happy Path", () => {
    let lhs: number[] = [1, 2, 3, 0, 0, 0];
    let rhs: number[] = [4, 5, 6];
    expect(merge(lhs, 3, rhs, rhs.length)).toStrictEqual([1, 2, 3, 4, 5, 6]);
  });

  it("Happy Path", () => {
    let lhs: number[] = [1, 2, 3, 0, 0, 0, 0];
    let rhs: number[] = [4, 5, 6, 7];
    expect(merge(lhs, 3, rhs, 4)).toStrictEqual([1, 2, 3, 4, 5, 6, 7]);
  });
});
