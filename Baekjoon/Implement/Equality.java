package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-12-16 3min
// https://www.acmicpc.net/problem/13985
public class Equality {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        char operator = st.nextToken().charAt(0);
        int second = Integer.parseInt(st.nextToken());
        st.nextToken(); // =

        String answer = "NO";

        switch (operator) {
            case '+':
                if (first + second == Integer.parseInt(st.nextToken())) {
                    answer = "YES";
                }
                break;
            case '-':
                if (first - second == Integer.parseInt(st.nextToken())) {
                    answer = "YES";
                }
                break;
            case '*':
                if (first * second == Integer.parseInt(st.nextToken())) {
                    answer = "YES";
                }
                break;
            case '/':
                if (second != 0 && first / second == Integer.parseInt(st.nextToken())) {
                    answer = "YES";
                }
                break;
        }

        System.out.println(answer);
    }
}