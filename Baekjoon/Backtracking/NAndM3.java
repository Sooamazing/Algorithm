package Baekjoon.Backtracking;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NAndM3 {

    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        permutation(0);
        System.out.println(sb);
    }
static ArrayList<Integer> list = new ArrayList<>();
    static void permutation(int depth) {
        if (depth == M) {
            for(int i=0;i<M;i++){
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            list.add(i);
            permutation(depth + 1);
            list.remove(depth);
        }
    }
}
