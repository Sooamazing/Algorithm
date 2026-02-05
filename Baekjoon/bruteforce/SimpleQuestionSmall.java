package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-05 5min
// https://www.acmicpc.net/problem/25494
public class SimpleQuestionSmall {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int count = 0;
            for (int x = 1; x <= a; x++) {
                for (int y = 1; y <= b; y++) {
                    for (int z = 1; z <= c; z++) {
                        int xModY = x % y;
                        int yModZ = y % z;
                        int zModX = z % x;
                        if (xModY == yModZ && yModZ == zModX) {
                            count++;
                        }
                    }
                }
            }
            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}