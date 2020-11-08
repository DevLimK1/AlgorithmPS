package programmers.kakao.recruit2020;

public class 괄호변환 {
    public String solution(String p) {
        return makeCorrect(p);
    }

    //문자열 w를 '올바른 문자열'로
    private String makeCorrect(String w) {
        if(w.length()==0)
            return "";

        int cut=division(w);
        String u=w.substring(0,cut);
        String v=w.substring(cut,w.length());

        if(isCorrect(u)){
            return u+makeCorrect(v);
        }else{
            String temp='('+makeCorrect(v)+')';
            u=u.substring(1,u.length()-1); //u의 첫번째 문자와 마지막 문자를 제거
            u=reverse(u); //문자열의 괄호방향을 뒤집어서
            return temp+u; //뒤에 붙인다.
        }
    }

    //문자열 w의 괄호방향 뒤집기
    private String reverse(String w) {
        StringBuffer ret=new StringBuffer();
        for(int i=0;i<w.length();i++){
            if(w.charAt(i)==')')
                ret.append('(');
            else
                ret.append(')');
        }
        return ret.toString();
    }

    //문자열 w의 옳은 문자열 여부
    private boolean isCorrect(String w) {
        int count=0;
        for(int i=0;i<w.length();i++){
            if(w.charAt(i)=='('){
                count++;
            }else
                count--;
            if(count<0)
                return false;
        }
        return count==0;
    }

    //w를 가장 작은 크기의 균형 문자열로 자를 수 있는 index 리턴
    private int division(String w) {
        int close=0,open=0;
        int i;
        for(i=0;i<w.length();i++){
            if(w.charAt(i)=='('){
                open++;
            }
            else
                close++;

            if(open==close)
                return i+1;
        }
        return i;
    }
}
