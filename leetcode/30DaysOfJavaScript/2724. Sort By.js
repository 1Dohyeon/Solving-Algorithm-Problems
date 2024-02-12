/**
 * @param {Array} arr
 * @param {Function} fn
 * fn 은 number 만 리턴함.
 * @return {Array}
 *
 * fn에 의해 리턴된 값에 의해 오름차순으로 정렬되어야함.
 * fn(a) - fn(b) 가 음수라면 fn(b)>fn(a) 이므로 a, b 순으로 정렬.
 */
var sortBy = function (arr, fn) {
  const output = arr.sort((a, b) => fn(a) - fn(b));
  return output;
};
