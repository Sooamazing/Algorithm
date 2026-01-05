package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-01-05 5min
// https://www.acmicpc.net/problem/14910
public class Uphill {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean isUphill = true;
        int prev = Integer.parseInt(st.nextToken());
        while (st.hasMoreTokens()) {
            int current = Integer.parseInt(st.nextToken());
            if (current < prev) {
                isUphill = false;
                break;
            }
            prev = current;
        }

        System.out.println(isUphill ? "Good" : "Bad");
    }
}