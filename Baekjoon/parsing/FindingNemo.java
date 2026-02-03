package Baekjoon.parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-02-03 5min
// https://www.acmicpc.net/problem/10173
public class FindingNemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line.equals("EOI")) {
                break;
            }
            String lowerLine = line.toLowerCase();
            if (lowerLine.contains("nemo")) {
                sb.append("Found").append('\n');
            } else {
                sb.append("Missing").append('\n');
            }
        }

        System.out.println(sb);
    }
}