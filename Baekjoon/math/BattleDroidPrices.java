package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-11-09 5min
// https://www.acmicpc.net/problem/5361
public class BattleDroidPrices {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
//            블래스터 라이플	$350.34
//            시각 센서	$230.90
//            청각 센서	$190.55
//            팔	$125.30
//            다리	$180.90

            int blasterPrice = Integer.parseInt(st.nextToken()) * 35034;
            int eyePrice = Integer.parseInt(st.nextToken()) * 23090;
            int hearPrice = Integer.parseInt(st.nextToken()) * 19055;
            int armPrice = Integer.parseInt(st.nextToken()) * 12530;
            int legPrice = Integer.parseInt(st.nextToken()) * 18090;

            int sum = blasterPrice + eyePrice
                    + hearPrice + armPrice + legPrice;
            sb.append("$").append(String.format("%.2f", sum / 100.0)).append("\n");
        }

        System.out.println(sb);
    }
}