package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

// 25-12-15 3min
// https://www.acmicpc.net/problem/30087
public class SeminarOfTheAgencyForPromotion {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<String, String> seminarClassMap = Map.of("Algorithm", "204",
                "DataAnalysis", "207",
                "ArtificialIntelligence", "302",
                "CyberSecurity", "B101",
                "Network", "303",
                "Startup", "501",
                "TestStrategy", "105");
        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            sb.append(seminarClassMap.get(br.readLine())).append("\n");
        }

        System.out.println(sb);
    }
}