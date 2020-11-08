package baekjoon.greedy;

import java.util.Scanner;

//https://www.acmicpc.net/problem/5585
public class 거스름돈 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int[] data={500,100,50,10,5,1};
        int changes,result=0;

        changes=sc.nextInt();
        changes=1000-changes;

        for(int i=0;i<6;i++){
            result+=changes/data[i];
            changes%=data[i];
        }

        System.out.println(result);
    }
}
