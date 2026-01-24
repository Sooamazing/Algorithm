package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 26-01-24 7min
// https://www.acmicpc.net/problem/28074
public class Mobis {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        Set<Character> set = new HashSet<>(Set.of('M', 'O', 'B', 'I', 'S'));

        for (char c : word.toCharArray()) {
            if (set.isEmpty()) {
                break;
            }
            set.remove(c);
        }

        System.out.println(set.isEmpty() ? "YES" : "NO");
    }
}