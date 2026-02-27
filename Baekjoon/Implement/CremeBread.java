package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-27 10min
// https://www.acmicpc.net/problem/28214
public class CremeBread {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int unit = Integer.parseInt(st.nextToken());
        int perUnit = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        int total = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < unit; i++) {
            int notCream = 0;
            for (int j = 0; j < perUnit; j++) {
                boolean notContainsCream = st.nextToken().charAt(0) == '0';
                if (notContainsCream) {
                    notCream++;
                }
            }
            if (notCream < min) {
                total++;
            }
        }

        System.out.println(total);

    }
}