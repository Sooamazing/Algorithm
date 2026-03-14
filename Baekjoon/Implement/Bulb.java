package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 26-03-14 10min
// https://www.acmicpc.net/problem/21918
public class Bulb {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int bulb = Integer.parseInt(st.nextToken());
        int command = Integer.parseInt(st.nextToken());
        boolean[] bulbs = new boolean[bulb + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= bulb; i++) {
            bulbs[i] = st.nextToken().charAt(0) == '1';
        }

        while (command-- > 0) {
            st = new StringTokenizer(br.readLine());
            int commandType = Integer.parseInt(st.nextToken());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if (commandType == 1) {
                // i 번째 전구의 상태를 x로 변경한다.
                bulbs[first] = second == 1;
            } else if (commandType == 2) {
                // l번째부터 r번째까지의 전구의 상태를 변경한다. (켜져있는 전구는 끄고, 꺼져있는 전구는 킨다.)
                for (int i = first; i <= second; i++) {
                    bulbs[i] = !bulbs[i];
                }
            } else if (commandType == 3) {
                for (int i = first; i <= second; i++) {
                    bulbs[i] = false;
                }
            } else {
                for (int i = first; i <= second; i++) {
                    bulbs[i] = true;
                }
            }
        }

        for (int i = 1; i <= bulb; i++) {
            boolean b = bulbs[i];
            sb.append(b ? '1' : '0').append(' ');
        }

        System.out.println(sb);
    }
}