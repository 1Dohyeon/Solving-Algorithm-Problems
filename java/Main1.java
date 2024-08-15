package whatever.java;

import java.util.HashMap;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Random random = new Random();   // �������� ���� �̱����� Random Ŭ���� �̿�
        int[] scores = new int[50];    // ������ ������ ���� �迭
        double avg = 0;    // scores �迭�� value���� ���. ��� ���� �� �Ҽ����� ���Խ�Ű�� ���� double�� ����
        
        /** key���� 0. 1, 2, 3, ... , 10 ���� �� 11���̰�, 76���� �л��� �ִٸ�,
         * 76/10 = 7 -> �̰��� key�� ã�� value�� +1 �Ͽ� 70���� �л��� ���� ī��Ʈ �� ���� */
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();  // �����뺰 �ο����� ���� hashmap
        for (int i = 0; i <= 10; i++) {
            hashMap.put(i, 0);
        }

        System.out.print("score[]: ");
        for(int i=0; i<scores.length; i++){
            scores[i] = random.nextInt(100);    // 0���� 100������ �������� �迭�� ����
            System.out.print(scores[i] + " ");  // �迭 ���
            avg += scores[i];   // ����� ���ϱ� ���� �ϴ� �迭�� �� �պ��� ����
        }
        System.out.println();   // ��� �������ؼ� ���� ���� �뵵
        System.out.println("Average: " + avg/scores.length);

        int temp = 0;
        for (int score: scores){
            temp = score/10;
            hashMap.put(temp, hashMap.get(temp)+1); // �����뺰 �л� ���� hashMap�� ī��Ʈ
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
