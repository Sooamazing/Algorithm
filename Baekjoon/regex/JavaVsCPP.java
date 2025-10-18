package Baekjoon.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-10-18 35min
// https://www.acmicpc.net/problem/3613
// 반례: https://www.acmicpc.net/board/view/106342
public class JavaVsCPP {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String variable = br.readLine();
        // 둘 다 소문자로 시작해야 함. 한 글자여도 가능함.
        boolean isCPPVariable = variable.matches("^[a-z]+(_[a-z]+)*$");
        boolean isJavaVariable = variable.matches("^[a-z][a-zA-Z]*$");

        String answer = "";
        if (isCPPVariable) {
            answer = convertToJava(variable);
        } else if (isJavaVariable) {
            answer = convertToCPP(variable);
        } else {
            answer = "Error!";
        }
        System.out.println(answer);
    }

    private static String convertToJava(String input) {

        StringBuilder sb = new StringBuilder();

        boolean shouldBeCapital = false;
        for (char c : input.toCharArray()) {
            if (c == '_') {
                shouldBeCapital = true;
                continue;
            }
            if (shouldBeCapital) {
                sb.append(Character.toUpperCase(c));
                shouldBeCapital = false;
                continue;
            }
            sb.append(c);
        }

        return sb.toString();
    }

    private static String convertToCPP(String input) {

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c < 'a' || c > 'z') {
                sb.append('_').append(Character.toLowerCase(c));
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}