package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-18 7min
// https://www.acmicpc.net/problem/14489
public class TwoChickens {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bankAccount1 = Integer.parseInt(st.nextToken());
        int bankAccount2 = Integer.parseInt(st.nextToken());
        int chickenPrice = Integer.parseInt(br.readLine());

        int sum = bankAccount1 + bankAccount2;
        if (bankAccount1 + bankAccount2 >= chickenPrice * 2) {
            sum -= chickenPrice * 2;
        }

        System.out.println(sum);
    }
}