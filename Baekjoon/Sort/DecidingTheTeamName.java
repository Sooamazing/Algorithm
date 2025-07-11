package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 25-07-11 20min
// https://www.acmicpc.net/problem/1296
public class DecidingTheTeamName {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Character> loveSet = Set.of(
                'L',
                'O',
                'V',
                'E'
        );
        Map<Character, Integer> yeonduCountMap = new HashMap<>();
        for (char c : loveSet) {
            yeonduCountMap.put(c, 0);
        }

        String yeondu = br.readLine();
        for (char c : yeondu.toCharArray()) {
            if (loveSet.contains(c)) {
                yeonduCountMap.put(c, yeonduCountMap.get(c) + 1);
            }
        }

        int total = Integer.parseInt(br.readLine());
        int maxScore = 0;
        String answerTeamName = "ZZZZZZZZZZZZZZZZZZZZ";
        // ((L+O) × (L+V) × (L+E) × (O+V) × (O+E) × (V+E)) mod 100
        for (int i = 0; i < total; i++) {
            String candidateTeamName = br.readLine();
            Map<Character, Integer> candidateCountMap = new HashMap<>(yeonduCountMap);
            for (char c : candidateTeamName.toCharArray()) {
                if (loveSet.contains(c)) {
                    candidateCountMap.put(c, candidateCountMap.get(c) + 1);
                }
            }

            int score = (((candidateCountMap.get('L') + candidateCountMap.get('O')) *
                    (candidateCountMap.get('L') + candidateCountMap.get('V')) *
                    (candidateCountMap.get('L') + candidateCountMap.get('E'))) % 100 *
                    (candidateCountMap.get('O') + candidateCountMap.get('V')) *
                    (candidateCountMap.get('O') + candidateCountMap.get('E')) *
                    (candidateCountMap.get('V') + candidateCountMap.get('E'))) % 100;
            if (score > maxScore) {
                maxScore = score;
                answerTeamName = candidateTeamName;
            } else if (score == maxScore) {
                // 순서
                if (candidateTeamName.compareTo(answerTeamName) < 0) {
                    answerTeamName = candidateTeamName;
                }
            }
        }
        System.out.println(answerTeamName);
    }
}
