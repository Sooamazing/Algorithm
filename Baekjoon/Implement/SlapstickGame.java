package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;
import java.util.StringTokenizer;

// 25-10-26 15min
// https://www.acmicpc.net/problem/14696
public class SlapstickGame {

    // 별, 동그라미, 네모, 세모를 각각 숫자 4, 3, 2, 1로 표현
    private static final int STAR = 4;

    private static final int CIRCLE = 3;

    private static final int SQUARE = 2;

    private static final int TRIANGLE = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(br.readLine());
        for (int i = 0; i < round; i++) {
            HashMap<Integer, Integer> aMap = new HashMap<>();
            HashMap<Integer, Integer> bMap = new HashMap<>();
            for (int j = 1; j <= 4; j++) {
                aMap.put(j, 0);
                bMap.put(j, 0);
            }

            StringTokenizer st = new StringTokenizer(br.readLine());
            int total = Integer.parseInt(st.nextToken());
            for (int j = 0; j < total; j++) {
                int key = Integer.parseInt(st.nextToken());
                aMap.put(key, aMap.get(key) + 1);
            }
            st = new StringTokenizer(br.readLine());
            total = Integer.parseInt(st.nextToken());
            for (int j = 0; j < total; j++) {
                int key = Integer.parseInt(st.nextToken());
                bMap.put(key, bMap.get(key) + 1);
            }

//        만약 두 딱지의 별의 개수가 다르다면, 별이 많은 쪽의 딱지가 이긴다.
//        별의 개수가 같고 동그라미의 개수가 다르다면, 동그라미가 많은 쪽의 딱지가 이긴다.
//        별, 동그라미의 개수가 각각 같고 네모의 개수가 다르다면, 네모가 많은 쪽의 딱지가 이긴다.
//        별, 동그라미, 네모의 개수가 각각 같고 세모의 개수가 다르다면, 세모가 많은 쪽의 딱지가 이긴다.
//        별, 동그라미, 네모, 세모의 개수가 각각 모두 같다면 무승부이다.

            if (!Objects.equals(aMap.get(STAR), bMap.get(STAR))) {
                sb.append(aMap.get(STAR) > bMap.get(STAR) ? 'A' : 'B');
            } else if (!Objects.equals(aMap.get(CIRCLE), bMap.get(CIRCLE))) {
                sb.append(aMap.get(CIRCLE) > bMap.get(CIRCLE) ? 'A' : 'B');
            } else if (!Objects.equals(aMap.get(SQUARE), bMap.get(SQUARE))) {
                sb.append(aMap.get(SQUARE) > bMap.get(SQUARE) ? 'A' : 'B');
            } else if (!Objects.equals(aMap.get(TRIANGLE), bMap.get(TRIANGLE))) {
                sb.append(aMap.get(TRIANGLE) > bMap.get(TRIANGLE) ? 'A' : 'B');
            } else {
                sb.append('D');
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}