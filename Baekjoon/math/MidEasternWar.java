package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-01-29 7min
// https://www.acmicpc.net/problem/4435
public class MidEasternWar {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int battle = Integer.parseInt(br.readLine());

        for (int i = 1; i <= battle; i++) {
//호빗 - 1
//인간 - 2
//엘프 - 3
//드워프 - 3
//독수리 - 4
//마법사 - 10
            StringTokenizer st = new StringTokenizer(br.readLine());
            int gandalf = 1 * Integer.parseInt(st.nextToken())
                    + 2 * Integer.parseInt(st.nextToken())
                    + 3 * Integer.parseInt(st.nextToken())
                    + 3 * Integer.parseInt(st.nextToken())
                    + 4 * Integer.parseInt(st.nextToken())
                    + 10 * Integer.parseInt(st.nextToken());

//사우론의 군대의 점수는 다음과 같다.
//
//오크 - 1
//인간 - 2
//워그(늑대) - 2
//고블린 - 2
//우럭하이 - 3
//트롤 - 5
//마법사 - 10
            st = new StringTokenizer(br.readLine());
            int sauron = 1 * Integer.parseInt(st.nextToken())
                    + 2 * Integer.parseInt(st.nextToken())
                    + 2 * Integer.parseInt(st.nextToken())
                    + 2 * Integer.parseInt(st.nextToken())
                    + 3 * Integer.parseInt(st.nextToken())
                    + 5 * Integer.parseInt(st.nextToken())
                    + 10 * Integer.parseInt(st.nextToken());

            sb.append("Battle ").append(i).append(": ");
            if (gandalf > sauron) {
                sb.append("Good triumphs over Evil");
            } else if (gandalf < sauron) {
                sb.append("Evil eradicates all trace of Good");
            } else {
                sb.append("No victor on this battle field");
            }
            sb.append('\n');
        }

        System.out.println(sb);

    }
}