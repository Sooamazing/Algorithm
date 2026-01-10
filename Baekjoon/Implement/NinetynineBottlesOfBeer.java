package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-01-10 10min
// https://www.acmicpc.net/problem/17293
public class NinetynineBottlesOfBeer {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        for (int i = total; i > 0; i--) {
            if (i == 1) {
                sb.append(i).append(" ")
                        .append("bottle of beer on the wall, ").append(i)
                        .append(" bottle of beer.\n");
            } else {
                sb.append(i).append(" ")
                        .append("bottles of beer on the wall, ").append(i)
                        .append(" bottles of beer.\n");
            }

            if (i == 2) {
                sb.append("Take one down and pass it around, ")
                        .append(i - 1).append(" bottle of beer on the wall.\n");
            } else if (i == 1) {
                sb.append(
                        "Take one down and pass it around, no more bottles of beer on the wall.\n");
            } else {
                sb.append("Take one down and pass it around, ")
                        .append(i - 1).append(" bottles of beer on the wall.\n");
            }
            sb.append('\n');

        }
        sb.append("No more bottles of beer on the wall, no more bottles of beer.\n")
                .append("Go to the store and buy some more, ").append(total).append(" ")
                .append(total > 1 ? "bottles" : "bottle")
                .append(" of beer on the wall.");

        System.out.println(sb);
    }
}