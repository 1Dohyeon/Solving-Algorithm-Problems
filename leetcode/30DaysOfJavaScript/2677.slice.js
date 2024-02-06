// 2677. Chunk Array 에서 쓰인 slice 메서드 직접 구현

// start ~ end-1 index의 원소들만 반환
const arrSlice = (arr, start, end) => {
  let output = [];
  for (let i = start; i < end; i++) {
    output.push(arr[i]);
  }
  return output;
};

const arr = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const newArr = arrSlice(arr, 3, 7);
console.log(newArr);
