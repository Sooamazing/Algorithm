package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-02-17 3min
// https://www.acmicpc.net/problem/4504
public class FindMultiple {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        while (true) {
            int multiple = Integer.parseInt(br.readLine());
            if (multiple == 0) {
                break;
            }
            sb.append(multiple).append(" is ");
            if (multiple % number != 0) {
                sb.append("NOT ");
            }
            sb.append("a multiple of ").append(number).append('.').append('\n');

        }

        System.out.println(sb);
    }
}