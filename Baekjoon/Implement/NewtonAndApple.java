package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-04-13 4min
// https://www.acmicpc.net/problem/13118
public class NewtonAndApple {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] people = new int[4];
        for (int i = 0; i < 4; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int apple = Integer.parseInt(st.nextToken());

        int bingo = 0;
        for (int i = 0; i < 4; i++) {
            if (people[i] == apple) {
                bingo = i + 1;
                break;
            }
        }
        System.out.println(bingo);
    }
}