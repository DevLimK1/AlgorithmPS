package programmers.연습문제;

//https://programmers.co.kr/learn/courses/30/lessons/12909
public class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = false;
        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }else{
                count--;
            }
            if(count<0){
               break;
            }
        }

        if(count==0) {
            answer = true;
        }
        return answer;
    }
}
