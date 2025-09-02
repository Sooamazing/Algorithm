package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-09-02 3min
// https://www.acmicpc.net/problem/10768
public class SpecialDay {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        if (month > 2) {
            System.out.println("After");
        } else if (month < 2) {
            System.out.println("Before");
        } else {
            if (day > 18) {
                System.out.println("After");
            } else if (day < 18) {
                System.out.println("Before");
            } else {
                System.out.println("Special");
            }
        }
    }
}