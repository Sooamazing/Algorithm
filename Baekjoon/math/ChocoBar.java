package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-21 3min
// https://www.acmicpc.net/problem/27959
public class ChocoBar {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int hundred = Integer.parseInt(st.nextToken());
    int chocoBar = Integer.parseInt(st.nextToken());

    boolean isPossible = hundred * 100 / chocoBar > 0;
    System.out.println(isPossible ? "Yes" : "No");
  }
}
