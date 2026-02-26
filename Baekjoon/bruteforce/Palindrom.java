package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

// 26-02-26 15min
// https://www.acmicpc.net/problem/8892
public class Palindrom {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());

        while (test-- > 0) {
            int total = Integer.parseInt(br.readLine());
            String[] words = new String[total];
            for (int i = 0; i < total; i++) {
                words[i] = br.readLine();
            }

            boolean isPalindrome = false;
            for (int i = 0; i < total; i++) {
                for (int j = i + 1; j < total; j++) {
                    Optional<String> palindrome = getPalindrome(words[i] + words[j]);

                    if (palindrome.isPresent()) {
                        sb.append(palindrome.get()).append('\n');
                        isPalindrome = true;
                        break;
                    }

                    Optional<String> reversePalindrome = getPalindrome(words[j] + words[i]);
                    if (reversePalindrome.isPresent()) {
                        sb.append(reversePalindrome.get()).append('\n');
                        isPalindrome = true;
                        break;
                    }

                }
                if (isPalindrome) {
                    break;
                }
            }

            if (!isPalindrome) {
                sb.append("0\n");
            }
        }
        System.out.println(sb);
    }

    private static Optional<String> getPalindrome(String word) {

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return Optional.empty();
            }
        }
        return Optional.of(word);
    }
}