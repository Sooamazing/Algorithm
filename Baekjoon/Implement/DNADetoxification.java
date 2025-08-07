package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-08-07 15min
// https://www.acmicpc.net/problem/1672
public class DNADetoxification {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        String sequence = br.readLine();
        StringBuilder sb = new StringBuilder(sequence);
        while (total > 1) {
            char last = sb.charAt(total - 1);
            char lastPrev = sb.charAt(total - 2);

            if (last == lastPrev) {
                sb.deleteCharAt(total - 1);
            } else if ((last == 'A' && lastPrev == 'G') || (last == 'G' && lastPrev == 'A')) {
                sb.delete(total - 2, total).append("C");
            } else if ((last == 'A' && lastPrev == 'C') || (last == 'C' && lastPrev == 'A')) {
                sb.delete(total - 2, total).append("A");
            } else if ((last == 'A' && lastPrev == 'T') || (last == 'T' && lastPrev == 'A')) {
                sb.delete(total - 2, total).append("G");
            } else if ((last == 'G' && lastPrev == 'C') || (last == 'C' && lastPrev == 'G')) {
                sb.delete(total - 2, total).append("T");
            } else if ((last == 'G' && lastPrev == 'T') || (last == 'T' && lastPrev == 'G')) {
                sb.delete(total - 2, total).append("A");
            } else {
                sb.delete(total - 2, total).append("G");
            }
            total--;
        }
        System.out.println(sb);
    }
}