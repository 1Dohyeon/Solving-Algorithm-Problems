/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function (n) {
  let value = n;
  console.log(value);
  return function () {
    return value++;
  };
};

createCounter(10);

/**
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */
