/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function (obj) {
  // 파라미터로 받은 값이 array일 경우
  if (Array.isArray(obj)) {
    const output = [];
    for (const item of obj) {
      // 원소가 존재한다면, output에 담아야하므로 다음 조건문을 실행
      if (item) {
        // item의 타입이 object라면 재귀호출을 함. 이때 파라미터를 object로 받는 경우는 if (Array.isArray(obj)) 밖에서 구현
        if (typeof item === "object") output.push(compactObject(item));
        // item의 타입이 object가 아니라면 반환할 output에 원소를 담으면 됨.
        else output.push(item);
      }
      // 원소가 존재하지 않는다면 반환할 필요 없으므로 아무런 로직이 없음
    }
    return output;
  }

  // 파라미터가 object 일 경우
  for (const [key, value] of Object.entries(obj)) {
    if (!value) delete obj[key]; // value가 false 일 경우 key와 value 삭제
    else if (typeof value === "object") obj[key] = compactObject(value); // value가 object일 경우 또 재귀호출
  }
  return obj;
};
