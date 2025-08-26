package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-08-26 5min
// https://www.acmicpc.net/problem/11283
public class Hangul2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println((int) br.readLine().charAt(0) - '가' + 1);
    }
}