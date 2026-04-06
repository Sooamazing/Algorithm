ppackage Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 26-04-05 3min
// https://nahwasa.com/entry/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-23235-The-Fastest-Sorting-Algorithm-In-The-World-java
// https://www.acmicpc.net/problem/23235
public class TheFastestSortingAlgorithmInTheWorld {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (true) {
            String s = br.readLine();
            if (s.charAt(0) == '0')
                break;
            n++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(String.format("Case %d: Sorting... done!\n", i));
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
