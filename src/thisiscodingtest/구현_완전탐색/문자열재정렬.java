package thisiscodingtest.구현_완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 문자열재정렬 {
    public static String str;
    public static ArrayList<Character> result=new ArrayList<>();
    public static int value=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        //문자를 하나씩 확인
        for(int i=0;i<str.length();i++){
            //알파벳인 경우 결과 리스트에 삽입
            if(Character.isLetter(str.charAt(i))){
                result.add(str.charAt(i));
            }
            //숫자는 따로 더하기
            else{
                value+=str.charAt(i)-'0';
            }
        }

        //알파벳 오름차순 정렬
        Collections.sort(result);

        //알파벳을 차례대로 출력
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i));
        }

        //숫자가 하나라도 존재하는 경우 가장 뒤에 존재
        if(value!=0)
            System.out.println(value);

    }
}
