package baekjoon.baekjoon_10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10989 {

    public static void main(String[] args) throws IOException {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[10001];

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 0; i < 10001; i++) {
            while (arr[i]-- > 0) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
