package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-08-05 35min
// https://www.acmicpc.net/problem/10812
public class ChangingTheOrderOfTheBasket {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int basket = Integer.parseInt(st.nextToken());
        int rotateNum = Integer.parseInt(st.nextToken());
        int[] baskets = new int[basket];
        for (int i = 0; i < basket; i++) {
            baskets[i] = i + 1;
        }

        for (int i = 0; i < rotateNum; i++) {
            st = new StringTokenizer(br.readLine());
            int beginIndex = Integer.parseInt(st.nextToken()) - 1;
            int endIndex = Integer.parseInt(st.nextToken()) - 1;
            int midIndex = Integer.parseInt(st.nextToken()) - 1;

            // begin, end, mid 다 같을 때 -> 바뀌지 않음.
            if (beginIndex == endIndex) {
                continue;
            }
            // begin, mid 같을 때 -> 바뀌지 않음.
            if (beginIndex == midIndex) {
                continue;
            }

            int[] fromBeginCopy = Arrays.copyOfRange(baskets, beginIndex, midIndex);
            int[] toEndCopy = Arrays.copyOfRange(baskets, midIndex, endIndex + 1);
            int currentIndex = 0;
            boolean isTurnFromBegin = false;
            for (int j = beginIndex; j <= endIndex; j++) {
                if (currentIndex < toEndCopy.length && !isTurnFromBegin) {
                    baskets[j] = toEndCopy[currentIndex++];
                    continue;
                }
                if (currentIndex == toEndCopy.length && !isTurnFromBegin) {
                    currentIndex = 0;
                    isTurnFromBegin = true;
                }
                baskets[j] = fromBeginCopy[currentIndex++];
            }
        }

        for (int j : baskets) {
            sb.append(j).append(" ");
        }

        System.out.println(sb);
    }
}