package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-15 20min
// https://www.acmicpc.net/problem/11944
public class NN {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        String number = st.nextToken();
        int maxCount = Integer.parseInt(number);
        int numberLength = number.length();
        int maxLength = Integer.parseInt(st.nextToken());

        int minLength = Math.min(maxCount * numberLength, maxLength);

        for (int i = numberLength; i <= minLength; i += numberLength) {
            sb.append(number);
        }

        for (int i = 0; minLength == maxLength && (i < maxLength % numberLength); i++) {
            sb.append(number.charAt(i));
        }

        System.out.println(sb);
    }
}