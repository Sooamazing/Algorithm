package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-04-08 5min
// https://www.acmicpc.net/problem/3733
public class Shares {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            StringTokenizer st = new StringTokenizer(line);
            int person = Integer.parseInt(st.nextToken()) + 1;
            int shares = Integer.parseInt(st.nextToken());
            sb.append(
                    shares / person
            ).append('\n');
        }
        System.out.println(sb);
    }
}