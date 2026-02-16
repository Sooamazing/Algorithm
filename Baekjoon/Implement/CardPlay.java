package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-16 5min
// https://www.acmicpc.net/problem/2511
public class CardPlay {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int aWin = 0;
        int bWin = 0;
        boolean isLastWinnerA = false;
        for (int i = 0; i < 10; i++) {
            int aCard = Integer.parseInt(st1.nextToken());
            int bCard = Integer.parseInt(st2.nextToken());

            if (aCard > bCard) {
                aWin += 3;
                isLastWinnerA = true;
            } else if (aCard < bCard) {
                bWin += 3;
                isLastWinnerA = false;
            } else {
                aWin++;
                bWin++;
            }
        }

        sb.append(aWin).append(' ').append(bWin).append('\n');
        if (aWin == bWin && aWin == 10) {
            sb.append("D");
        } else if (aWin > bWin || (aWin == bWin && isLastWinnerA)) {
            sb.append("A");
        } else {
            sb.append("B");
        }
        System.out.println(sb);
    }
}