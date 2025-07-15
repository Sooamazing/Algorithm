package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-07-15 10min
// https://www.acmicpc.net/problem/4458
public class TheFirstLetterInCapitalLetters {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            String currentSentence = br.readLine();
            char firstChar = currentSentence.charAt(0);
            String firstCharUpperCase = Character.toString(firstChar).toUpperCase();
            sb.append(
                    currentSentence.replaceFirst(Character.toString(firstChar), firstCharUpperCase)
            ).append("\n");
        }

        System.out.println(sb);
    }
}