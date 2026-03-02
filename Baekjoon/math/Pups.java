package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-02 10min
// https://www.acmicpc.net/problem/26575
public class Pups {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double dogs = Double.parseDouble(st.nextToken());
            double food = Double.parseDouble(st.nextToken());
            double price = Double.parseDouble(st.nextToken());

            sb.append(String.format("$%.2f", (food * price * dogs))).append('\n');

        }

        System.out.println(sb);
    }
}