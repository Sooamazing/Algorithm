package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-08-22 10min
// https://www.acmicpc.net/problem/2702
public class Elementary6Math {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            // 최소공배수(lcm)와 최대공약수(gcd)
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstNumber = Integer.parseInt(st.nextToken());
            int secondNumber = Integer.parseInt(st.nextToken());
            sb.append(getLcm(firstNumber, secondNumber)).append(" ")
                    .append(getGcd(firstNumber, secondNumber)).append('\n');
        }

        System.out.println(sb);
    }

    private static long getLcm(int firstNumber, int secondNumber) {

        int max = firstNumber > secondNumber ? firstNumber : secondNumber;

        long multiple = max;
        while (true) {
            if (multiple % firstNumber == 0 && multiple % secondNumber == 0) {
                return multiple;
            }
            multiple += max;
        }
    }

    private static int getGcd(int firstNumber, int secondNumber) {

        int max = firstNumber > secondNumber ? firstNumber : secondNumber;

        for (int i = max; i > 0; i--) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                return i;
            }
        }
        return 1;
    }
}