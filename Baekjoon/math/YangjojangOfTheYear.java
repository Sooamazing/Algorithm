package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-24 4min
// https://www.acmicpc.net/problem/11557
public class YangjojangOfTheYear {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());

        while (total-- > 0) {
            int schoolCount = Integer.parseInt(br.readLine());
            String maxSchool = "";
            int maxKcal = 0;
            for (int i = 0; i < schoolCount; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String schoolName = st.nextToken();
                int kCal = Integer.parseInt(st.nextToken());
                if (kCal > maxKcal) {
                    maxKcal = kCal;
                    maxSchool = schoolName;
                }
            }
            sb.append(maxSchool).append("\n");
        }
        System.out.println(sb);
    }
}