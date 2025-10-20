package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-10-20 20min
// https://www.acmicpc.net/problem/10804
public class ReversePlacementOfCards {

    private static int SIZE = 20;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] cards = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            int cardNumber = i + 1;
            cards[i] = cardNumber;
        }
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int leftIndex = Integer.parseInt(st.nextToken()) - 1;
            int rightIndex = Integer.parseInt(st.nextToken()) - 1;

            reverse(cards, leftIndex, rightIndex);
        }

        for (int v : cards) {
            sb.append(v).append(" ");
        }

        System.out.println(sb);
    }

    private static void reverse(int[] origin, int leftIndex, int rightIndex) {

        int total = (rightIndex - leftIndex + 1) / 2;
        for (int i = 0; i < total; i++) {
            int temp = origin[leftIndex + i];
            origin[leftIndex + i] = origin[rightIndex - i];
            origin[rightIndex - i] = temp;
        }
    }
}