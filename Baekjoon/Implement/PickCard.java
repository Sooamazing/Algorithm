package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-11-17 2min
// https://www.acmicpc.net/problem/16204
public class PickCard {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cards = Integer.parseInt(st.nextToken());
        int front = Integer.parseInt(st.nextToken());
        int back = Integer.parseInt(st.nextToken());

        int total = Math.min(front, back) + (cards - Math.max(front, back));

        System.out.println(total);
    }
}