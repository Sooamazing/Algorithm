package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-03-30 5min
// https://www.acmicpcnet/problem/9243
public class PerfectFileDelete {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean shouldChange = Integer.parseInt(br.readLine()) % 2 != 0;

        String original = br.readLine();
        String changed = br.readLine();
        boolean success = true;
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            if (shouldChange) {
                if (c == changed.charAt(i)) {
                    success = false;
                    break;
                }
            } else {
                if (c != changed.charAt(i)) {
                    success = false;
                    break;
                }
            }
        }

        System.out.println(success ? "Deletion succeeded" : "Deletion failed");
    }
}