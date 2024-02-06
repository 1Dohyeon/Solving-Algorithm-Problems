/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function (arr, size) {
  const result = [];

  for (let i = 0; i < arr.length; i += size) {
    result.push(arr.slice(i, i + size));
  }

  return result;
};

var chunk2 = function (arr, size) {
  const result = [];

  for (let i = 0; i < arr.length; i += size) {
    result.push(arrSlice(arr, i, i + size));
  }

  return result;
};

const arrSlice = (arr, start, end) => {
  let output = [];
  for (let i = start; i < end; i++) {
    if (arr[i] != null) output.push(arr[i]);
  }
  return output;
};

const arr = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const newArr = arrSlice(arr, 3, 7);
console.log(newArr);
