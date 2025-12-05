package Baekjoon.parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-05 20min
// https://www.acmicpc.net/problem/16171
// 반례: https://www.acmicpc.net/board/view/29585
public class IDontHaveManyFriends {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String book = br.readLine();
        String keyword = br.readLine();
        for (int i = 0; i < 10; i++) {
            book = book.replaceAll(String.valueOf(i), "");
        }

        System.out.println(book.contains(keyword) ? 1 : 0);

//        boolean shoudSequencial = false;
//        boolean isFound = false;
//        int keywordIndex = 0;
//        for (int i = 0; i < book.length(); i++) {
//            char ch = book.charAt(i);
//            if (ch >= '0' && ch <= '9') {
//                continue;
//            }
//
//            if (!shoudSequencial && ch == keyword.charAt(keywordIndex)) {
//                keywordIndex++;
//                shoudSequencial = true;
//                if (keywordIndex == keyword.length()) {
//                    isFound = true;
//                    break;
//                }
//            } else if (shoudSequencial) {
//                if (ch == keyword.charAt(keywordIndex)) {
//                    keywordIndex++;
//                    if (keywordIndex == keyword.length()) {
//                        isFound = true;
//                        break;
//                    }
//                } else {
//                    shoudSequencial = false;
//                    keywordIndex = 0;
//                }
//            }
//        }
//        System.out.println(isFound ? 1 : 0);
    }
}