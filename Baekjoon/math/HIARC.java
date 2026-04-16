package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-04-16 3min
// https://www.acmicpc.net/problem/28444
public class HIARC {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(
                Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken())
                        - Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken())
                        * Integer.parseInt(st.nextToken())
        );

    }
}