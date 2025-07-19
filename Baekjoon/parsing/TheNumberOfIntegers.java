package Baekjoon.parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-07-19 3min
// https://www.acmicpc.net/problem/10821
public class TheNumberOfIntegers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] splits = br.readLine().split(",");

        System.out.println(splits.length);
    }
}