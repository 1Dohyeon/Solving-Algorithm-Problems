/**
 * 이 문제는 주어진 array를 fn에 맞도록 그룹화를 하는 것이다.
 * 쉽게말해서 파라미터로 받은 함수에 array 원소를 집어넣고 나온 값을 key로 하는 그룹(배열)을 나누는 것이다.
 * 따라서 원소를 fn() 에 넣어서 나온 값을 const key 로 받고, result[key] 가 존재하지 않는다면 새로 만들어준 후, 원소를 push 해주면 된다.
 * result[key] 가 존재한다면 그냥 바로 push 해주면 된다.
 *
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function (fn) {
  const result = {};

  this.forEach((e) => {
    const key = fn(e);
    if (!result[key]) result[key] = [];
    result[key].push(e);
  });

  return result;
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */
