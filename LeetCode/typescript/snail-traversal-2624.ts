// 26-08-22 12min
// https://leetcode.com/problems/snail-traversal

interface Array<T> {
  snail(rowsCount: number, colsCount: number): number[][];
}


Array.prototype.snail = function (rowsCount: number, colsCount: number): number[][] {
  if (this.length != rowsCount * colsCount) {
    return [];
  }
  // 1차원 배열만 생성
  let arr: number[][] = [];
  // 배열 초기화
  for (let r = 0; r < rowsCount; r++) {
    arr.push([]);
  }
  let index = 0;
  for (let c = 0; c < colsCount; c++) {
    if (c % 2 == 0) {
      for (let r = 0; r < rowsCount; r++) {
        arr[r][c] = this[index++];
      }
      continue;
    }
    for (let r = rowsCount - 1; r >= 0; r--) {
      arr[r][c] = this[index++];
    }
  }
  return arr;
}

/**
 * const arr = [1,2,3,4];
 * arr.snail(1,4); // [[1,2,3,4]]
 */