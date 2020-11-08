package thisiscodingtest.greedy;

import java.util.Scanner;

public class 곱하기혹은더하기 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       String str=sc.next();

       //첫번째 문자를 숫자로 변경한 값을 대입
        long result=str.charAt(0)-'0';
        for(int i=1;i<str.length();i++){
            int num=str.charAt(i)-'0';
            if(num<=1||result<=1){
                result+=num;
            }
            else{
                result*=num;
            }
        }

        System.out.println(result);

        //처음에 나의 풀이
//        String s="02984";
//        int result=0;
//        char[] ans=s.toCharArray();
//
//        for(int i=0;i<s.length();i++){
//            if(ans[i]=='0'||ans[i]=='1'){
//                result+=(ans[i]-'0');
//            }else{
//                result*=(ans[i]-'0');
//            }
//        }
    }
}
