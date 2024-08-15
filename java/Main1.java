package whatever.java;

import java.util.HashMap;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Random random = new Random();   // 랜덤으로 수를 뽑기위해 Random 클래스 이용
        int[] scores = new int[50];    // 무작위 점수를 담을 배열
        double avg = 0;    // scores 배열의 value들의 평균. 평균 구할 때 소수점도 포함시키기 위해 double로 선언
        
        /** key값은 0. 1, 2, 3, ... , 10 까지 총 11개이고, 76점인 학생이 있다면,
         * 76/10 = 7 -> 이값의 key를 찾아 value에 +1 하여 70점대 학생의 수를 카운트 할 예정 */
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();  // 점수대별 인원수를 담을 hashmap
        for (int i = 0; i <= 10; i++) {
            hashMap.put(i, 0);
        }

        System.out.print("score[]: ");
        for(int i=0; i<scores.length; i++){
            scores[i] = random.nextInt(100);    // 0부터 100까지의 랜덤수를 배열에 담음
            System.out.print(scores[i] + " ");  // 배열 출력
            avg += scores[i];   // 평균을 구하기 위해 일단 배열의 총 합부터 구함
        }
        System.out.println();   // 출력 지저분해서 한줄 띄우기 용도
        System.out.println("Average: " + avg/scores.length);

        int temp = 0;
        for (int score: scores){
            temp = score/10;
            hashMap.put(temp, hashMap.get(temp)+1); // 점수대별 학생 수를 hashMap에 카운트
        }

        for (int i = 10; i >= 0; i--) {
            if(i==10){
                System.out.printf("  %02d: ", i*10);
            } else {
                System.out.printf("%02d~%02d: ", i*10+9, i*10);
            }
            System.out.print(hashMap.get(i) + " ");
            for (int j = 0; j < hashMap.get(i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
