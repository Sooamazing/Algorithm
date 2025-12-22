package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

// 25-12-22 10min
// https://www.acmicpc.net/problem/2712
public class AmericanStyle {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> unitMap = Map.of("kg", 2.2046, "lb", 0.4536, "l", 0.2642, "g", 3.7854);

        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double number = Double.parseDouble(st.nextToken());
            String unit = st.nextToken();
            sb.append(String.format("%.4f ", number * unitMap.get(unit)));
            switch (unit) {
                case "kg":
                    sb.append("lb");
                    break;
                case "lb":
                    sb.append("kg");
                    break;
                case "l":
                    sb.append("g");
                    break;
                case "g":
                    sb.append("l");
                    break;
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}