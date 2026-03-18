package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;

// 26-03-18 10min
// https://www.acmicpc.net/problem/1864
public class OctopusNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String octopusNumber = br.readLine();

            if (octopusNumber.equals("#")) {
                break;
            }
            int result = 0;
            for (char c : octopusNumber.toCharArray()) {
                result *= 8;
                switch (c) {
                    case '-':
                        result += 0;
                        break;
                    case '\\':
                        result += 1;
                        break;
                    case '(':
                        result += 2;
                        break;
                    case '@':
                        result += 3;
                        break;
                    case '?':
                        result += 4;
                        break;
                    case '>':
                        result += 5;
                        break;
                    case '&':
                        result += 6;
                        break;
                    case '%':
                        result += 7;
                        break;
                    case '/':
                        result += -1;
                }
            }
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }

}