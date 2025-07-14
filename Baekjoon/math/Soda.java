package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-07-14 10min
// https://www.acmicpc.net/problem/5032
public class Soda {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int had = Integer.parseInt(st.nextToken());
        int found = Integer.parseInt(st.nextToken());
        int need = Integer.parseInt(st.nextToken());

        int result = 0;
        int sum = had + found;
        while (sum >= need) {
            int newGet = sum / need;
            result += newGet;
            sum %= need;
            sum += newGet;
        }

        System.out.println(result);
    }

}