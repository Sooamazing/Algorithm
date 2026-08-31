// 26-08-31 2min
// https://leetcode.com/problems/to-be-or-not-to-be

type ToBeOrNotToBe = {
  toBe: (val: any) => boolean;
  notToBe: (val: any) => boolean;
};

function expect(val: any): ToBeOrNotToBe {
  return {
    toBe: (temp) => {
      if (val === temp) {
        return true;
      }
      throw "Not Equal";
    },
    notToBe: (temp) => {
      if (val !== temp) {
        return true;
      }
      throw "Equal";
    }
  }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */