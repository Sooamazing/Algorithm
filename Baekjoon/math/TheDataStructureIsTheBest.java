package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-30 10min
// https://www.acmicpc.net/problem/23253
public class TheDataStructureIsTheBest {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int dummy = Integer.parseInt(st.nextToken());

        boolean couldPossible = true;
        Outer:
        for (int i = 0; i < dummy; i++) {
            int dummyTotal = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int prev = 0;
            for (int j = 0; j < dummyTotal; j++) {
                int book = Integer.parseInt(st.nextToken());
                if (j == 0) {
                    prev = book;
                    continue;
                }
                if (book > prev) {
                    couldPossible = false;
                    break Outer;
                }
                prev = book;
            }
        }

        if (couldPossible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}