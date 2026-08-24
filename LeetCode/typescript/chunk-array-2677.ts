// 26-08-24 15min
// https://leetcode.com/problems/chunk-array/description/

type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type Obj = Record<string, JSONValue> | Array<JSONValue>;

function chunk(arr: Obj[], size: number): Obj[][] {
  const total = arr.length;
  const length: number = (arr.length / size);
  const answer = [];
  for (let i = 0; i < length; i++) {
    arr.push([]);
  }

  let index: number = 0;
  for (let i = 0; i < length; i++) {
    const temp = [];
    for (let j = 0; j < size; j++) {
      temp[j] = arr[index++];
      if (index >= total) {
        break;
      }
    }
    answer[i] = temp;
  }

  return answer;
};