package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-07-23 15min
// https://www.acmicpc.net/problem/14582
public class ILostAgainToday {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer geminis = new StringTokenizer(br.readLine());
        StringTokenizer gullivers = new StringTokenizer(br.readLine());
        boolean hasJeminisWon = false;
        int gulliverSum = 0;
        int geminisSum = 0;
        for (int i = 0; i < 9; i++) {
            geminisSum += Integer.parseInt(geminis.nextToken());

            if (gulliverSum < geminisSum) {
                hasJeminisWon = true;
                break;
            }

            gulliverSum += Integer.parseInt(gullivers.nextToken());

            if (gulliverSum < geminisSum) {
                hasJeminisWon = true;
                break;
            }
        }

        System.out.println(hasJeminisWon ? "Yes" : "No");
    }
}