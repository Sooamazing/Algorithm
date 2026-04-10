package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-04-10 5min
// https://www.acmicpc.net/problem/11282
public class Hangeul {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int order = Integer.parseInt(br.readLine()) + '가' - 1;

        System.out.println((char) order);
    }
}