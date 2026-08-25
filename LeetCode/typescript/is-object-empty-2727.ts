// 26-08-25 8min
// https://leetcode.com/problems/is-object-empty

type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type Obj = Record<string, JSONValue> | JSONValue[]

function isEmpty(obj: Obj): boolean {
  const stringify = JSON.stringify(obj);
  if ((stringify.startsWith("{") || stringify.startsWith("[")) && stringify.length === 2) {
    return true;
  }
  return false;
};