package TIL.재귀;

import java.util.Scanner;

//https://codingdog.tistory.com/entry/%ED%95%98%EB%85%B8%EC%9D%B4%ED%83%91-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%9E%AC%EA%B7%80-%ED%98%B8%EC%B6%9C%EC%9D%98-%EB%8C%80%ED%91%9C%EC%A0%81%EC%9D%B8-%EB%AC%B8%EC%A0%9C%EB%A5%BC-%EA%B5%AC%ED%98%84%ED%95%B4-%EB%B4%85%EC%8B%9C%EB%8B%A4?category=1055061
public class 하노이탑 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        hanoi(1,2,3,n);
    }

    public static void hanoi(int from,int z,int to,int n){
        if(n==0)
            return;
        hanoi(from,to,z,n-1);
        System.out.printf("%d : %d -> %d\n",n,from,to);
        hanoi(z,from,to,n-1);
    }
}
 