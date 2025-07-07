package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-07-07 15min
// https://www.acmicpc.net/problem/5218
public class AlphabetStreet {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("Distances: ");

            String first = st.nextToken();
            String second = st.nextToken();

            for (int i = 0; i < first.length(); i++) {
                int result = second.charAt(i) - first.charAt(i);
                sb.append(
                        (result >= 0 ? result : 26 + result)
                ).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

}
