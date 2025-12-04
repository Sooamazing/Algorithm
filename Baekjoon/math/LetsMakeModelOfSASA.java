package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-12-04 3min
// https://www.acmicpc.net/problem/23825
public class LetsMakeModelOfSASA {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sNumber = Integer.parseInt(st.nextToken());
        int aNumber = Integer.parseInt(st.nextToken());

        System.out.println(Math.min(sNumber / 2, aNumber / 2));
    }
}