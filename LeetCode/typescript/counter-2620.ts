// 26-08-19 5min
// https://leetcode.com/problems/counter

function createCounter(n: number): () => number {

  let num: number = n;

  return function () {
    return num++;
  }
}


/**
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */