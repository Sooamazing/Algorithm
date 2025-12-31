package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-31 3min
// https://www.acmicpc.net/problem/30224
public class Lucky7 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

//        Print 0 if the number does not contain 7 and is not divisible by 7.
//        Print 1 if the number does not contain 7 but is divisible by 7.
//        Print 2 if the number does contain 7 but is not divisible by 7.
//        Print 3 if the number does contain 7 and is divisible by 7.

        boolean contains7 = number.contains("7");
        boolean divisibleBy7 = Integer.parseInt(number) % 7 == 0;

        if (contains7 && divisibleBy7) {
            System.out.println(3);
        } else if (contains7) {
            System.out.println(2);
        } else if (divisibleBy7) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}