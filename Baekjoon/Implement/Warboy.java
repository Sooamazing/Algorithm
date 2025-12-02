package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-12-02 3min
// https://www.acmicpc.net/problem/26082
public class Warboy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int otherPrice = Integer.parseInt(st.nextToken());
        int otherPerformance = Integer.parseInt(st.nextToken());
        int ourPrice = Integer.parseInt(st.nextToken());
        int ourPerformance = ourPrice * 3 * otherPerformance / otherPrice;
        System.out.println(ourPerformance);
    }
}