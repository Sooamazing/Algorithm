package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-08-18 10min
// https://www.acmicpc.net/problem/1356
public class ExistNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        boolean isRight = false;
        for (int i = 0; i < number.length() - 1; i++) {
            String left = number.substring(0, i + 1);
            String right = number.substring(i + 1);

            int leftNumber = getNumberMultiply(left);
            int rightNumber = getNumberMultiply(right);

            if (leftNumber == rightNumber) {
                isRight = true;
                break;
            }

        }

        System.out.println(isRight ? "YES" : "NO");
    }

    private static int getNumberMultiply(String number) {

        int result = 1;
        for (int i = 0; i < number.length(); i++) {
            result *= number.charAt(i) - '0';
        }
        return result;
    }
}