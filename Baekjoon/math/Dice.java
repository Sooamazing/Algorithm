package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-25 2min
// https://www.acmicpc.net/problem/9295
public class Dice {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int test = Integer.parseInt(br.readLine());
    for (int i = 1; i <= test; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      sb.append("Case ").append(i).append(": ")
          .append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))
          .append("\n");
    }

    System.out.println(sb);
  }
}
