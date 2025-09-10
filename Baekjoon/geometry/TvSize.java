package Baekjoon.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-10 10min
// https://www.acmicpc.net/problem/1297
public class TvSize {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int diagonal = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        double multiple = (diagonal) / Math.pow(height * height + width * width, 0.5);

        System.out.println((int) (multiple * height) + " " + (int) (multiple * width));
    }
}