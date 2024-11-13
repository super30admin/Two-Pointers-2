function removeDuplicates(nums: number[]): number {
  let slow: number = 0;
  let fast: number = 0;
  let count: number = 0;
  let k: number = 2;
  while (fast < nums.length) {
    if (fast > 0 && nums[fast - 1] == nums[fast]) {
      count++;
    } else {
      count = 1;
    }

    if (count <= k) {
      nums[slow] = nums[fast];
      slow++;
    }
    fast++;
  }
  return slow;
}

function removeDuplicatesWithMap(nums: number[]): number {
  let k: number = 2;
  let frequency_map = new Map();
  let min: number | null = null;
  let max: number | null = null;

  for (let index = 0; index < nums.length; index++) {
    if (min == null) {
      min = nums[index];
    } else {
      min = Math.min(min, nums[index]);
    }

    if (max == null) {
      max = nums[index];
    } else {
      max = Math.max(max, nums[index]);
    }

    frequency_map.set(nums[index], (frequency_map.get(nums[index]) || 0) + 1);
  }

  let pointer = 0;
  if (min != null && max != null) {
    for (let number = min; number <= max; number++) {
      let frequency: number = frequency_map.get(number);
      if (frequency > 0) {
        for (
          let index = pointer;
          index < pointer + Math.min(k, frequency);
          index++
        ) {
          nums[index] = number;
        }
        pointer += Math.min(k, frequency);
      }
    }
  }

  return pointer;
}

describe("Remove Duplicates", () => {
  it("Happy Path", () => {
    expect(removeDuplicatesWithMap([1, 1, 1, 2, 2, 3])).toStrictEqual(5);
  });

  it("Happy Path - Complex", () => {
    expect(
      removeDuplicatesWithMap([1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3])
    ).toStrictEqual(5);
  });
});
