package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-08-12 10min
// https://www.acmicpc.net/problem/10709
public class WeatherCaster {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        for (int i = 0; i < row; i++) {
            String line = br.readLine();
            int minutes = 0;
            for (int j = 0; j < col; j++) {
                char current = line.charAt(j);
                if (j == 0) {
                    if (current != 'c') {
                        minutes = -1;
                    }
                    sb.append(minutes).append(' ');
                    continue;
                }
                if (current == '.' && minutes >= 0) {
                    minutes++;
                } else if (current == 'c') {
                    minutes = 0;
                }
                sb.append(minutes).append(' ');
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}