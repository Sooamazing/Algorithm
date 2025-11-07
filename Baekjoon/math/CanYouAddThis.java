package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 25-11-07 3min
// https://www.acmicpc.net/problem/7891
public class CanYouAddThis {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger a = new BigInteger(st.nextToken());
            BigInteger b = new BigInteger(st.nextToken());
            sb.append(a.add(b)).append("\n");
        }

        System.out.println(sb);
    }
}