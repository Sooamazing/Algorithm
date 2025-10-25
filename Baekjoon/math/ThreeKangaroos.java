package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-10-25 4min
// https://www.acmicpc.net/problem/2965
public class ThreeKangaroos {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int three = Integer.parseInt(st.nextToken());

        int firstDistance = two - one;
        int secondDistance = three - two;

        int answer = Math.max(firstDistance, secondDistance) - 1;

        System.out.println(answer);

    }
}