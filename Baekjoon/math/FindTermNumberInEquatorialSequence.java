package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-02 10min
// https://www.acmicpc.net/problem/14913
// 참고: https://www.acmicpc.net/board/view/148695
// 등차 수열은 n>=1일 때 성립하므로 n이 1보다 작으면 X
public class FindTermNumberInEquatorialSequence {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int sameDiff = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

//        sameDiff*(n-1)+first = goal;
        if ((goal - first) % sameDiff != 0 || ((goal - first) / sameDiff + 1) < 1) {
            System.out.println('X');
            return;
        }

        System.out.println((goal - first) / sameDiff + 1);
    }
}