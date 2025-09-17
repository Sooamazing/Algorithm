package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 25-09-17 30min
// https://www.acmicpc.net/problem/15970
public class DrawArrows {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());

        List<Integer>[] points = new ArrayList[total];
        for (int i = 0; i < total; i++) {
            points[i] = new ArrayList<>();
        }

        for (int i = 0; i < total; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int point = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());

            points[color - 1].add(point);
        }

        for (int i = 0; i < total; i++) {
            Collections.sort(points[i]);
        }

        int sum = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < points[i].size(); j++) {
                sum += getMinDistance(points[i], j);
            }
        }

        System.out.println(sum);
    }

    private static int getMinDistance(List<Integer> points, int currentIndex) {

        boolean isOutOfSize = points.size() <= currentIndex;
        if (isOutOfSize) {
            return 0;
        }

        boolean isFirst = currentIndex == 0;
        if (isFirst) {
            return points.get(1) - points.get(0);
        }

        boolean isLast = currentIndex == points.size() - 1;
        if (isLast) {
            return points.get(currentIndex) - points.get(currentIndex - 1);
        }

        int left = points.get(currentIndex) - points.get(currentIndex - 1);
        int right = points.get(currentIndex + 1) - points.get(currentIndex);
        return Math.min(left, right);
    }
}