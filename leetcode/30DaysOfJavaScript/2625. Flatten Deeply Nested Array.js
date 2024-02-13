/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
  if (n <= 0) return arr;

  const output = [];
  for (const i of arr) {
    if (Array.isArray(i)) {
      output.push(...flat(i, n - 1));
    } else {
      output.push(i);
    }
  }

  return output;
};
