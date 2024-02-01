/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function (functions) {
  return function (x) {
    if (functions.length === 0) {
      return x;
    } else {
      let result = x;
      // fn(x) = f(g(h(x))) -> 배열의 오른쪽부터 계산해야함.
      const reverseFn = functions.reverse();
      reverseFn.forEach((e) => {
        result = e(result);
      });
      return result;
    }
  };
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */
