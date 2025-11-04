package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-11-04 5min
// https://www.acmicpc.net/problem/10886
public class ZeroIsNotCuteAndOneIsCute {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append("Junhee is ");

        int total = Integer.parseInt(br.readLine());

        int cuteCount = 0;
        while (total-- > 0) {
            boolean isNotCute = br.readLine().charAt(0) == '0';
            cuteCount += isNotCute ? -1 : +1;
        }

        sb.append(cuteCount > 0 ? "" : "not ").append("cute!");
        System.out.println(sb);
    }
}