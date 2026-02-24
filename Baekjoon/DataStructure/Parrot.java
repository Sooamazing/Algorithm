package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 26-02-24 50min
// https://www.acmicpc.net/problem/14713
public class Parrot {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        List<Queue<String>> parrots = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            String parrot = br.readLine();
            Queue<String> queue = new LinkedList<>(
                    List.of(parrot.split(" "))
            );
            parrots.add(queue);
        }
        String pps789 = br.readLine();
        boolean possible = true;

        // stack peak과 pps789의 현재 찾는 단어가 같은지 queue에서 빼서 비교
        for (String word : pps789.split(" ")) {
            boolean findSameWord = false;
            for (Queue<String> parrot : parrots) {
                if (!parrot.isEmpty() && parrot.peek().equals(word)) {
                    parrot.poll();
                    findSameWord = true;
                    if (parrot.isEmpty()) {
                        parrots.remove(parrot);
                    }
                    break;
                }
            }

            if (!findSameWord) {
                possible = false;
                break;
            }
        }

        if (!parrots.isEmpty()) {
            possible = false;
        }

        System.out.println(possible ? "Possible" : "Impossible");
    }
}