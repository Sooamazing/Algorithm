package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-10-23 10min
// https://www.acmicpc.net/problem/10984
public class GetMeMyCredit {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int semester = Integer.parseInt(br.readLine());
        for (int i = 0; i < semester; i++) {
            int subject = Integer.parseInt(br.readLine());
            double scoreSum = 0;
            int creditSum = 0;
            for (int j = 0; j < subject; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int credit = Integer.parseInt(st.nextToken());
                double grade = Double.parseDouble(st.nextToken());

                creditSum += credit;
                scoreSum += (grade * credit);
            }
            sb.append(creditSum).append(" ")
                    .append(String.format("%.1f", (Math.round((scoreSum / creditSum) * 10) / 10.0)))
                    .append("\n");
        }

        System.out.println(sb);
    }
}