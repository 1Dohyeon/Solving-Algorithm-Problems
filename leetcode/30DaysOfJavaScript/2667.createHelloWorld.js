/**
 * @return {Function}
 */
var createHelloWorld = function () {
  const result = "Hello World";
  console.log(result);

  return function (...args) {
    return result;
  };
};

createHelloWorld();

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */
