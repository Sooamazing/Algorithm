package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-10-07 3min
// https://www.acmicpc.net/problem/15963
public class CASIO {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long need = Long.parseLong(st.nextToken());
        long current = Long.parseLong(st.nextToken());

        if (need == current) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}