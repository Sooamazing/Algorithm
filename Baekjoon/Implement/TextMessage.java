package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 26-04-20 25min
// https://www.acmicpc.net/problem/2037
public class TextMessage {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int perOne = Integer.parseInt(st.nextToken());
        int perSequence = Integer.parseInt(st.nextToken());
        String sentence = br.readLine();
        List<List<Character>> sets = new ArrayList<>();
        sets.add(List.of('A', 'B', 'C'));
        sets.add(List.of('D', 'E', 'F'));
        sets.add(List.of('G', 'H', 'I'));
        sets.add(List.of('J', 'K', 'L'));
        sets.add(List.of('M', 'N', 'O'));
        sets.add(List.of('P', 'Q', 'R', 'S'));
        sets.add(List.of('T', 'U', 'V'));
        sets.add(List.of('W', 'X', 'Y', 'Z'));

        int time = 0;
        int prevListIndex = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == ' ') {
                prevListIndex = -1;
                time += perOne;
                continue;
            }
            int currentListIndex = 0;
            for (int j = 0; j < sets.size(); j++) {
                int press = Collections.binarySearch(sets.get(j), c) + 1;
                if (press > 0) {
                    currentListIndex = j;
                    time += perOne * (press + 1);
                    break;
                }
            }
            if (i == 0) {
                prevListIndex = currentListIndex;
                continue;
            }
            if (prevListIndex == currentListIndex) {
                time += perSequence;
            }
            prevListIndex = currentListIndex;
        }

        System.out.println(time);
    }
}