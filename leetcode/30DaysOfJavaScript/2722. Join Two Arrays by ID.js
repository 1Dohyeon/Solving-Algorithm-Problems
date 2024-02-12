/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 *
 * arr1, arr2 를 합치는 거임. id 같으면 2로 덮어씌우기. 애초에 정렬된 채로 입력받기에 따로 후정렬 할 필요 없음
 * arr1을 먼저 object에 2차원 배열 형태로 key=id, value 는 입력받은 배열에 있는 id에 맞게 객체 그 자체를 걍 넣어버림
 * arr2를 넣을 때는 조건을 추가하기 위해서 조건부 연산자를 사용해서 값을 집어넣음
 * ob[e.id] 가 존재한다면 { ...ob[e.id], ...e } 식으로 덮어씌우고 없으면 걍 e 그 자체를 ob[e.id]에 넣어버림
 * ...e 가 아니라 ...ob[e.id], ...e 인 이유는 ...e 를 사용하면 기존 값이 전부 사라지고 덮는거임. 기존 값 요소 중 냅둘 수 있는 거는 냅둬야함.
 */
var join = function (arr1, arr2) {
  const ob = {};
  arr1.forEach((e) => {
    ob[e.id] = e;
  });
  arr2.forEach((e) => {
    ob[e.id] = ob[e.id] ? { ...ob[e.id], ...e } : e;
  });
  return Object.values(ob);
};
