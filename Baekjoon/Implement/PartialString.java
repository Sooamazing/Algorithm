package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-08-24 10min
// https://www.acmicpc.net/problem/6550
public class PartialString {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            String part = st.nextToken();
            String whole = st.nextToken();

            int partIdx = 0;
            for (char w : whole.toCharArray()) {
                if (partIdx < part.length() && w == part.charAt(partIdx)) {
                    partIdx++;
                }

                if (partIdx == part.length()) {
                    break;
                }
            }

            if (partIdx == part.length()) {
                sb.append("Yes").append("\n");
            } else {
                sb.append("No").append("\n");
            }
        }

        System.out.println(sb);
    }
}