package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-31 8min
// https://www.acmicpc.net/problem/24736
public class FootballScoring {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = getCount(br);
        int second = getCount(br);

        System.out.println(first + " " + second);
    }

    private static int getCount(BufferedReader br) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        count += Integer.parseInt(st.nextToken()) * 6;
        count += Integer.parseInt(st.nextToken()) * 3;
        count += Integer.parseInt(st.nextToken()) * 2;
        count += Integer.parseInt(st.nextToken()) * 1;
        count += Integer.parseInt(st.nextToken()) * 2;

        return count;
    }
}