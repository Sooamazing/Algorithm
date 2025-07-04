package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-07-04 5min
// https://www.acmicpc.net/problem/10179
public class Coupon {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            double originalPrice = Double.parseDouble(br.readLine());
            double discountedPrice = originalPrice * 0.8;
            sb.append("$").append(String.format("%.2f", discountedPrice)).append("\n");
        }

        System.out.println(sb);
    }

}
