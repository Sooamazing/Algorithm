// 26-08-23 5min
// https://leetcode.com/problems/generate-fibonacci-sequence

function* fibGenerator(): Generator<number, any, number> {
  let prev1: number = 0;
  let prev2: number = 1;
  while (true) {
    yield prev1;
    const temp = prev1;
    prev1 = prev2;
    prev2 += temp;
  }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */