/**
 * @param {Function} fn
 * @return {Function}
 */
// 함수 호출을 최소화 하기 위해서 호출된 인자는 Map에 key-value 형태로 저장
function memoize(fn) {
  const cache = new Map();

  return function (...args) {
    // 인자가 1개, 2개일 경우 나누고, 그 값을 key로 하여 저장 -> 중복 인자를 받으면 함수를 호출할 필요 없이 Map에서 결과를 꺼냄
    const key = args.length > 1 ? `${args[0]}-${args[1]}` : args[0];
    if (cache.has(key)) return cache.get(key);

    const result = fn(...args);
    cache.set(key, result);
    return result;
  };
}

/**
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1
 */
