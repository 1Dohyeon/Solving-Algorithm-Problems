/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function (arr, fn) {
  let returnArr = [];

  arr.forEach((e, i) => {
    if (fn(e, i)) {
      returnArr.push(arr[i]);
    }
  });

  return returnArr;
};
