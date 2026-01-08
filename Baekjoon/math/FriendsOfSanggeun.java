package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-01-08 3min
// https://www.acmicpc.net/problem/5717
// 참고: https://comain.tistory.com/m/137

public class FriendsOfSanggeun {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //무한루프

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());

            int B = Integer.parseInt(st.nextToken());

            //무한루프 종료

            if (A == 0 && B == 0) {
                break;
            }

            System.out.println(A + B);

        }

    }

}