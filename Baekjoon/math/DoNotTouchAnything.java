package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-07-06 3min
// https://www.acmicpc.net/problem/13136
public class DoNotTouchAnything {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int cctvSize = Integer.parseInt(st.nextToken());

        System.out.println(
                (long) (row / cctvSize + (row % cctvSize > 0 ? 1 : 0))
                        * (col / cctvSize + (col % cctvSize > 0 ? 1 : 0))
        );

    }
}
