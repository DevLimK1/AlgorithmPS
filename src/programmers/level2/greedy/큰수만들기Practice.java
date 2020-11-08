package programmers.level2.greedy;

import java.util.Stack;

public class 큰수만들기Practice {
    public String solution(String number, int k) {// k:삭제 갯수
        char[] result=new char[number.length()-k];
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<number.length();i++){
            char c=number.charAt(i);
            while(!stack.isEmpty()&&stack.peek()<c&&k-->0){
                stack.pop();
            }
            stack.push(c);
        }
        for(int i=0;i<result.length;i++){
            result[i]=stack.get(i);
        }


        return String.valueOf(result);
    }
}
