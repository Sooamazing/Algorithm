package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NAndM4 {
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static char[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken()); //입력 완료

        arr = new char[2*M];
        for(int i=1;i<=M;i++){
            arr[2*i-1]=' ';
        }
        arr[2*M-1]='\n'; //초기화 완료

        //중복 허용, 비내림차순 수열
        backtracking(0, 1);

        //출력
        System.out.println(sb);

    }

    static void backtracking(int depth, int cur){

        //depth == M일 때 배열 저장
        if(depth==M){
            for(int i =0;i<2*M;i++){
                sb.append(arr[i]);
            }
            return;
        }

        //수열 loop
        for(int i=cur;i<N+1;i++){
            arr[depth*2]=(char)(i+'0');
            backtracking(depth+1, i);
        }
    }
}
