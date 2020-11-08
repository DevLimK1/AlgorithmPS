package thisiscodingtest.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 모험가길드 {
    //mysolution
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int[] fear=new int[input];
        int size=fear.length;
        int answer=0;

        for(int i=0;i<input;i++){
            fear[i]=sc.nextInt();
        }

        Arrays.sort(fear);

        //ex. 1 1 1 2 2 3 3 4 4 라면
        // 9-4 =5
        // 5-2 =3
        // 3-1 =2
        // 2-1 =1
        // 1-1 =0 총 5그룹
        while(0<size){
            size-=fear[size-1];
            answer++;
        }

        System.out.println(answer);
    }
}
