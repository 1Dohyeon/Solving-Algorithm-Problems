/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function (promise1, promise2) {
  // await Promise.all : promise1과 promise2가 모두 완료될 때까지 대기
  const [val1, val2] = await Promise.all([promise1, promise2]);
  return val1 + val2;
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */
