package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-06-20 5min
// https://www.acmicpc.net/problem/1568
public class Bird {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int total = Integer.parseInt(br.readLine());
    int time = 0;
    int currentIndex = 1;
    while (total != 0) {
      if (total < currentIndex) {
        currentIndex = 1;
        continue;
      }
      total -= currentIndex;
      time++;

      currentIndex++;
    }

    System.out.println(time);
  }
}
