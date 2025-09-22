package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-22 10min
// https://www.acmicpc.net/problem/27294
public class HowMany {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // $T$가
        //$11$이하이면 아침 시간,
        //$12$이상
        //$16$ 이하이면 점심 시간, 그렇지 않으면 저녁 시간
        int time = Integer.parseInt(st.nextToken());
        boolean withAlcohol = Integer.parseInt(st.nextToken()) == 1;
        // 술하고 같이 초밥을 먹거나 점심 식사가 아닐 때는 초밥의 밥알을 $280$개로 하며,
        // 점심 식사이면서 술과 같이 먹지 않을때는 초밥의 밥알을 $320$개

        // $T$가
        //$11$이하이면 아침 시간,
        //$12$이상
        //$16$ 이하이면 점심 시간, 그렇지 않으면 저녁 시간

        boolean is280 = false;
        if (withAlcohol || time < 12 || time > 16) {
            is280 = true;
        }

        System.out.println(is280 ? 280 : 320);
    }
}