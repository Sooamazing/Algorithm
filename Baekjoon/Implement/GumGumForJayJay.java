package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;


// 26-04-04 3min
// https://www.acmicpc.net/problem/26489
// https://nahwasa.com/entry/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-26489-Gum-Gum-for-Jay-Jay-java
public class GumGumForJayJay {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        while (true) {
            String tmp = br.readLine();
            if (tmp == null) break;
            cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
