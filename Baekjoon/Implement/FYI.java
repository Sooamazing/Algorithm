package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-28 2min
// https://www.acmicpc.net/problem/17863
public class FYI {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        if (number.length() == 7 && number.startsWith("555")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}