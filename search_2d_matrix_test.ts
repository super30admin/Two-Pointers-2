function searchMatrix(matrix: number[][], target: number): boolean {
  let row: number = matrix.length - 1;
  let col: number = 0;

  while (
    row >= 0 &&
    row < matrix.length &&
    col >= 0 &&
    col < matrix[0].length
  ) {
    let cell_value = matrix[row][col];
    if (cell_value == target) {
      return true;
    } else if (cell_value > target) {
      row--;
    } else {
      col++;
    }
  }
  return false;
}

describe("Search In 2D Matrix", () => {
  it("Happy Path", () => {
    let input = [
      [1, 4, 7, 11, 15],
      [2, 5, 8, 12, 19],
      [3, 6, 9, 16, 22],
      [10, 13, 14, 17, 24],
      [18, 21, 23, 26, 30],
    ];
    expect(searchMatrix(input, 5)).toStrictEqual(true);
  });

  it("Negative", () => {
    let input = [
      [1, 4, 7, 11, 15],
      [2, 5, 8, 12, 19],
      [3, 6, 9, 16, 22],
      [10, 13, 14, 17, 24],
      [18, 21, 23, 26, 30],
    ];
    expect(searchMatrix(input, 31)).toStrictEqual(false);
    expect(searchMatrix(input, -1)).toStrictEqual(false);
  });
});
