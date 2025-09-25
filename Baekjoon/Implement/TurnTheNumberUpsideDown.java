package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-09-25 15min
// https://www.acmicpc.net/problem/3062
public class TurnTheNumberUpsideDown {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());

        while (total-- > 0) {
            String number = br.readLine();
            int sum = 0;
            int length = number.length();
            for (int i = 0; i < length; i++) {
                sum *= 10;
                sum += (number.charAt(i) - '0') + (number.charAt(length - 1 - i) - '0');
            }

            String sumStr = String.valueOf(sum);
            boolean isPalindrome = true;
            int sumLength = sumStr.length();
            for (int i = 0; i < sumLength / 2; i++) {
                if (sumStr.charAt(i) != sumStr.charAt(sumLength - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            sb.append(isPalindrome ? "YES" : "NO").append("\n");

        }

        System.out.println(sb);
    }
}