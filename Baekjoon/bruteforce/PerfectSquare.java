package Baekjoon.bruteforce;

import java.io.*;
import java.util.*;

// 26-03-11 8min
// https://www.acmicpc.net/problem/status/6131/93/1
public class PerfectSquare {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int diff = Integer.parseInt(br.readLine());

        int count = 0;

        for (int a = 1; a <= 500; a++) {
            int val = a * a - diff;
            
            if (val <= 0) continue;

            int b = (int)Math.sqrt(val);

            if (b * b == val) {
                count++;
            }
        }

        System.out.println(count);
    }
}
