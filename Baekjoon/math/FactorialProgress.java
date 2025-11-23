package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

// 25-11-23 7min
// https://www.acmicpc.net/problem/5692
public class FactorialProgress {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Map<Integer, Integer> map = Map.of(
                0, 1,
                1, 2,
                2, 2 * 3,
                3, 2 * 3 * 4,
                4, 2 * 3 * 4 * 5
        );

        while (true) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                break;
            }

            int sum = 0;
            int digit = 0;
            while (number > 0) {
                sum += ((number % 10) * map.get(digit++));
                number /= 10;
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}