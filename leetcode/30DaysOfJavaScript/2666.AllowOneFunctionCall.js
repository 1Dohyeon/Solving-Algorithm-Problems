/**
 * @param {Function} fn
 * @return {Function}
 */

// 한 번만 호출 가능
var once = function (fn) {
  let called = false;

  return function () {
    if (!called) {
      called = true;
      let result;

      result = fn.apply(this, arguments);
      return result;
    } else {
      return undefined;
    }
  };
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
