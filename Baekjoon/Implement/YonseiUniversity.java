package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-02-09 1min
// https://www.acmicpc.net/problem/15680
public class YonseiUniversity {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (Integer.parseInt(br.readLine()) == 0) {
            System.out.println("YONSEI");
        } else {
            System.out.println("Leading the Way to the Future");
        }
    }
}