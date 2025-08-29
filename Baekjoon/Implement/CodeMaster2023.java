package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-08-29 3min
// https://www.acmicpc.net/problem/28235
public class CodeMaster2023 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sound = br.readLine();

        String scream;
        switch (sound) {
            case "SONGDO":
                scream = "HIGHSCHOOL";
                break;
            case "CODE":
                scream = "MASTER";
                break;
            case "2023":
                scream = "0611";
                break;
            default:
                scream = "CONTEST";
        }

        System.out.println(scream);
    }
}