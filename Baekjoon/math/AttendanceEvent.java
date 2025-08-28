package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-08-28 20min
// https://www.acmicpc.net/problem/25704
public class AttendanceEvent {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int coupon = Integer.parseInt(br.readLine());
        int price = Integer.parseInt(br.readLine());

        int discountPrice = 0;
        if (coupon < 5) {
            discountPrice = 0;
        } else if (coupon < 10) {
            discountPrice = 500;
        } else if (coupon < 15) {
            if (price < 5000) {
                discountPrice = 500;
            } else {
                discountPrice = price / 10;
            }
        } else if (coupon < 20) {
            if (price < 20000) {
                discountPrice = 2000;
            } else {
                discountPrice = price / 10;
            }
        } else {
            if (price < 8000) {
                discountPrice = 2000;
            } else {
                discountPrice = price / 4;
            }
        }

        System.out.println(Math.max(price - discountPrice, 0));
    }
}