package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

// 25-07-21 10min
// https://www.acmicpc.net/problem/21756
public class Eraser {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        List<Integer> list = IntStream.rangeClosed(1, total)
                .boxed()
                .toList();

        while (list.size() > 1) {
            list = IntStream.range(0, list.size())
                    .filter(i -> i % 2 == 1)
                    .mapToObj(list::get)
                    .toList();
        }

        // 내가 짠 로직
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 1; i <= total; i++) {
//            list.add(i);
//        }
//
//        while (true) {
//            if (list.size() == 1) {
//                break;
//            }
//            for (int i = list.size() - 1; i >= 0; i--) {
//                if (i % 2 == 0) {
//                    list.remove(i);
//                }
//            }
//        }

        System.out.println(list.get(0));
    }
}