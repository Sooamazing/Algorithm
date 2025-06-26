package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 25-06-26 5min
// https://www.acmicpc.net/problem/9076
public class TallyOfScores {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int total = Integer.parseInt(br.readLine());

    while (total-- > 0) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < 5; i++) {
        pq.add(Integer.parseInt(st.nextToken()));
      }

      pq.poll();
      int sum = 0;
      int min = pq.poll();
      sum += pq.poll();
      int max = pq.poll();
      if (max - min >= 4) {
        sb.append("KIN\n");
        continue;
      }
      sb.append(sum + min + max).append("\n");
    }

    System.out.println(sb);
  }

}
