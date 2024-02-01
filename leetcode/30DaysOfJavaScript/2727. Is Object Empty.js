/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function (obj) {
  //   if (!obj) return true;
  //   else return false;
  // 위 방법은 null, undefined, 또는 빈 객체인지 여부를 확인하지 않는다.
  for (const _ in obj) return false;
  return true;
};
