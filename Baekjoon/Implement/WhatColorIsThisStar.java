package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-11-11 5min
// https://www.acmicpc.net/problem/30676
public class WhatColorIsThisStar {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int waveLength = Integer.parseInt(br.readLine());
        //빨간색: 620nm 이상 780nm 이하
        //주황색: 590nm 이상 620nm 미만
        //노란색: 570nm 이상 590nm 미만
        //초록색: 495nm 이상 570nm 미만
        //파란색: 450nm 이상 495nm 미만
        //남색: 425nm 이상 450nm 미만
        //보라색: 380nm 이상 425nm 미만
        String color;
        if (waveLength >= 620) {
            color = "Red";
        } else if (waveLength >= 590) {
            color = "Orange";
        } else if (waveLength >= 570) {
            color = "Yellow";
        } else if (waveLength >= 495) {
            color = "Green";
        } else if (waveLength >= 450) {
            color = "Blue";
        } else if (waveLength >= 425) {
            color = "Indigo";
        } else {
            color = "Violet";
        }

        System.out.println(color);
    }
}