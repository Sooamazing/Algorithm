// 26-08-26 10min
// https://leetcode.com/problems/apply-transform-over-each-element-in-array

function map(arr: number[], fn: (n: number, i: number) => number): number[] {
  const temp = Array.from(arr);
  for (let i = 0; i < temp.length; i++) {
    temp[i] = fn(arr[i], i);
  }

  return temp;
}