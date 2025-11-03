package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-11-03 10min
// https://www.acmicpc.net/problem/2935
public class Noise {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String firstNumber = br.readLine();
        char operationSymbol = br.readLine().charAt(0);
        String secondNumber = br.readLine();

        int length1 = firstNumber.length();
        int length2 = secondNumber.length();
        if (operationSymbol == '+') {
            if (length1 == length2) {
                sb.append(2).append("0".repeat(length1 - 1));
            } else {
                int length = Math.max(length1, length2);
                for (int i = length; i > 0; i--) {
                    if (i == length1 || i == length2) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                }
            }
        } else {
            sb.append(1).append("0".repeat((length1 - 1) + (length2 - 1)));
        }

        System.out.println(sb);
    }
}