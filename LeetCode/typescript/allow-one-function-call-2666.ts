// 26-08-30 3min
// https://leetcode.com/problems/allow-one-function-call

type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type OnceFn = (...args: JSONValue[]) => JSONValue | undefined

function once(fn: Function): OnceFn {
  let isFirst = true;
  return function (...args) {
    if (!isFirst) {
      return undefined;
    }
    isFirst = false;

    return fn(...args);
  };
}

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */