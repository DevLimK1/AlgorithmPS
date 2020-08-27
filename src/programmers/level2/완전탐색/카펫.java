package programmers.level2.완전탐색;


/*나중에 참고하면 좋을 코드
* https://hoho325.tistory.com/204*/
public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        boolean flag=false;
        //brown + yellow
        int sum=brown+yellow;

        //brown+ yellow 합한 수 약수를 구한다
        for(int i=3;i<=sum;i++){
            if(sum%i==0){
                flag=carpetCheck(answer,yellow,sum/i,i);
                if(flag)
                    return answer;
            }
        }

        //3이상인 약수중에 큰수에서 -2를 하고  yellow/(큰수-2) 를 하여 나누어 떨어지면 답이 된다.
        return answer;
    }

    private boolean carpetCheck(int[] answer,int yellow, int mok, int divisor) {
        int tmp=mok-2;

        if(!(yellow%tmp==0)){
            return false;
        }

        answer[0]=mok;
        answer[1]=divisor;
        return true;
    }
}
