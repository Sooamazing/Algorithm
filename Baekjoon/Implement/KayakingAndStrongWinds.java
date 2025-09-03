package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-03 45min
// https://www.acmicpc.net/problem/2891
// 반례: 자기자신 - https://www.acmicpc.net/board/view/64318
// 반례: 옆 - https://www.acmicpc.net/board/view/65551
// 반례: 자기자신부터 - https://www.acmicpc.net/board/view/73460
public class KayakingAndStrongWinds {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int total = Integer.parseInt(st.nextToken());
        int[] team = new int[total + 1];
        for (int i = 0; i <= total; i++) {
            team[i] = 1;
        }
        int broken = Integer.parseInt(st.nextToken());
        boolean[] brokens = new boolean[total + 1];
        int couldNotStart = broken;
        int extra = Integer.parseInt(st.nextToken());
        boolean[] extras = new boolean[total + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < broken; i++) {
            int b = Integer.parseInt(st.nextToken());
            brokens[b] = true;
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < extra; i++) {
            int e = Integer.parseInt(st.nextToken());
            if (brokens[e]) {
                brokens[e] = false;
                couldNotStart--;
                continue;
            }
            extras[e] = true;
        }

        boolean flag = true; // 건네준 적 있는지 확인.
        while (flag) {
            flag = false;
            for (int i = 1; i < team.length; i++) {
                if (i == total) {
                    if (extras[i] && brokens[i - 1]) {
                        flag = true;
                        extras[i] = false;
                        brokens[i - 1] = false;
                        couldNotStart--;
                    }
                    continue;
                }

                if (extras[i]) {
                    if (brokens[i - 1] && brokens[i + 1]) {
                        continue;
                    }
                    // 건네줄 곳이 하나인 경우는 바로 건네줄 수 있음.
                    if (brokens[i - 1]) {
                        flag = true;
                        extras[i] = false;
                        brokens[i - 1] = false;
                        couldNotStart--;
                    }
                    if (brokens[i + 1]) {
                        flag = true;
                        extras[i] = false;
                        brokens[i + 1] = false;
                        couldNotStart--;
                    }
                }
            }
        }

        // 양 옆 가능한 것들만 남음.
        for (int i = 1; i < team.length; i++) {
            if (i == total) {
                continue;
            }
            if (extras[i]) {
                // 오른쪽으로 넘겨주기로 함.
                if (brokens[i + 1]) {
                    extras[i] = false;
                    brokens[i + 1] = false;
                    couldNotStart--;
                }
            }
        }

        System.out.println(couldNotStart);
    }
}