package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-11-19 3min
// https://www.acmicpc.net/problem/26766
public class Serca {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        for (int i = 0; i < total; i++) {
            sb.append(" @@@   @@@ \n"
                    + "@   @ @   @\n"
                    + "@    @    @\n"
                    + "@         @\n"
                    + " @       @ \n"
                    + "  @     @  \n"
                    + "   @   @   \n"
                    + "    @ @    \n"
                    + "     @     \n");
        }

        System.out.println(sb);
    }
}