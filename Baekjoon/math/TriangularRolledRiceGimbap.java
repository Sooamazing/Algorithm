package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-29 5min
// https://www.acmicpc.net/problem/2783
public class TriangularRolledRiceGimbap {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pricePerWeight = Integer.parseInt(st.nextToken());
        int weight = Integer.parseInt(st.nextToken());
        double minPricePerPiece = (double) pricePerWeight / weight;
        int other = Integer.parseInt(br.readLine());
        for (int i = 0; i < other; i++) {
            st = new StringTokenizer(br.readLine());
            pricePerWeight = Integer.parseInt(st.nextToken());
            weight = Integer.parseInt(st.nextToken());
            double otherPricePerPiece = (double) pricePerWeight / weight;
            if (otherPricePerPiece < minPricePerPiece) {
                minPricePerPiece = otherPricePerPiece;
            }
        }

        System.out.println(String.format("%.2f", minPricePerPiece * 1000));
    }
}