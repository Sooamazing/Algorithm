package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

// 25-07-05 5min
// https://www.acmicpc.net/problem/29731
public class MemeVote2033 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> promises = Set.of(
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        );
        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            String checkSentence = br.readLine();
            if (!promises.contains(checkSentence)) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}
