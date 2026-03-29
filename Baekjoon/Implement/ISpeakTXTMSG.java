package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

// 26-03-29 3min
// https://www.acmicpc.net/problem/6841
public class ISpeakTXTMSG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<String, String> stringStringMap = Map.ofEntries(
                Map.entry("CU", "see you"),
                Map.entry(":-)", "I’m happy"),
                Map.entry(":-(", "I’m unhappy"),
                Map.entry(";-)", "wink"),
                Map.entry(":-P", "stick out my tongue"),
                Map.entry("(~.~)", "sleepy"),
                Map.entry("TA", "totally awesome"),
                Map.entry("CCC", "Canadian Computing Competition"),
                Map.entry("CUZ", "because"),
                Map.entry("TY", "thank-you"), Map.entry("YW", "you’re welcome"),
                Map.entry("TTYL", "talk to you later")
        );

        while (true) {
            String word = br.readLine();
            if (word.equals("TTYL")) {
                sb.append(stringStringMap.get(word)).append('\n');
                break;
            }

            sb.append(stringStringMap.getOrDefault(word, word)).append('\n');
        }

        System.out.println(sb);
    }
}