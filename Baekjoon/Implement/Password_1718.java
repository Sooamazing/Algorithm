package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-04-26 10min
// https://www.acmicpc.net/problem/1718
public class Password_1718 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String plain = br.readLine();
        String encryptKey = br.readLine();

        int plainLength = plain.length();
        int encryptKeyLength = plain.length();
        for (int i = 0; i < encryptKeyLength; i++) {
            char plainChar = plain.charAt(i);
            if (plainChar == ' ') {
                sb.append(' ');
                continue;
            }
            char encryptKeyChar = encryptKey.charAt(i % encryptKey.length());
            char decryptChar = (char) ((plainChar - encryptKeyChar + 26 - 1) % 26 + 'a');
            sb.append(decryptChar);
        }

        System.out.println(sb);
    }
}