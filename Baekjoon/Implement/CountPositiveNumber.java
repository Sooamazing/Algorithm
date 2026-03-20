package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-20 2min
// https://www.acmicpc.net/problem/14909
public class CountPositiveNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while (st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}