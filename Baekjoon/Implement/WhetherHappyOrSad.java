package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-06 3min
// https://www.acmicpc.net/problem/10769
public class WhetherHappyOrSad {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message = br.readLine();
        int happyCount = 0;
        int sadCount = 0;
        int length = message.length();
        message = message.replaceAll(":-\\)", "");
        happyCount = (length - message.length()) / 3;
        length = message.length();
        message = message.replaceAll(":-\\(", "");
        sadCount = (length - message.length()) / 3;

        if (happyCount == 0 && sadCount == 0) {
            System.out.println("none");
        } else if (happyCount > sadCount) {
            System.out.println("happy");
        } else if (happyCount < sadCount) {
            System.out.println("sad");
        } else {
            System.out.println("unsure");
        }
    }
}