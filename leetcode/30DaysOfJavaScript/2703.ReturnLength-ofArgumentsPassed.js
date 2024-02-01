/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function (...args) {
  let val = args.length;
  return val;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */
