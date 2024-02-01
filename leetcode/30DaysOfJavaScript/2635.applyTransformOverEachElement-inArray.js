/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function (arr, fn) {
  let returnArr = [];

  arr.forEach((e, i) => {
    returnArr.push(fn(e, i));
    console.log(returnArr);
  });

  return returnArr;
};
